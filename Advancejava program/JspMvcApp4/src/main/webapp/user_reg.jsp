<%@page import="com.sarje.service.UserServiceImpl"%>
<%@page import="com.sarje.service.UserService"%>
<jsp:useBean id="user" class="com.sarje.model.User" ></jsp:useBean>
<jsp:setProperty property="*" name="user"/>
<%
	UserService userService = new UserServiceImpl();
	userService.register(user);
	response.sendRedirect("user_login_form.jsp"); 
%>