package com.budgettracker.service;

import java.util.List;

import com.budgettracker.entity.ExpenseEntity;

public interface ExpenseService {
	
	public ExpenseEntity addExpense(ExpenseEntity expense);
	
	public List<ExpenseEntity> getAllExpense();
	
	public ExpenseEntity getExpenseById(Long id);
	
	public ExpenseEntity updateExpense(Long id, ExpenseEntity expense);
	
	public void deleteExpense(Long id);

}
