package com.company.services.api;

import com.company.entity.Expense;
import java.util.List;

public interface ExpenseService {

  List<Expense> getAllExpenses();

  Expense getExpenseById(long expenseId);

  boolean addExpense(Expense expense);

  void updateExpense(Expense expense);

  void deleteExpense(int expenseId);
}
