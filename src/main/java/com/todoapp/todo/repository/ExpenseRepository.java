package com.todoapp.todo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todoapp.todo.model.Todo;

@Repository
public interface ExpenseRepository extends JpaRepository<Todo, Long> {
	public List<Todo> findByExpense(String expense);
}
