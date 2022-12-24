package dec21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertDataPrepare {

public static void main(String[] args) {
		
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your PRN");
		int rno = obj.nextInt();
		System.out.println("Enter your name");
		String name = obj.next();
		System.out.println("Enter your marks");
		float marks = obj.nextFloat();
		System.out.println("Enter your dob");
		String dob = obj.next();
			 
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/cdac_db","root","sept22");
				PreparedStatement sc = con.prepareStatement("insert into Student values(?,?,?,?)");
					sc.setInt(1, rno);
					sc.setString(2, name);
					sc.setFloat(3, marks);
					sc.setString(4, dob);
					 int var = sc.executeUpdate();
					System.out.println(var);
					sc.close();
				con.close();
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			System.out.println("done");


	}

}