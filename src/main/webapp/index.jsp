<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Doctor Admin</title>
</head>
<body>
	<h2>Login to admin</h2>
	<br>

	<a href="login.jsp"><button>Admin</button></a>
	<br>
	<br>
	<hr>
	<form action="searchServlet">
		Search by Speciality <input type="text" name="speciality" placeholder="speciality"><br> <br> 
		<input type="submit" value="Search">
	</form>
</body>
</html>
