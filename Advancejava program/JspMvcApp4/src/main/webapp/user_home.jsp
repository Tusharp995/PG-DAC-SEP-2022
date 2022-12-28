<%@page import="com.sarje.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	User user = (User)session.getAttribute("user");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Home</title>
</head>
<body>
	<%@ include file="user_menu.jsp" %>
	<h3>Logged In User : <%=user.getUname()%></h3>
</body>
</html>