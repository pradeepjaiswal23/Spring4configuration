<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4 style="margin-top: -35%;margin-left: 35%;">List of User</h4>
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