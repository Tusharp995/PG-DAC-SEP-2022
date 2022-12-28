<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
</head>
<body>
	<form action="user_reg.jsp" method="post" >
		<div>
			<label>User Name:</label>
			<input type="text" name="uname" placeholder="Enter User Name" >
		</div>
		<div>
			<label>Password:</label>
			<input type="password" name="upass" placeholder="Enter Password" >
		</div>
		
		<button type="submit" >Register</button>
	</form>
	<a href="user_login_form.jsp" >Back</a> 
</body>
</html>