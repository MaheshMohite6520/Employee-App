<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false" isELIgnored="false"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1 style="text-align: center">ALL EMPLOYEE's</h1>

	<table border="1" style="text-align: center">

		<tr>
			<td>ID</td>
			<td>Name</td>
			<td>Phone</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>

		<c:forEach var="emp" items="${list}">
			<tr>
				<td>${ emp.id }</td>
				<td>${ emp.name }</td>
				<td>${ emp.phone }</td>
				<td> <a href="edit?id=${emp.id}">Edit</a> </td>
				<td> <a href="delete?id=${emp.id}">Delete</a> </td>
			</tr>
		</c:forEach>


	</table>
</body>
</html>