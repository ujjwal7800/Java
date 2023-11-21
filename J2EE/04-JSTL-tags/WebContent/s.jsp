<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:set var="curDate" value="<%= new java.util.Date() %>" />

Current Date = ${curDate};
<br>
<%
String names []={"ujjwal","Rahul"};
pageContext.setAttribute("students",names);
%>
<c:forEach var="name" items="$(students)"> $(name)</c:forEach>

</body>
</html>