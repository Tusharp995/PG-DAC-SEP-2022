<%@page import="com.sarje.service.ExpensesServiceImpl"%>
<%@page import="com.sarje.service.ExpenseService"%>
<%@page import="com.sarje.model.Expense"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	ExpenseService expenseService = new ExpensesServiceImpl();
	List<Expense> expenses = expenseService.getAll(0);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Expense List</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Item</th>
				<th>Price</th>
				<th>Quantity</th>
				<th>Date</th>
				
			</tr>
		</thead>
		<tbody>
			<% for(Expense expense : expenses){ %>
				<tr>
					<td><%=expense.getItem()%></td>
					<td><%=expense.getPrice()%></td>
					<td><%=expense.getQuantity()%></td>
					<td><%=expense.getEdate()%></td>
				</tr>
			<% } %>
		</tbody>
	</table>
</body>
</html>