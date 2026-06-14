package com.budgettracker.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "expense")
public class ExpenseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String category;
	private String description;
	private BigDecimal amount;
	private LocalDate expenseDate;
	private LocalDateTime createdAt;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public LocalDate getExpenseDate() {
		return expenseDate;
	}
	public void setExpenseDate(LocalDate expenseDate) {
		this.expenseDate = expenseDate;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	@Override
	public String toString() {
		return "ExpenseEntity [id=" + id + ", category=" + category + ", description=" + description + ", amount="
				+ amount + ", expenseDate=" + expenseDate + ", createdAt=" + createdAt + "]";
	}
	public ExpenseEntity(Long id, String category, String description, BigDecimal amount, LocalDate expenseDate,
			LocalDateTime createdAt) {
		super();
		this.id = id;
		this.category = category;
		this.description = description;
		this.amount = amount;
		this.expenseDate = expenseDate;
		this.createdAt = createdAt;
	}
	public ExpenseEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
