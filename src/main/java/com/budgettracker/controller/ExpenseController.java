package com.budgettracker.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.budgettracker.entity.ExpenseEntity;
import com.budgettracker.serviceImpl.ExpenseServiceImpl;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {

	private final ExpenseServiceImpl expenseServiceImpl;

	ExpenseController(ExpenseServiceImpl expenseServiceImpl) {
		this.expenseServiceImpl = expenseServiceImpl;
	}
	
	@GetMapping
	public List<ExpenseEntity> getAllExpenses() {
		return expenseServiceImpl.getAllExpense();
	}
	
	@GetMapping("/{id}")
	public ExpenseEntity getExpenseById(@PathVariable Long id) {
		return expenseServiceImpl.getExpenseById(id);
	}
	
	@PostMapping
	public ExpenseEntity addExpenses(@RequestBody ExpenseEntity expenseEntity) {
		return expenseServiceImpl.addExpense(expenseEntity);
	}
	
	@PutMapping("/{id}")
	public ExpenseEntity updateExpenses(@PathVariable Long id, @RequestBody ExpenseEntity expenseEntity) {
		return expenseServiceImpl.updateExpense(id, expenseEntity);
	}
	
	@DeleteMapping("/{id}")
	public void deleteExpenses(@PathVariable Long id) {
		expenseServiceImpl.deleteExpense(id);
	}

}
