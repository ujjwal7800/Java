<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://kit.fontawesome.com/c102305e9c.js"
	crossorigin="anonymous"></script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
		<link rel="stylesheet" type="text/css" href="add-user-form.css">
	
<meta charset="ISO-8859-1">
<title>Add User</title>
</head>
<body>
<br>
	<form action="AdminController" name="myform" method="post" onsubmit="return validateform()">
	<div class="container p-3 my-3 border  bg-light text-dark ">
		<button type="button" name="back" onclick="history.back()" class="btn-dark" ><i class="fa-sharp fa-solid fa-arrow-left"></i></button>
		<center class=>
			<h1 class="text-Seconday" >Add New User</h1>
		</center>
		<hr>
		
		<label for="acc_no">Account Number : </label> <input type="number" name="acc_no" class="form-control" id="acc_no" required><br>
		<label for="name">Name : </label> <input type="text" name="user_name" class="form-control" id="user_name" required ><br>
		<label for="email">Email : </label> <input type="text" name="email" class="form-control" id="email" onkeyup="validateEmail()" required><br>
		<label for="password">Password : </label> <input type="password" name="pass" class="form-control" id="pass" onkeyup="validatePassword()" required><br>		
		<label for="mobile">Mobile Number : </label> <input type="text" name="mob" class="form-control" id="mob" onkeyup="validateMobile()" required><br>
		<label for="balance">Balance : </label> <input type="number" name="balance" class="form-control" id="balance" onkeyup="validateBalance()" required><br>
		
		<center>
		<br> <input type="hidden" name="command" value="add"> 
		<input type="submit" class="btn btn-primary w-50" value="submit"></center> <br>
		
	</div>
	</form>
<br>
</body>

 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<script src="script.js" ></script>
</html>