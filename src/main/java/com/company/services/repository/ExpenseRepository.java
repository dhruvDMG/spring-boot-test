package com.company.services.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.company.entity.Expense;

@Repository
public interface ExpenseRepository extends CrudRepository<Expense, String>, JpaSpecificationExecutor<Expense> {
	
	Expense getByExpenseId(long expenseId);
}
