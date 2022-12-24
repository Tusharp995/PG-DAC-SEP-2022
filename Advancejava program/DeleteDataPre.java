package dec21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteDataPre {

	public static void main(String[] args) {
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter your PRN");
	int rno = obj.nextInt();		 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/cdac_db","root","sept22");
			PreparedStatement sc = con.prepareStatement("delete from Student where rno = ?");
				sc.setInt(1, rno);
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