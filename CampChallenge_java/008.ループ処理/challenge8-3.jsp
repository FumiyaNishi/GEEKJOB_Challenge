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
    int sum = 0;
    for (int i = 0; i <= 100; i++) sum += i;
    out.println(sum);
	%>
</body>
</html>