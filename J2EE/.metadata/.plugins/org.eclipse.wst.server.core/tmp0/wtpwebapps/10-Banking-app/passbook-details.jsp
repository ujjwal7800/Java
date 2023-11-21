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
	<link rel="stylesheet" type="text/css" href="passbook-details.css">
<meta charset="ISO-8859-1">
<title>Passbook Details</title>
</head>
<body>

	<div class="container p-3 my-3 border  bg-light text-dark ">
		<center>
			<h1>Passbook Details</h1>
		</center>
		<div class="d-flex align-items-end flex-column" style="">
			<button type="button" name="back" onclick="history.back()">
				<i class="fa-sharp fa-solid fa-arrow-left"></i>
			</button>
		</div>
		<br>
		<div class="d-flex align-items-end flex-column" style="">
			<form action="UserController">

				<input type="hidden" name="acc_no" value="${isUser.acc_no}">
				<input type="hidden" name="command" value="filterByDate"> <input
					type="date" name="fromDate" required> <input type="date"
					name="toDate" required> <span><input type="submit"
					value="Search"></span>
				<c:out value="${msg3}"></c:out>
			</form>
		</div>
		<hr>
		<table
			class="table table-striped  table-hover table-light table-borderless">

			<tr class="text-center">

				<th>Sr.No</th>
				<th>Acc No</th>
				<th>Transaction Date</th>
				<th>Transaction Type</th>
				<th>Transaction Amount</th>
				<th>Account Balance</th>
			</tr>
			<c:forEach var="transactions" items="${transactions}">
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
			<a href="LogoutController" class="btn btn-outline-c w-50">Logout</a>
			<hr>
		</center>
</body>
</html>