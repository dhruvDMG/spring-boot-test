package com.company.services.api;

import java.util.List;


import com.company.entity.Expense;

public interface ExpenseService {

	List<Expense> getAllExpenses();
	
    Expense getExpenseById(long expenseId);
    
    boolean addExpense(Expense expense);
    
    void updateExpense(Expense expense);
    
    void deleteExpense(int expenseId);
}
