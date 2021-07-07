package com.todapp.taskapplicattion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todapp.taskapplicattion.model.Task;


public interface TaskRepository extends JpaRepository<Task, Long> {
 
}
