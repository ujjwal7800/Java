<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
        HttpSession session1 = request.getSession();

        Integer count = (Integer) session.getAttribute("counter");
        if (count == null) {
            count = 0;
        }

        count++;

        session.setAttribute("counter", count);
    %>
    <h1>Session Counter</h1>
    <p>Page Refreshed: <%= count %> times.</p>
    <p><a href="<%= request.getRequestURI() %>">Refresh Page</a></p>

</body>
</html>