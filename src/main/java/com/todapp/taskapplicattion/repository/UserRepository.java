package com.todapp.taskapplicattion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todapp.taskapplicattion.model.Task;
import com.todapp.taskapplicattion.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
 
	User findByUsername(String username);
	
}
