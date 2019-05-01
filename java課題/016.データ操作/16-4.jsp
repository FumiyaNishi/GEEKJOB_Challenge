<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>16.データ操作-4</title>
</head>
<body>
	<%@ page import="java.util.Date, java.net.*" %>
	<%
	    Date time = new Date();
		String value = URLEncoder.encode(time.toString(), "UTF-8");
    	Cookie c = new Cookie("LastLogin", value);
    	response.addCookie(c);

   	 	Cookie[] cs = request.getCookies();
   	 	if (cs != null) {
        	for (int i = 0; i < cs.length; i++) {
            	if (cs[i].getName().equals("LastLogin")) {
                	out.print("前回は" + URLDecoder.decode(cs[i].getValue()) + "にアクセスしました。");
                	break;
            	}
        	}
    	}
	%>
</body>
</html>