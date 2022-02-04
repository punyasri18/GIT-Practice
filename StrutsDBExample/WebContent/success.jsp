<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-html" prefix="html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success page</title>
</head>
<body bgcolor="silver">
<table><tr>sucessfully added</tr> <br><br>
<%=session.getAttribute("EXP_ID") %><br><br>
<%=session.getAttribute("USER_ID") %><br><br>
<%=session.getAttribute("EXP_RECORD_DATE") %><br><br>
<%=session.getAttribute("EXP_DATE") %><br><br>
<%=session.getAttribute("EXP_CATEGORY_ID") %><br><br>
<%=session.getAttribute("EXP_DESC") %><br><br>
<%=session.getAttribute("COST") %><br><br>
</table>
</body>
</html>

 