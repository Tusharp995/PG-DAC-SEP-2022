package com.sarje.dao;

import java.util.List;


import com.sarje.model.Expense;

public interface ExpenseDao {
	void save(Expense expense);
	List<Expense> selectAll(int uid);
}

