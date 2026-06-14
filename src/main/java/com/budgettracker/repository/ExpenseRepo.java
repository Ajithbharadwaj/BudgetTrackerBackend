package com.budgettracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.budgettracker.entity.ExpenseEntity;

public interface ExpenseRepo extends JpaRepository<ExpenseEntity, Long> {

}
