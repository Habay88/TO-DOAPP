package com.todapp.taskapplicattion.model;

import javax.persistence.*;

@Entity
@Table(name = "tasks")
public class Task {
     
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     
    @Column(nullable = false, unique = true, length = 45)
    private String name;
     
    @Column(nullable = false, length = 64)
    private String description;
     
   

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Task(String name, String description) {
		
		this.name = name;
		this.description = description;
	}

	public Task() {
		
	}

	

    
}