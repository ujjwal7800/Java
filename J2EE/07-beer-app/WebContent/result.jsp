<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.Iterator"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Beer Recommendations</title>
</head>
<body>
	<h1 align="center">Beer Recommendations JSP</h1>
	<p>
		<%
			List<String> styles = (List<String>) request.getAttribute("styles");
			if (styles != null) {
				Iterator<String> it = styles.iterator();
				while (it.hasNext()) {
					out.print("<br>try: " + it.next());
				}
			} else {
				out.print("No beer styles available.");
			}
		%>
	</p>
</body>
</html>
