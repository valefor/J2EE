package org.alc.services.impl;

import org.alc.dao.impl.UserDao;
import org.alc.entity.User;
import org.alc.entity.UserWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	UserDao userDao;
	
	@Override
	public UserDetails loadUserByUsername(String userName)
			throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = userDao.findByName(userName);
		if(user==null){
            System.out.println(">>> cannot find user: "+userName);
            throw new UsernameNotFoundException("cannot found user: "+userName);
		}
		
		if (user.getAuthorities().isEmpty()){
			
		}
		System.out.println("["+getClass().getName()+"]Authorities: " + user.getAuthorities());
		return new UserWrapper(user.getName(),user.getPassword(),user.getAuthorities());
	}

}
