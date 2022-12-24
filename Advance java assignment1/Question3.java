package assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Question3 {


	public static void main(String[] args) {
		 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/cdac_db","root","sept22");
			Statement sc = con.createStatement();

				 ResultSet result = sc.executeQuery("select * from student");
//				System.out.println(var);
				 while(result.next()) {
					 System.out.println(result.getInt(1)+" "+result.getString(2)+" "+result.getFloat(3)+" "+result.getString(4));
				 }
				sc.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		System.out.println("done");

	}

}