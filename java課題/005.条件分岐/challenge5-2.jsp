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
    int num = 2;
    switch(num) {
        case 1:
            out.println("one");
            break;
        case 2:
            out.println("two");
            break;
        default:
            out.println("想定外");
            break;
    }
	%>
</body>
</html>