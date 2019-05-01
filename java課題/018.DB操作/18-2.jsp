<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>18.DB操作-2</title>
</head>
<body>
	<%@ page import="java.sql.*" %>
	<%
	Connection db_con = null;
	PreparedStatement db_st = null;
	try {
    	Class.forName("com.mysql.jdbc.Driver").newInstance();
    	db_con = DriverManager.getConnection("jdbc:mysql://localhost:8889/Challenge_db", "fumiya", "Niffy238");

        db_st = db_con.prepareStatement("INSERT INTO profiles VALUES (?, ?, ?, ?, ?);");
        db_st.setInt(1, 4);
        db_st.setString(2, "技育太郎");
        db_st.setString(3, "090-1234-9876");
        db_st.setInt(4, 24);
        db_st.setDate(5, Date.valueOf("2015-01-01"));
        db_st.execute();

        db_st.close();
    	db_con.close();
	} catch (SQLException e_sql) {
    	out.println("接続時にエラーが発生しました： " + e_sql.toString());
	} catch (Exception e) {
    	out.println("接続時にエラーが発生しました： " + e.toString());
	} finally {
    	if (db_con != null) {
        	try {
            	db_con.close();
        	} catch (Exception e_con) {
            	out.println(e_con.getMessage());
       	 	}
    	}
	}
	%>
</body>
</html>