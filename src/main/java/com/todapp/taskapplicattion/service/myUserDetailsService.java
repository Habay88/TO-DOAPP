package com.todapp.taskapplicattion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.todapp.taskapplicattion.model.User;
import com.todapp.taskapplicattion.model.UserPrincipal;
import com.todapp.taskapplicattion.repository.UserRepository;

@Service
public class myUserDetailsService implements UserDetailsService {
@Autowired 
UserRepository userrepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = userrepo.findByUsername(username);
		
		if(user == null) {
			throw new UsernameNotFoundException(" User not found");
		}
		return new 	UserPrincipal(user);
	}

}
