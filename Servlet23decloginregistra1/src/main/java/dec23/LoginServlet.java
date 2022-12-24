package dec23;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname= request.getParameter("username");
		String pass =request.getParameter("password");
			boolean flag=false;
			
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/cdac_db","root","sept22");
			PreparedStatement s =con.prepareStatement("select * from user where uname=? and pass=?");
			s.setString(1, uname);
			s.setString(2, pass);
			ResultSet rs = s.executeQuery();
			
			if(rs.next()) {
				flag=true;
			}
			s.close();
			con.close();		
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		if(flag) {
		response.sendRedirect("HomeServlet");
		}
		else {
			response.sendRedirect("Loginform.html");
		}
	}

}
