package servletDemo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myself")
public class LifeCycle extends HttpServlet{
	
	@Override
	public void init() throws ServletException {
	System.out.println("Init() is called");
	}
	
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("Service method is called");
	}
	@Override
	public void destroy() {
		System.out.println("destroy method is called");
		}

}
