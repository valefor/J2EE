package org.alc.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.alc.entity.UserWrapper;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

public class SecurityUtil {

	/**
     * Return the current Authentication object.
     */
    public static UserWrapper getUser() {
            final Authentication auth = SecurityContextHolder.getContext().getAuthentication();
            if (auth != null) {
                    try{
                            Object p = auth.getPrincipal();
                            if(p instanceof UserWrapper) return (UserWrapper) p;  
                    }catch(RuntimeException e){
                            e.printStackTrace();
                            throw e;
                    }
            }
            return null;
    }
    
    public static boolean isAnonymous() {
    	return (getUser()==null)?true:false;
    }
	
	public static boolean isAllGranted(String authorities) {
		if (null == authorities || "".equals(authorities)) {
			return false;
		}
		final Collection<? extends GrantedAuthority> granted = getPrincipalAuthorities();
		boolean isAllGranted = granted.containsAll(parseAuthorities(authorities)); 
        return isAllGranted;		
	}
	
	private static Collection<? extends GrantedAuthority> getPrincipalAuthorities() {
		Authentication currentUser = SecurityContextHolder.getContext().getAuthentication();
		if (null == currentUser) {
			return Collections.emptyList();
		}
		
		if (null == currentUser.getAuthorities() || currentUser.getAuthorities().isEmpty()) {
			return Collections.emptyList();
		}
		
		Collection<? extends GrantedAuthority> granted = currentUser.getAuthorities();
		
		return granted;
	}
	
    private static Collection<GrantedAuthority> parseAuthorities(String authorizationsString) {
        final ArrayList<GrantedAuthority> required = new ArrayList<GrantedAuthority>();
        final String[] roles = authorizationsString.split(",");

        for (int i = 0; i < roles.length; i++) {
                String role = roles[i].trim();
                required.add(new SimpleGrantedAuthority(role));
        }
        return required;
}
}
