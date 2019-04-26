<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>16.データ操作-2</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");

   		String name = request.getParameter("name");
   		String sex = request.getParameter("sex");
   		String hobby = request.getParameter("hobby");

    	out.print("名前：" + name + "<br>");
    	out.print("性別：" + sex + "<br>");
    	out.print("趣味：" + hobby + "<br>");
%>
</body>
</html>