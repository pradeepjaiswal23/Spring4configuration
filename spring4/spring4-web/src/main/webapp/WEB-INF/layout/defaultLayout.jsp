<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
	<table style="font-family: Arial">
		<tr>
			<td colspan="2"
				style="width: 800px; height: 80px; background-color: #BDBDBD; text-align: center">
				<tiles:insertAttribute name="header" />
			</td>
		</tr>
		<tr>
			<td style="width: 150px; height: 500px; background-color: #D8D8D8">
				<tiles:insertAttribute name="menu" />
			</td>
			<td style="width: 650px; height: 500px; background-color: #E6E6E6">
				<tiles:insertAttribute name="body" />
			</td>
		</tr>
		<tr>
			<td colspan="2" style="background-color: #BDBDBD; text-align: center">
				<tiles:insertAttribute name="footer" />
			</td>
		</tr>
	</table>

</body>
</html>