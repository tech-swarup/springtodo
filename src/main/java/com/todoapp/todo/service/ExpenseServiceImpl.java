package com.todoapp.todo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todoapp.todo.model.Todo;
import com.todoapp.todo.repository.ExpenseRepository;

@Service
public class ExpenseServiceImpl implements ExpenseService {
    @Autowired
    ExpenseRepository expenseRepository;
    
	@Override
	public List<Todo> findAll() {
		return expenseRepository.findAll();
	}
	
    @Override
    public Todo save(Todo expense) {
        expenseRepository.save(expense);
        return expense;
    }

}
