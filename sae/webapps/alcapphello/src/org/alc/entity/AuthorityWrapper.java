package org.alc.entity;

import org.springframework.security.core.GrantedAuthority;

/*
 * This class <AuthoritiesWrapper> is used to wrap customized Authority class to adapt 
 * Standard Spring Security API interfaces: GrantedAuthority
 *
 */
public class AuthorityWrapper implements GrantedAuthority {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Authority auth;

	public AuthorityWrapper(Authority auth) {
		super();
		this.auth = auth;
	}

	@Override
	public String getAuthority() {
		return auth.getRole();
	}
	
	@Override
	public String toString() {
		return auth.getRole();
	}

}
