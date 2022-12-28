package com.tushar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.tushar.conn.MyConn;
import com.tushar.model.Expense;

public class ExpenseDaoImpl implements ExpenseDao{

	
		private MyConn myConn;
		
		public ExpenseDaoImpl() {
			myConn = new MyConn();
			
		}

		@Override
		public void save(Expense expense) {
			try {
				Connection con = myConn.getConn();
				PreparedStatement s = con.prepareStatement("insert into Expense(item,price,quantity,edate,uid) values (?,?,?,?,?)") ;
				s.setString(1, expense.getItem());
				s.setFloat(2, expense.getPrice());
				s.setInt(3, expense.getQuantity());
				s.setString(4, expense.getEdate());
				s.setInt(5, expense.getUid());
				int i = s.executeUpdate();
				s.close();
				con.close();
				
			} catch (ClassNotFoundException | SQLException e) {
			
				e.printStackTrace();
			}
			
		}
	
	}


