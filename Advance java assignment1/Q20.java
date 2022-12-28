package assignmentQ19;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Q20")
public class Q20 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			resp.setContentType("text/html");
			PrintWriter obj = resp.getWriter();
		    LocalDate myDateObj = LocalDate.now();
		    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		    String formattedDate = myDateObj.format(myFormatObj);
		   obj.print(formattedDate);
			obj.flush();
			obj.close();
			
//			  LocalTime myObj = LocalTime.now();
//			    System.out.println(myObj);
		
	}

}
