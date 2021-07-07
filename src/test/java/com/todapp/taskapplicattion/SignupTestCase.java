package com.todapp.taskapplicattion;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.todapp.taskapplicattion.model.Task;
import com.todapp.taskapplicattion.model.User;
import com.todapp.taskapplicattion.repository.TaskRepository;
import com.todapp.taskapplicattion.repository.UserRepository;
import com.todapp.taskapplicattion.service.TaskService;
import com.todapp.taskapplicattion.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SignupTestCase {

@Autowired
private UserService service;
@MockBean
private UserRepository repository;


@Test
public void signupTest() {
	User user = new User( "monday", "friday","username","qwerty");
	when(repository.save(user)).thenReturn(user);
	assertEquals(user, service.saveUser(user));
}
	
}
