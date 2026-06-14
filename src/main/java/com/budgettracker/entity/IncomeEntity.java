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
@Table(name = "income")
public class IncomeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String source;
	private BigDecimal amount;
	private LocalDate incomeDate;
	private LocalDateTime createdAt;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public LocalDate getIncomeDate() {
		return incomeDate;
	}
	public void setIncomeDate(LocalDate incomeDate) {
		this.incomeDate = incomeDate;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	@Override
	public String toString() {
		return "IncomeEntity [id=" + id + ", source=" + source + ", amount=" + amount + ", incomeDate=" + incomeDate
				+ ", createdAt=" + createdAt + "]";
	}
	public IncomeEntity(Long id, String source, BigDecimal amount, LocalDate incomeDate, LocalDateTime createdAt) {
		super();
		this.id = id;
		this.source = source;
		this.amount = amount;
		this.incomeDate = incomeDate;
		this.createdAt = createdAt;
	}
	public IncomeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}