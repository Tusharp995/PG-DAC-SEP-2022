package tushar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {

	public static void main(String[] args) {
		 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/cdac_db","root","sept22");
			Statement sc = con.createStatement();

				 int var = sc.executeUpdate("update Student set name='siddhesh',marks=90.18,dob='2000-06-19' where rno=115");
				System.out.println(var);
				sc.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		System.out.println("done");

	}

}


