package com.budgettracker.service;

import java.util.List;

import com.budgettracker.entity.IncomeEntity;

public interface IncomeService {
	
	public IncomeEntity addIncome(IncomeEntity income);
	
	public List<IncomeEntity> getAllIncome();
	
	public IncomeEntity getIncomeById(Long id);
	
	public IncomeEntity updateIncome(Long id, IncomeEntity income);
	
	public void deleteIncome(Long id);
}
