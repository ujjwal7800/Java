<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Information</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<h2>Student Information</h2>

		<form action="StudentController" method="GET">
			<div class="input-group mb-3">
				<input type="text" name="search" class="form-control"
					placeholder="Search by name">
				<div class="input-group-append">
					<button type="submit" class="btn btn-primary">Search</button>
				</div>
			</div>
		</form>

		<!-- Display the search query if it's available -->
		<c:if test="${not empty searchQuery}">
			<p>Search results for: ${searchQuery}</p>
		</c:if>

		<table class="table table-striped table-hover">
			<thead>
				<tr>
					<th>ID</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="student" items="${allStud}">
					<c:url var="updateLink" value="StudentController">
						<c:param name="action" value="update" />
						<c:param name="id" value="${student.id}" />
					</c:url>
					<tr>
						<td>${student.id}</td>
						<td>${student.firstName}</td>
						<td>${student.lastName}</td>
						<td>${student.email}</td>
						<td><a href="${updateLink}" class="btn btn-warning">Update</a>
							<a href="StudentController?action=delete&id=${student.id}"
							class="btn btn-danger">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

		<a href="add-student.jsp" class="btn btn-primary">Add Student</a>
	</div>
</body>
</html>
