<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ page import="java.util.HashMap" %>
	<%
	long product = 1;
    for (int i = 1; i <= 20; i++) {
    	product *= 8;
        out.println("8^" + i + " = " + product + "<br>");
    }
	%>
</body>
</html>