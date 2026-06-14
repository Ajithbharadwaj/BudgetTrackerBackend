package com.budgettracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.budgettracker.entity.IncomeEntity;
import com.budgettracker.serviceImpl.IncomeServiceImpl;

@RestController
@RequestMapping("/income")
public class IncomeController {
	
	private final IncomeServiceImpl incomeServiceImpl;

	IncomeController(IncomeServiceImpl incomeServiceImpl) {
		this.incomeServiceImpl = incomeServiceImpl;
	}
	
	// Add Income
	@PostMapping
	public IncomeEntity addIncome(@RequestBody IncomeEntity income) {
		return incomeServiceImpl.addIncome(income);
	}
	
	// Get all income records
	@GetMapping
	public List<IncomeEntity> getAllIncomes(){
		return incomeServiceImpl.getAllIncome();
	}
	
	// Get income by id
	@GetMapping("/{id}")
	public IncomeEntity getIncomeById(@PathVariable Long id) {
		return incomeServiceImpl.getIncomeById(id);
	}
	
	// Delete income record by id
	@DeleteMapping("/{id}")
	public void deleteIncomeById(@PathVariable Long id) {
		incomeServiceImpl.deleteIncome(id);
	}
	
	@PutMapping("/{id}")
	public IncomeEntity updateIncome(@PathVariable Long id, @RequestBody IncomeEntity income) {
		return incomeServiceImpl.updateIncome(id, income);
	}
}
