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
	<h4 style="margin-top: -35%; margin-left: 35%;">Edit User</h4>
	<div>
		<form:form method="POST" action="saveUser" modelAttribute="registration">
		<table width="100%" border="0" align="left">
			<tr>
				<td>Id</td><td><form:input path="id" value="${id}"/></td><td><form:errors path="id"/></td>
			</tr>
			<tr>
				<td>First name</td><td><form:input path="fname" value="${fname}"/><form:hidden path="id"/></td><td><form:errors path="fname"/></td>
			</tr>
			<tr>
				<td>Last name</td><td><form:input path="lname" value="${lname}"/></td><td><form:errors path="lname"/></td>
			</tr>
			<tr>
				<td>contect</td><td><form:input path="contact" value="${contact}"/></td><td><form:errors path="contact"/></td>
			</tr>
			<tr>
				<td>email</td><td><form:input path="email" value="${email}" /></td><td><form:errors path="email"/></td>
			</tr>
			<tr><td><form:hidden path="password"/></td></tr>
			<tr>
				<td><input type="submit" value="Edit save"></td><td><input type="button" value="cancle"></td>
			</tr>
				
		</table>
	</form:form>
	</div>
	<div>
		<table width="100%" border="1xp">
			<tr>
				<th>ID</th>
				<th>FIRST NAME</th>
				<th>LAST NAME</th>
				<th>EMAIL</th>
				<th>CONTACT</th>
				<th colspan="2">ACTION</th>
			</tr>
			<tbody>
				<c:choose>
					<c:when test="${empty records }">
						<tr>
							<td colspan="5">No Record Found</td>
						</tr>
					</c:when>
					<c:otherwise>
						<c:forEach items="${records}" var="record">
							<tr>
								
								<td>${record.id }</td>
								<td>${record.fname }</td>
								<td>${record.lname }</td>
								<td>${record.email }</td>
								<td>${record.contact }</td>
								<td><a href="edit?arg=${record.id }">Edit</a></td>
								<td><a href="delete?arg=${record.id }">Delete</a></td>
							</tr>
						</c:forEach>
					</c:otherwise>
				</c:choose>
			</tbody>
		</table>
	</div>
</body>
</html>