package com.company.services;

import com.company.entity.Expense;
import com.company.services.api.ExpenseService;
import com.company.services.repository.ExpenseRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpenseServiceImpl implements ExpenseService {

  @Autowired
  private ExpenseRepository expenseRepository;

  @Override
  public Expense getExpenseById(long expenseId) {
    Expense obj = expenseRepository.getByExpenseId(expenseId);
    return obj;
  }

  @Override
  public List<Expense> getAllExpenses() {
    List<Expense> list = new ArrayList<>();
    expenseRepository.findAll().forEach(e -> list.add(e));
    return list;
  }

  @Override
  public synchronized boolean addExpense(Expense expense) {
    expenseRepository.save(expense);
    return true;
  }

  @Override
  public void updateExpense(Expense expense) {
    expenseRepository.save(expense);
  }

  @Override
  public void deleteExpense(int expenseId) {
    expenseRepository.delete(getExpenseById(expenseId));
  }
}
