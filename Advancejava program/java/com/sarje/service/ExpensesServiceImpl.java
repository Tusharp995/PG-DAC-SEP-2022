package com.sarje.service;

import java.util.List;
import com.sarje.dao.ExpenseDao;
import com.sarje.dao.ExpenseDaoImpl;
import com.sarje.model.Expense;

public class ExpensesServiceImpl implements ExpenseService {
	
	private ExpenseDao expenseDao;

	public ExpensesServiceImpl() {
		expenseDao = new ExpenseDaoImpl(); 
		
	}

	@Override
	public void add(Expense expense) {
		expenseDao.save(expense);
	}

	@Override
	public List<Expense> getAll(int uid) {
		return expenseDao.selectAll(uid);
	}
}
	