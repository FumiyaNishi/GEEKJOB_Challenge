<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>18.DB操作-11jsp</title>
</head>
<body>
	<%@ page import="java.sql.*, java.text.*" %>
	<%
	Connection db_con = null;
	PreparedStatement db_st = null;
	ResultSet db_data = null;

	try {
    	Class.forName("com.mysql.jdbc.Driver").newInstance();
    	db_con = DriverManager.getConnection("jdbc:mysql://localhost:8889/Challenge_db", "fumiya", "Niffy238");

    	request.setCharacterEncoding("UTF-8");

    	int profilesID = Integer.parseInt(request.getParameter("profilesID"));
   		String name = request.getParameter("name");
   		String tel = request.getParameter("tel");
   		int age = Integer.parseInt(request.getParameter("age"));
   		Date birthday = Date.valueOf(request.getParameter("birthday"));

   		db_st = db_con.prepareStatement("UPDATE profiles SET name = ?, tel = ?, age = ?, birthday = ? WHERE profilesiD = ?;");
		db_st.setString(1, name);
		db_st.setString(2, tel);
		db_st.setInt(3, age);
		db_st.setDate(4, birthday);
		db_st.setInt(5, profilesID);
		db_st.executeUpdate();

   		db_st = db_con.prepareStatement("SELECT * FROM profiles;");
        db_data = db_st.executeQuery();
        while(db_data.next()) {
        	out.println("ID: " + db_data.getInt("profilesID"));
        	out.println(", Name: " + db_data.getString("name"));
        	out.println(", Tell: " + db_data.getString("tel"));
        	out.println(", Age: " + db_data.getInt("age"));
        	out.println(", Birthdaty: " + db_data.getDate("birthday").toString());
        	out.println("<br>");
        }

        db_data.close();
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

