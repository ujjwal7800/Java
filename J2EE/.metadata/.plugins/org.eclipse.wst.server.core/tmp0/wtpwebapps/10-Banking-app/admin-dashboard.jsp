<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="admin-dashboard.css">

<meta charset="ISO-8859-1">
<title>Admin Dashboard</title>
</head>
<body>
	<br><br>
	
	<div class="container p-3 my-3 border  bg-light text-dark " >
   <center class=><h1 class="text-Seconday">Admin Dashboard</h1></center>
   <br>
   <center>
   		<p><b>ID:</b> ${isAdmin.id} || 
   		<b>NAME:</b> ${isAdmin.admin_name} ||  
   		<b>EMAIL:</b> ${isAdmin.email} || 
   		<b>MOB:</b> ${isAdmin.mob}</p>
   </center>
   <hr><br>
   <form action="AdminController">
	<center>
		 <button type="submit" class="btn btn-outline-a w-50 p-5 h-50 d-inline-block" name="command" value="userDetail">User Information</button><br><br>
         <button type="submit" class="btn btn-outline-b w-50 p-5 h-50 d-inline-block" name="command" value="passbookAdmin">Transaction Details</button><br><br>
         <a href="LogoutController" class="btn btn-outline-danger w-50">Logout</a> 
	
	</center>
	</form>
</div>

</body>
</html>