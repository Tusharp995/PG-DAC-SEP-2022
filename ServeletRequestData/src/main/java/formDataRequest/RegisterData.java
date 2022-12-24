package formDataRequest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterData")
public class RegisterData extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String langu[] = request.getParameterValues("language");
		String place = request.getParameter("city");
		
		response.setContentType("text/html");
		PrintWriter obj = response.getWriter();
		obj.print("<h1>"+name+"</h1>");
		obj.print("<h1>"+password+"</h1>");
		obj.print("<h1>"+gender+"</h1>");
		
		for(int i=0;i<langu.length;i++) 
		  obj.print("<h1>"+langu[i]+"</h1>");
		
		obj.print("<h1>"+place+"</h1>");
		obj.flush();
		obj.close();
	}

}
