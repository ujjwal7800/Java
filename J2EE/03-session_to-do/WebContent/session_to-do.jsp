<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %> 
<!DOCTYPE html> 
<html> 
<head> 
    <meta charset="UTF-8"> 
    <title>Session Todos</title> 
</head> 
<body> 
    <h2>Session Todos</h2> 
     
    <form action="todos-response.jsp" method="post"> 
    <label for="task">Add Task:</label> 
    <input type="text" id="task" name="task" placeholder="Enter a task"> 
    <button type="submit">Add</button> 
</form> 
 
</body> 
</html>
