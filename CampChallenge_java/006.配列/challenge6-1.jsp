<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
    String[] array = {"10", "100", "soeda", "hayashi", "-20", "118", "END"};
    for (String content : array) {
        out.println(content);
    }
	%>
</body>
</html>