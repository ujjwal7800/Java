<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet" type="text/css" href="login.css">

<meta charset="ISO-8859-1">
<title>Banking Application</title>
</head>

<body>
	<br>
	<br>
	<center class="head">
		<h1>Welcome to our Banking App</h1>
	</center>
	<div class="container p-3 border  bg-light text-dark ">
		<form name="registration" action="LoginController"
			onsubmit="return formValidation();" method="post">
			<center class="formhead">
				<h1>Login</h1>
			</center>
			<input type="radio" id="admin" name="userType" value="ADMIN" required>
			<label for="admin">ADMIN</label> 
			<input type="radio" id="user" name="userType" value="USER" required> 
			<label for="user">USER</label>
			
			<br><br> 
			<label for="email">Email : </label> 
			<input type="text" class="w-100" name="email" id="emails" value="" required> 
			
			<br><br>
			<label for="password">Password :</label> 
			<input type="password" class="w-100" name="password" id="pass" value="" required>
			
			<br> <br>
			<button type="submit" class="btn btn-secondary" value="login">Login</button>
			<c:out value="${msg}" />
		</form>
	</div>

</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</html>
