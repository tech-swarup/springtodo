package com.todoapp.todo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class Controller_Todo {
	@GetMapping(path = "/helloworld")
	public String helloWorld() {
		return "Swarup Hello World";
	}
	
	@GetMapping(path = "/firstbean")
	public FirstBean firstBean() {
		return new FirstBean("Today Todo");
	}
}
