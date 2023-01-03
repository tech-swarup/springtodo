package com.todoapp.todo.service;

import java.util.List;
import com.todoapp.todo.model.Todo;

public interface ExpenseService {
	List<Todo> findAll();	// Display Tuple
	Todo save(Todo expense);	// Save Tuple
}
