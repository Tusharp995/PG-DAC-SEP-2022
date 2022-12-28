<%@page import="com.sarje.service.UserServiceImpl"%>
<%@page import="com.sarje.service.UserService"%>
<jsp:useBean id="user" class="com.sarje.model.User" scope="session" ></jsp:useBean>
<jsp:setProperty property="*" name="user"/>
<%
	UserService userService = new UserServiceImpl();
	boolean b = userService.login(user);
	if(b){
		response.sendRedirect("user_home.jsp");
	}else{
		response.sendRedirect("user_login_form.jsp?msg=wrong user name/password"); 
	}
%>