package dec21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateDataSca {

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
				Statement sc = con.createStatement();

					 int var = sc.executeUpdate("update into Student values("+rno+",'"+name+"',"+marks+",'"+dob+"')");
					System.out.println(var);
					sc.close();
				con.close();
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			System.out.println("done");


	}

}
		