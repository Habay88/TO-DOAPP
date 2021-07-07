package com.todapp.taskapplicattion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.todapp.taskapplicattion.model.Task;

import com.todapp.taskapplicattion.service.TaskService;

@Controller
public class TaskController {
	
	@Autowired
	private TaskService taskservice;
	

	 @GetMapping("/tasks")
		public String getTasks(Model model) {
		 List<Task> taskList = taskservice.getUser(); 
		 model.addAttribute("tasks", taskList);
			return "task";
		}
	 @PostMapping("/tasks/addNew")
	 public String addNewTask(Task task) {
		 taskservice.save(task);
		 return "redirect:/tasks";
	 }
}
