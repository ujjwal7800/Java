<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<!--  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Employee List</title>
    <link
        href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
        rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
        crossorigin="anonymous"> -->
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Database</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">
		<h3>Employee List</h3>
		<form action="EmployeeController" method="get">
			<select class="form-select" name="search-criteria">
				<option value="id">ID</option>
				<option value="first-name">First Name</option>
				<option value="last-name">Last Name</option>
				<option value="email">Email</option>
				<option value="gender">Gender</option>
				<option value="dob">Date of Birth</option>
				<option value="job-title">Job Title</option>
				<option value="department">Department</option>
			</select> <input type="hidden" name="action" value="search"> <input
				type="text" class="form-control" placeholder="Search term"
				name="search-term">
			<button type="submit" class="btn btn-primary">Search</button>
		</form>

		<!-- Add the form with action and method attributes -->
		<form action="EmployeeController" method="get">
			<table class="table table-striped table-hover">
				<thead>
					<tr>
						<th>ID</th>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Email</th>
						<th>Gender</th>
						<th>DOB</th>
						<th>Job Title</th>
						<th>Department</th>
						<th>Action</th>
						<th>Delete</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="employee" items="${employeeList}">
						<tr>
							<td>${employee.id}</td>
							<td>${employee.firstName}</td>
							<td>${employee.lastName}</td>
							<td>${employee.email}</td>
							<td>${employee.gender}</td>
							<td>${employee.dob}</td>
							<td>${employee.jobTitle}</td>
							<td>${employee.department}</td>
							<td><a
								href="EmployeeController?action=update&id=${employee.id}"
								class="btn btn-secondary">Update</a></td>
							<td><a
								href="EmployeeController?action=delete&id=${employee.id}"
								class="btn btn-danger">Delete</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>

			<!-- Add a hidden input field for the action parameter -->
			<input type="hidden" name="action" value="list">

			<button type="submit" class="btn btn-primary">Refresh List</button>
		</form>

		<a href="add-employee.jsp" class="btn btn-primary">Add Employee</a>
	</div>
</body>
</html>
