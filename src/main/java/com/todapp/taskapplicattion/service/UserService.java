package com.todapp.taskapplicattion.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.todapp.taskapplicattion.model.User;
import com.todapp.taskapplicattion.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
   @Autowired
  private BCryptPasswordEncoder encoder;
	public void save(User user) {
	user.setPassword(encoder.encode(user.getPassword()));
		userRepository.save(user);	
	}

	
}

