package com.company.services.repository;

import com.company.entity.Expense;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends CrudRepository<Expense, String>,
    JpaSpecificationExecutor<Expense> {

  Expense getByExpenseId(Long expenseId);
}
