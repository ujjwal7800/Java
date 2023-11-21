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
        HttpApplication application1 = request.getAttribute(arg0){

        Integer count = (Integer) application.getAttribute("counter");
        if (count == null) {
            count = 0;
        }

        count++;

        application.setAttribute("counter", count);
}
    %>
    <h1>Application Counter</h1>
    <p>Page Refreshed: <%= count %> times.</p>
    <p><a href="<%= request.getRequestURI() %>">Refresh Page</a></p>


</body>
</html>