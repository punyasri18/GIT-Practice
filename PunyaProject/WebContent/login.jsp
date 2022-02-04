<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-html" prefix="html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
</head>
<body bgcolor="silver">
<br></br>
<body>
<h1> Daily Expenses Form </h1>
<html:html>
    <div style="color:red">
    <html:errors />
    </div>
	<html:form action="/register" method="get">

		Enter your EXP_ID:
		<html:text property="EXP_ID" size="50" /><br><br>
		
		Enter your USER_ID:
		<html:text property="USER_ID" size="50" /><br><br>
		
		Enter your EXP_RECORD_DATE:
		<html:text property="EXP_RECORD_DATE" size="50" /><br><br>
		
		Enter your EXP_DATE:
		<html:text property="EXP_DATE" size="30" /><br><br>
		
		Enter your EXP_CATEGORY_ID:
		<html:text property="EXP_CATEGORY_ID" size="30" /><br><br>
		
		Enter your EXP_DESC:
		<html:text property="EXP_DESC" size="15" /><br><br>
		
		Enter your COST:
		<html:text property="COST" size="15" /><br><br>
		
		<html:submit>Submit</html:submit>
		<br><br>
	</html:form>
</html:html>
</body>
</html>

 