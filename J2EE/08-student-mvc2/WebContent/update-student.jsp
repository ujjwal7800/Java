<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello world</h1>
	<br>

	<form action="StudentController">
		<div class="mb-3">
			<label for="firstName" class="form-label">First Name</label> <input
				value="${student.firstName}" type="text" class="form-control"
				id="firstName" placeholder="Enter your first name" name="firstName">
		</div>
		<br>
		<div class="mb-3">
			<label for="lastName" class="form-label">Last Name</label> <input
				value="${student.lastName}" type="text" class="form-control"
				id="lastName" placeholder="Enter your last name" name="lastName">
		</div>
		<br>
		<div class="mb-3">
			<label for="email" class="form-label">Email</label> <input
				value="${student.email}" type="email" class="form-control"
				id="email" placeholder="Enter your email" name="useremail">
		</div>
		<br> <input type="hidden" name="action" value="update-save">
		<input type="hidden" name="id" value="${student.id}">

		<button type="submit" class="btn btn-primary">Submit</button>
		<br>
	</form>
</body>
</html>