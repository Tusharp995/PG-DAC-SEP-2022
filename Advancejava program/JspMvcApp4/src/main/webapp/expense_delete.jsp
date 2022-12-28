<%@page import="com.sarje.service.ExpensesServiceImpl"%>
<%@page import="com.sarje.service.ExpenseService"%>
<%
	String p1 = request.getParameter("id");
	int id = Integer.parseInt(p1);
	ExpenseService expenseService = new ExpensesServiceImpl();
	expenseService.removeById(id);
	response.sendRedirect("expense_list.jsp");
%>