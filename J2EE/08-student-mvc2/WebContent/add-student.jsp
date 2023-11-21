<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello world</h1>

	<form action="StudentController">
		<div class="mb-3">
			<label for="firstName" class="form-label">First Name</label> <input
				type="text" class="form-control" id="firstName"
				placeholder="Enter your first name" name="firstName">
		</div>
		<div class="mb-3">
			<label for="lastName" class="form-label">Last Name</label> <input
				type="text" class="form-control" id="lastName"
				placeholder="Enter your last name" name="lastName">
		</div>
		<div class="mb-3">
			<label for="email" class="form-label">Email</label> <input
				type="email" class="form-control" id="email"
				placeholder="Enter your email" name="useremail">
		</div>
		<input type="hidden" name="action" value="add">
		<button type="submit" class="btn btn-primary">Submit</button>
</body>
</html>