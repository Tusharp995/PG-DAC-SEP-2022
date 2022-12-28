package assignmentQ19;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Q22")
public class Q22 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain");
		PrintWriter obj = response.getWriter();
		obj.print("YOU SELECTED GET TYPE REQUEST");
		obj.flush();
		obj.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain");
		PrintWriter obj = response.getWriter();
		obj.print("YOU SELECTED POST TYPE REQUEST");
		obj.flush();
		obj.close();
	}
	}

