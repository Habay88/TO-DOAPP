package com.todapp.taskapplicattion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todapp.taskapplicattion.model.Task;

import com.todapp.taskapplicattion.repository.TaskRepository;

@Service
public class TaskService {
@Autowired
private TaskRepository taskrepo;


public List<Task> getUser(){
	return taskrepo.findAll();
	
}
//test purpose
public List<Task> getTask(){
	List<Task> tasks = taskrepo.findAll();
System.out.println("Getting data from db:" + tasks);
	return taskrepo.findAll();
	
}

// save new task
public void save(Task task) {
	taskrepo.save(task);
}

//test
public Task saveTask(Task task) {
	return taskrepo.save(task);
}
}

//public User addUser(User user) {
//	return repository.save(user);
//}