<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet" type="text/css" href="user-edit-information.css">
<script src="https://kit.fontawesome.com/c102305e9c.js"
	crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Edit User Info</title>
</head>
<body>

	<div class="container p-3 my-3 border  bg-light text-dark ">
		<form action="UserController">
			<center>
				<h4>Edit User Information</h4>
			</center>
			<hr>
			<button type="button" name="back" onclick="history.back()">
				<i class="fa-sharp fa-solid fa-arrow-left"></i>
			</button>

			<br> <br> 
			<label for="user_name">Name : </label> 
			<input type="text" class="w-100" name="user_name" value="${user.user_name}" required>
			<br><br> 
			
			<label for="email">Email : </label> 
			<input type="text" class="w-100" name="email" value="${user.email}" id="email" onkeyup="validateEmail()" required>
			<br> <br>
			
			<label for="pass">Password :</label> 
			<input type="text" class="w-100" name="pass" value="${user.pass }" id="pass" onkeyup="validatePassword()" required>
			<br> <br> 
			
			<label for="mob">mobile No :</label> 
			<input type="text" class="w-100" name="mob" value="${user.mob }" id="mob" onkeyup="validateMobile()" required>
			<br> 
			
			<input type="hidden" name="command" value="update"> 
			<input type="hidden" name="acc_no" value="${user.acc_no}">
			
			<%-- <input type="hidden" name="balance" value="${user.balance}">
			<input type="hidden" name="old_email" value="${user.email}">
			<input type="hidden" name="old_pass" value="${user.pass}"> --%>
			
			
			<center>
				<button type="submit"
					class="btn btn-outline-primary w-50 mt-5px mt-5">Save
					Update</button>
			</center>

			<br> <br>
		</form>
		<p style="font-style: oblique; font-size: 12px; color: rgb(255,0,0);">Note: On change of either Email or Password, you'll be redirected to Login Page. There you need to use your new updated Credentials.</p>
	</div>
</body>
<script src="script.js" ></script>
</html>