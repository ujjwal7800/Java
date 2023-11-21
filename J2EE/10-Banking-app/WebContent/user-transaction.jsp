<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="user-transaction.css">
<script src="https://kit.fontawesome.com/c102305e9c.js"
	crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Transaction</title>
</head>
<body>

	<br><br>
	<div class="container p-3 my-3 border  bg-light text-dark ">
		<center>
			<h1>User Transaction</h1>
		</center>
		<hr>

		<button type="button" name="back" onclick="history.back()">
			<i class="fa-sharp fa-solid fa-arrow-left"></i>
		</button>
		<form action="UserController">
			<input type="hidden" value="${balance}" name="balance">
			<center>
				<h6>
					Current Balance:&nbsp
					<c:out value="${balance}"></c:out>
				</h6>
				<c:if test="${minimum==1000}">
					<c:out value="${msg4}" />
				</c:if>

				<br> Transaction Type : <select name="command">
					<option>Deposit</option>
					<option>Withdraw</option>
				</select><br> <br> <input type="hidden" name="acc_no" value="${acc_no}">


				<input type="text" name="amount" placeholder="Enter Amount"
					required><br> <br> <input
					class="btn btn-outline-a " type="submit">
			</center>

		</form>
		<hr>
		<center>
			<a href="LogoutController" class="btn btn-outline-c w-50">Logout</a>
		</center>

	</div>
	<br>
	</div>

</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</html>