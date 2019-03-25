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
    String a = "";
    for (int i = 0; i < 30; i++) a += "A";
    out.println(a);
	%>
</body>
</html>