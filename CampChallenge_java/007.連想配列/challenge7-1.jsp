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
    HashMap<String, String> data = new HashMap<String, String>();

    data.put("1", "AAA");
    data.put("hello", "world");
    data.put("soeda", "33");
    data.put("20", "20");

    out.println(data.get("1"));
    out.println(data.get("hello"));
    out.println(data.get("soeda"));
    out.println(data.get("20"));
	%>
</body>
</html>