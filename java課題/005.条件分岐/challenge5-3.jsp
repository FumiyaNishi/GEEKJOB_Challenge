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
    char figure = 'あ';
    switch (figure) {
        case 'A':
            out.println("英語");
            break;
        case 'あ':
            out.println("日本語");
            break;
    }
	%>
</body>
</html>