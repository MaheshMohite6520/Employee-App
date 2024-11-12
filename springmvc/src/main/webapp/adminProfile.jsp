<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Admin Details</h1>

	<table border="1" style="text-align: center">

		<tr>
			<td>ID</td>
			<td>Name</td>
			<td>Phone</td>
			<td>Edit</td>
		</tr>

		<tr var="admin" items="${admin}">
			<td>${ admin.id }</td>
			<td>${ admin.name }</td>
			<td>${ admin.phone }</td>
			<td><a href="adminEdit?id=${admin.id}">Edit</a></td>
		</tr>

	</table>
	
	<button> <a href="displayAll">Manage Employees</a> </button>

</body>
</html>