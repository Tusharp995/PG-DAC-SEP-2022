package tushar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		 
		try {
			//load driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Create connection
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/cdac_db","root","sept22");
			//create query statement
			Statement sc = con.createStatement();
			//execute query
			boolean flag = sc.execute("create table Student(rno int primary key, name varchar(25), marks float(10,2), dob date)");
			System.out.println(flag);
			sc.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		System.out.println("done");

	}

}
