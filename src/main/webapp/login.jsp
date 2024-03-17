<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin login</title>
</head>
<body>
	<h2>Admin Page</h2>
	<form action="loginServlet" method=post>
		Enter username <input type="text" name="username"><br>
		Enter password <input type="password" name="password"><br>
		<input type="submit" value="Login">
	</form>
</body>
</html>