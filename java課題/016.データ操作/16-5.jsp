<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>16.データ操作-5</title>
</head>
<body>
	<%@ page import="java.util.Date" %>
	<%
    HttpSession hs = request.getSession(true);
    String lastLogin = (String) hs.getAttribute("LastLogin");
    if (lastLogin != null) {
        out.print("最後のログインは" + lastLogin);
    }
    Date date = new Date();
    hs.setAttribute("LastLogin", date.toString());
	%>
</body>
</html>