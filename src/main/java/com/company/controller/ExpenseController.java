package com.company.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.company.entity.Expense;
import com.company.services.api.ExpenseService;

@RestController
@RequestMapping("user")
public class ExpenseController {
	@Autowired
	private ExpenseService expenseService;
	
	@GetMapping("expenses/{id}")
	public ResponseEntity<Expense> getExpenseById(@PathVariable("id") Integer id) {
		Expense expense = expenseService.getExpenseById(id);
		return new ResponseEntity<Expense>(expense, HttpStatus.OK);
	}
	@GetMapping("expenses")
	public ResponseEntity<List<Expense>> getAllExpenses() {
		List<Expense> list = expenseService.getAllExpenses();
		return new ResponseEntity<List<Expense>>(list, HttpStatus.OK);
	}
	@PostMapping("expenses")
	public ResponseEntity<Void> addExpense(@RequestBody Expense expense, UriComponentsBuilder builder) {
        boolean flag = expenseService.addExpense(expense);
        if (flag == false) {
        	return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/expense/{id}").buildAndExpand(expense.getExpenseId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	@PutMapping("expenses")
	public ResponseEntity<Expense> updateExpense(@RequestBody Expense expense) {
		expenseService.updateExpense(expense);
		return new ResponseEntity<Expense>(expense, HttpStatus.OK);
	}
	@DeleteMapping("expenses/{id}")
	public ResponseEntity<Void> deleteExpense(@PathVariable("id") Integer id) {
		expenseService.deleteExpense(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}	

} 