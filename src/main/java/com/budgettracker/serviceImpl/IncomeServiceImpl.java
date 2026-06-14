package com.budgettracker.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.budgettracker.entity.IncomeEntity;
import com.budgettracker.repository.IncomeRepo;
import com.budgettracker.service.IncomeService;

@Service
public class IncomeServiceImpl implements IncomeService{
	
	private final IncomeRepo incomeRepo;

	IncomeServiceImpl(IncomeRepo incomeRepo) {
		this.incomeRepo = incomeRepo;
	}

	@Override
	public IncomeEntity addIncome(IncomeEntity income) {
		
		return incomeRepo.save(income);
	}

	@Override
	public List<IncomeEntity> getAllIncome() {
		return incomeRepo.findAll();
	}

	@Override
	public IncomeEntity getIncomeById(Long id) {
		return incomeRepo.findById(id).orElseThrow(()-> new RuntimeException("Unable to fetch the income details of id: "+id));
	}

	@Override
	public IncomeEntity updateIncome(Long id, IncomeEntity income) {
		IncomeEntity updatedResult = incomeRepo.findById(id).orElseThrow(()-> new RuntimeException("Unable to update the record at the moment"));
		
		updatedResult.setSource(income.getSource());
		updatedResult.setAmount(income.getAmount());
		updatedResult.setIncomeDate(income.getIncomeDate());
		updatedResult.setCreatedAt(income.getCreatedAt());
		return incomeRepo.save(updatedResult);
	}

	@Override
	public void deleteIncome(Long id) {
		incomeRepo.deleteById(id);
	}

}
