<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>16.データ操作-3jsp</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");

		String[] kinds = {"雑貨", "生鮮食品", "その他"};

   		int sum = Integer.parseInt(request.getParameter("sum"));
   		int count = Integer.parseInt(request.getParameter("count"));
   		int kind = Integer.parseInt(request.getParameter("kind"));

    	out.print("購入した商品の総額(円)：" + sum + "<br>");
    	out.print("購入した商品の個数(個)：" + count + "<br>");
    	out.print("商品種別：" + kinds[kind-1] + "<br>");

    	out.print("商品の単価(円)：" + sum/count + "<br>");

    	int point = 0;
		if(sum >= 5000) point = (int)(sum * 0.05);
		else if(sum >= 3000) point = (int)(sum * 0.04);
		out.print("ポイント：" + point);
	%>
</body>
</html>