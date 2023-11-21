<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
 pageEncoding="ISO-8859-1"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
 
<%@ page 
 import="java.util.ArrayList,java.util.List,com.aurionpro.model.Student"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> 
<html> 
<head> 
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> 
<title>Insert title here</title> 
</head> 
<body> 
 <c:set var="curDate" value="<%=new java.util.Date()%>" /> 
 current Date = ${curDate} 
 <br> 
 <% 
  String names[] = { "ujjwal", "virat", "siddhi" }; 
  pageContext.setAttribute("students", names); 
 %> 
 <c:forEach var="name" items="${students}"> ${name} </c:forEach> 
 
 
 <% 
  List<Student> students = new ArrayList<>(); 
  students.add(new Student(1, "ujjwal", "ujjwal@gmail.com", 80)); 
  students.add(new Student(2, "Virat", "virat@gmail.com", 90)); 
  students.add(new Student(3, "siddhi", "siddhi@gmail.com", 100)); 
   
  pageContext.setAttribute("listOfStudent", students); 
 %> 
 <table border="1"> 
  <thead> 
   <tr> 
    <th>ID</th> 
    <th>Name</th> 
    <th>Email</th> 
    <th>percentage</th> 
    <th>remark</th> 
   </tr> 
  </thead> 
   
  <tbody> 
   <c:forEach var="student" items="${listOfStudent}"> 
    <tr> 
     <td>${student.id}</td> 
     <td>${student.name}</td> 
     <td>${student.email}</td> 
     <td>${student.percentage}</td> 
     <td> 
     <c:if test="${student.percentage > 85}"> distinction </c:if> 
     <c:if test="${student.percentage < 85}"> pass</c:if> 
     </td> 
    </tr> 
   </c:forEach> 
  </tbody> 
 </table> 
  
<%-- Set the user's age --%> 
<c:set var="userAge" value="30" /> 
 
<c:choose> 
    <c:when test="${userAge < 18}"> 
        You are not eligible for voting. 
    </c:when> 
    <c:when test="${userAge >= 18 && userAge <= 60}"> 
        You are eligible for voting. 
    </c:when> 
    <c:otherwise> 
        You are senior citizens. 
    </c:otherwise> 
</c:choose> 
 
 
 
<c:set var="text" value="   Hello, JSTL Functions!   " /> 
 
Length of the string: ${fn:length(text)}<br /> 
Uppercase: ${fn:toUpperCase(text)}<br /> 
Lowercase: ${fn:toLowerCase(text)}<br /> 
Trimmed: ${fn:trim(text)}<br /> 
Substring (2-7): ${fn:substring(text, 2, 7)}<br /> 
 
 
  
  
</body> 
</html>
