package com.budgettracker.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.budgettracker.entity.ExpenseEntity;
import com.budgettracker.repository.ExpenseRepo;
import com.budgettracker.service.ExpenseService;

@Service
public class ExpenseServiceImpl implements ExpenseService{

	private final ExpenseRepo expenseRepo;
	
	ExpenseServiceImpl(ExpenseRepo expenseRepo){
		this.expenseRepo = expenseRepo;
	}
	@Override
	public ExpenseEntity addExpense(ExpenseEntity expense) {
		return expenseRepo.save(expense);
	}

	@Override
	public List<ExpenseEntity> getAllExpense() {
		return expenseRepo.findAll();
	}

	@Override
	public ExpenseEntity getExpenseById(Long id) {
		return expenseRepo.findById(id).orElseThrow(() -> new RuntimeException("Unable to find the data with id:" +id));
	}

	@Override
	public ExpenseEntity updateExpense(Long id, ExpenseEntity expense) {
		ExpenseEntity updatedExpense = expenseRepo.findById(id).orElseThrow(() -> new RuntimeException("Unable to update the data with id:" +id));
		
		updatedExpense.setCategory(expense.getCategory());
		updatedExpense.setDescription(expense.getDescription());
		updatedExpense.setAmount(expense.getAmount());
		updatedExpense.setExpenseDate(expense.getExpenseDate());
		updatedExpense.setCreatedAt(expense.getCreatedAt());
		
		return expenseRepo.save(updatedExpense);
	}

	@Override
	public void deleteExpense(Long id) {
		expenseRepo.deleteById(id);
		
	}
	
	

}
