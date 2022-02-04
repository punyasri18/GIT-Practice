<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
</html> --%>


		<%@page import="java.sql.Connection" %>
		<%@page import="java.sql.DriverManager" %>
		<%@page import="java.sql.ResultSet" %>
		<%@page import="java.sql.Statement" %>
		<%@page import="java.sql.SQLException" %>
		<%
					
		%>
		<!DOCTYPE html>
		<html>
		<head>
		<title>Retriving Data</title>
		</head>
		<body>
		<h1>Your Expenses Details </h1>
		<table border="1">
		<tr>
		<td>EXP_ID</td>
		<td>USER_ID</td>
		<td>EXP_RECORD_DATE</td>
		<td>EXP_DATE</td>
		<td>EXP_CATEGORY_ID</td>
		<td>EXP_DESC</td>
		<td>COST</td>

		</tr>
		<%
		try{
			Connection connection = null;
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1","system","oracle");
			Statement statement = connection.createStatement();
			String sql ="SELECT * FROM struts_expenses";
			ResultSet resultSet = statement.executeQuery(sql);
		while(resultSet.next()){
		%>
		<tr>
		<td><%=resultSet.getString("EXP_ID") %></td>
		<td><%=resultSet.getString("USER_ID") %></td>
		<td><%=resultSet.getString("EXP_RECORD_DATE") %></td>
		
		<td><%=resultSet.getString("EXP_DATE") %></td>
		
		<td><%=resultSet.getString("EXP_CATEGORY_ID") %></td>
		<td><%=resultSet.getString("EXP_DESC") %></td>
		<td><%=resultSet.getString("COST") %></td>
		
		</tr>
		<%
		}
		connection.close();
		} catch (Exception e) {
		e.printStackTrace();
		}
		%>
		</table>
		</body>
		</html>	