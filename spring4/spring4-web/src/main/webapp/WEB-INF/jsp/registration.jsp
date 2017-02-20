<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>


</head>
<body>
<h4 style="margin-top: -35%;margin-left: 35%;">Registration Form</h4>

<div style="color: red;">${userMessage}</div>

<form:form method="POST" action="saveUser" modelAttribute="registration">
		<table width="100%" border="0" align="left">
			<tr>
				<td>First name</td><td><form:input path="fname"/></td><td><form:errors path="fname"/></td>
			</tr>
			<tr>
				<td>Last name</td><td><form:input path="lname"/></td><td><form:errors path="lname"/></td>
			</tr>
			<tr>
				<td>contect</td><td><form:input path="contact"/></td><td><form:errors path="contact"/></td>
			</tr>
			<tr>
				<td>email</td><td><form:input path="email"/></td><td><form:errors path="email"/></td>
			</tr>
			<tr>
				<td>password</td><td><form:password path="password"/><td><form:errors path="password"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="submit"></td>
			</tr>	
		</table>
	</form:form>
</body>
</html>