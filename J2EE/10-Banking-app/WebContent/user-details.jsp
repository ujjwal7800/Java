<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://kit.fontawesome.com/c102305e9c.js"
	crossorigin="anonymous"></script>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="user-details.css">
	
<meta charset="ISO-8859-1">
<title>List of Users</title>
</head>
<body>

	<br><br>
	</form>

	<div class="container p-3 my-3 border  bg-light text-dark ">
		<center>
			<h1>User Details</h1>
		</center>
		<button type="button" name="back" onclick="history.back()">
			<a type="button" href="admin-dashboard.jsp"><i
				class="fa-sharp fa-solid fa-arrow-left"></i></a>
		</button>
		<br> <br>
		<form action="AdminController">
			<input type="hidden" name="command" value="search"> <input
				type="text" placeholder="Enter Acc_No " name="search" required>
			<span><input type="submit" value="Search" class="btn-primary-a"></span>
			<c:out value="${msg1}"></c:out>
		</form>

		<!-- <hr> -->
		<table
			class="table table-striped  table-hover table-light table-borderless">

			<tr>
				<th>Account No</th>
				<th>User Name</th>
				<th>Email</th>
				<th>Password</th>
				<th>Mobile Number</th>
				<th>Balance</th>
				<!-- <th>Add</th> -->
				<th>Delete</th>
			</tr>

			<%-- <c:if test="${searchList == null}">
			<p>No records found</p>
			</c:if> --%>

			<c:forEach var="user" items="${listUser}">

				<c:url var="addLink" value="AdminController">
					<c:param name="command" value="add"></c:param>
					<c:param name="id" value="${user.acc_no}"></c:param>
				</c:url>

				<c:url var="deleteLink" value="AdminController">
					<c:param name="command" value="delete"></c:param>
					<c:param name="acc_no" value="${user.acc_no}"></c:param>
				</c:url>


				<tr>
					<td>${user.acc_no}</td>
					<td>${user.user_name}</td>
					<td>${user.email}</td>
					<td>${user.pass}</td>
					<td>${user.mob}</td>
					<td>${user.balance}</td>

					<td><a href="${deleteLink}">
							<button type="button" class="btn btn-link">
								<i class="fa fa-trash-o" style="font-size: 24px; color: #004880"></i>
							</button>
					</a></td>
				</tr>
			</c:forEach>

			<hr>
		</table>
		<hr>

		<input type="button" value="Add User" class="btn btn-primary-a"
			onclick="window.location.href='add-user-form.jsp';">
		<center>
			<a href="LogoutController" class="btn btn-outline-c w-50">Logout</a>
			<hr>
		</center>
</body>
</html>