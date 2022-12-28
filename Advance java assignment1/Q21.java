package assignmentQ19;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Q21")
public class Q21 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			response.setContentType("text/html");
			PrintWriter obj = response.getWriter();
			obj.print("<h1 style='color:red'>CREATING GUI IS COMPLEX USING SERVLET</h1>");
			obj.flush();
			obj.close();
	}

}
