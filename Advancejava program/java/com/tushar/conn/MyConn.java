package com.tushar.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConn {
	
	private final static String DRIVER_CLASS ="com.mysql.cj.jdbc.Driver";
	private final static String URL= "jdbc:mysql://localhost:3306/cdac_db";
	private final static String USERNAME ="root";
	private final static String PASSWORD = "sept22";
	
	private Connection con ;
	
	public Connection getConn() throws ClassNotFoundException, SQLException {
		if (con==null || con.isClosed()) {
			Class.forName(DRIVER_CLASS);
			
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
		}
		return con;
		
		
	}
	

}
