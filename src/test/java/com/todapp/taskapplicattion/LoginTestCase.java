package com.todapp.taskapplicattion;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import com.todapp.taskapplicattion.model.Task;
import com.todapp.taskapplicattion.model.User;
import com.todapp.taskapplicattion.repository.UserRepository;
import com.todapp.taskapplicattion.service.UserService;

import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class LoginTestCase {

@Autowired
private UserService service;
@Autowired
private UserRepository repository;

@Test
public void getUserloginTest() {
	when(repository.findAll()).thenReturn(Stream
			.of(new User( "john", "doe"),
			new User( "lagos",  "state")).collect(Collectors.toList()));
	assertEquals(2, service.getUser().size());
		
}
}


	
