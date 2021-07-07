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
import com.todapp.taskapplicattion.repository.TaskRepository;
import com.todapp.taskapplicattion.service.TaskService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GetTaskTestCase {

@Autowired
private TaskService service;
@MockBean
private TaskRepository repository;


@Test
public void getTasksTest() {
	when(repository.findAll()).thenReturn(Stream
			.of(new Task( "tree climbing", "Hunting games"),
			new Task( "meeting",  "All staff")).collect(Collectors.toList()));
	assertEquals(2, service.getUser().size());
	
}


}
