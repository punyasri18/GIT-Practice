<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<style>
table, td, th {
	border: 1px solid black;
}

table {
	border-collapse: collapse;
	width: 100%;
}

th {
	height: 50px;
}

button {
	background-color: #008CBA;
	border: none;
	color: white;
	padding: 15px 32px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
	border-radius: 12px;
}
</style>
</head>
<body style="text-align: center;">
	<s:form action="FetchRecords.action" method="POST">
		<button type="submit" name="fetchData" value="FetchRecords">Fetch
			Records</button>
	</s:form>
	<s:if test="fetchData=='FetchRecords'">
		<div style="margin-top: 40px; margin-right: 150px; margin-left: 150px;">
			<table>
				<thead>
					<tr style="background-color: #E0E0E1;">
						<th>NAME</th>
						<th>EMAIL</th>
						<th>MOBILE</th>
						<th>COLLEGE</th>
						<th>COURSE</th>
						<th>SKILLS</th>
						<th>MARKS 1</th>
						<th>MARKS 2</th>
						<th>MARKS 3</th>
					</tr>
				</thead>
				<s:iterator value="dataList">
					<tr>
						<td><s:property value="name" /></td>
						<td><s:property value="email" /></td>
						<td><s:property value="mobile" /></td>
						<td><s:property value="college" /></td>
						<td><s:property value="course" /></td>
						<td><s:property value="skills" /></td>
						<td><s:property value="marks1" /></td>
						<td><s:property value="marks2" /></td>
						<td><s:property value="marks3" /></td>
					</tr>
				</s:iterator>
			</table>
		</div>
	</s:if>
</body>
</html>