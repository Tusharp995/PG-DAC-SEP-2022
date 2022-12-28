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

	@Override
	public void removeById(int id) {
		expenseDao.deleteById(id);
		
	}

	@Override
	public Expense getById(int id) {
		// TODO Auto-generated method stub
		return expenseDao.selectById(id);
	}
	
	@Override
	public void modify(Expense expense) {
		expenseDao.update(expense);
	}
}
	