<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Employee Details</h1>

	<table border="1" style="text-align: center">

		<tr>
			<td>ID</td>
			<td>Name</td>
			<td>Phone</td>
			<td>Edit</td>
		</tr>


		<tr var="employee" items="${emp}">
			<td>${ employee.id }</td>
			<td>${ employee.name }</td>
			<td>${ employee.phone }</td>
			<td><a href="employeeEdit?id=${employee.id}">Edit</a></td>
		</tr>



	</table>

</body>
</html>