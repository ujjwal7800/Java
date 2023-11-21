<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<script src="https://kit.fontawesome.com/c102305e9c.js"
	crossorigin="anonymous"></script>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet" type="text/css" href="admin-passbook-details.css">
<meta charset="ISO-8859-1">
<title>Admin Passbook Page</title>
</head>
<body>

	<br>
	<br>
	<div class="container p-3 my-3 border  bg-light text-dark ">
		<center>
			<h1>Transaction Details</h1>
		</center>

		<form action="AdminController">
			<input type="hidden" name="command" value="searchadminpassbook">
			<button type="button" name="back" onclick="history.back()">
				<i class="fa-sharp fa-solid fa-arrow-left"></i>
			</button>
			<input type="text" placeholder="Enter acc_no" name="searchadmin"
				required> <span><input type="submit" value="Search"
				class="btn-primary"></span>
				<c:out value="${msg2}"></c:out>
		</form>

		<hr>
		<table
			class="table table-striped  table-hover table-light table-borderless">

			<tr class="text-center">
				<!-- <th>Account No</th> -->

				<th>Sr No</th>
				<th>Acc No</th>

				<th>Transaction Date</th>
				<th>Transaction Type</th>
				<th>Amount</th>
				<th>Balance</th>

			</tr>
			<c:forEach var="transactions" items="${listPassbook}">
				<tr class="text-center">
					<td>${transactions.sr_no}</td>
					<td>${transactions.acc_no}</td>

					<td>${transactions.trans_date}</td>
					<td>${transactions.trans_type}</td>
					<td>${transactions.amount}</td>
					<td>${transactions.balance}</td>

				</tr>
			</c:forEach>
			<hr>
		</table>
		<center>
			<!-- <button type="button" class="btn btn-outline-primary w-50" onclick="window.location.href='login.jsp'">Log
				Out</button> -->
			<a href="LogoutController" class="btn btn-outline-c w-50">Logout</a>
			<hr>
		</center>
</body>
</html>