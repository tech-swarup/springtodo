package com.todoapp.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.todoapp.todo.model.Todo;
import com.todoapp.todo.service.ExpenseService;

@RestController
@CrossOrigin(origins = "*")
public class Controller_Todo {
    @Autowired
    ExpenseService expenseService;
    
    @GetMapping("/expenses")
    public ResponseEntity<List<Todo>> get(){
        List<Todo> expenses = expenseService.findAll();
        return new ResponseEntity<List<Todo>>(expenses, HttpStatus.OK);
    }
    
    @PostMapping("/expenses")
    public ResponseEntity<Todo> save(@RequestBody Todo expense){
    	Todo expenseOne = expenseService.save(expense);
        return new ResponseEntity<Todo>(expenseOne, HttpStatus.OK);
    }
    
	@GetMapping(path = "/helloworld")
	public String helloWorld() {
		return "Swarup Hello World";
	}
	
	@GetMapping(path = "/firstbean")
	public FirstBean firstBean() {
		return new FirstBean("Today Todo");
	}
}
