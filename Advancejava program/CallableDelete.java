package dec21;

	import java.sql.CallableStatement;
import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.util.Scanner;


public class CallableDelete {

	
		public static void main(String[] args) {
			
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your PRN");
		int rno = obj.nextInt();		 
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/cdac_db","root","sept22");
				CallableStatement sc = con.prepareCall("call proce1(?)");
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