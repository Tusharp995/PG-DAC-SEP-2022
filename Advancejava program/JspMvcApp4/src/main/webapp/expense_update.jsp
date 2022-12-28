
<%@page import="com.sarje.service.ExpenseService"%>
<%@page import="com.sarje.service.ExpensesServiceImpl"%>
<jsp:useBean id="expense" class="com.sarje.model.Expense"></jsp:useBean>
<jsp:setProperty property="*" name="expense"/>

<% 
ExpenseService expenseService = new ExpensesServiceImpl();
expenseService.modify(expense);
response.sendRedirect("expense_list.jsp");


%>