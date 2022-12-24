package dec21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateDataPre {

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
				PreparedStatement sc = con.prepareStatement("update Student set name=?, marks=?, dob=? where rno= ? ");
					sc.setString(1, name);
					sc.setFloat(2, marks);
					sc.setString(3, dob);
					sc.setInt(4, rno);
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