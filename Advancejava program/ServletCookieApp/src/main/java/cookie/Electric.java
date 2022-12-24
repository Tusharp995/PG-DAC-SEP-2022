package cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Electric")
public class Electric extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter obj  = response.getWriter();
		obj.print("<html>");
		obj.print("<head>");
		obj.print("<title>Electric</title>");
		obj.print("</head>");
		obj.print("<body>");
		obj.print("<form action='Electronic' >");
		obj.print("<h2><input type='checkbox' name='item1' value='fan' >FAN</h2>");
		obj.print("<h2><input type='checkbox' name='item2' value='cooler' >COOLER</h2>");
		obj.print("<h2><button type='submit' >Next</button></h2>");
		obj.print("</form>");
		obj.print("</body>");
		obj.print("</html>");
	}

}
