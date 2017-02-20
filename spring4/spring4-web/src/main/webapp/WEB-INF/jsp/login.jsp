<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4 style="margin-top: -35%;margin-left: 35%;">Login Form</h4>
<form:form method="POST" action="userLogin" modelAttribute="login">
		<table>
		
			<tr>
				<td>enter your email</td><td><form:input path="email"/></td><td><form:errors path="email"/></td>
			</tr>
			<tr>
				<td>enter your password</td><td><form:password path="password"/></td><td><form:errors path="password"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="submit"></td>
			</tr>
		</table>
	</form:form>

</body>
</html>