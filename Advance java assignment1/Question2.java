package assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Question2 {

	public static void main(String[] args) {
		 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/cdac_db","root","sept22");
			Statement sc = con.createStatement();

				 int var = sc.executeUpdate("insert into Student values(119,'sOUVICK',88.88,'2022-12-19'),(124,'TIMY',86.88,'1996-12-11'),(121,'sUBRATA',67.88,'1996-11-23'),(115,'koli',55.88,'2000-11-23')");
				System.out.println(var);
				sc.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		System.out.println("done");

	}

}
