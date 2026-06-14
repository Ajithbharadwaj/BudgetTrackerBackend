package com.budgettracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.budgettracker.entity.IncomeEntity;

public interface IncomeRepo extends JpaRepository<IncomeEntity, Long>{

}
