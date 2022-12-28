<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Form</title>
</head>
<body>
	<form action="user_login.jsp" method="post" >
		<div style="color: red;font-size: 10" >
			<%=(request.getParameter("msg")!=null )?request.getParameter("msg"):"" %>
		</div>
		<div>
			<label>User Name:</label>
			<input type="text" name="uname" placeholder="Enter User Name" >
		</div>
		<div>
			<label>Password:</label>
			<input type="password" name="upass" placeholder="Enter Password" >
		</div>
		
		<button type="submit" >Login</button>
	</form>
	<a href="user_reg_form.jsp" >New User</a> 
</body>
</html>