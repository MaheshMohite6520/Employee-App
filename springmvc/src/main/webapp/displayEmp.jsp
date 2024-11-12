<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Employees</title>
<style>
/* Styling for the body */
body {
	font-family: Arial, sans-serif;
	background: linear-gradient(135deg, #ff9a9e, #fad0c4);
	display: flex;
	flex-direction: column;
	align-items: center;
	padding-top: 50px;
	margin: 0;
	color: #333;
}

/* Animation for fade-in effect */
@
keyframes fadeIn {from { opacity:0;
	transform: translateY(-20px);
}

to {
	opacity: 1;
	transform: translateY(0);
}

}

/* Styling for the table */
table {
	border-collapse: collapse;
	width: 90%;
	max-width: 800px;
	box-shadow: 0 10px 20px rgba(0, 0, 0, 0.2);
	background: #ffffff;
	animation: fadeIn 1s ease;
	margin-top: 20px;
}

th, td {
	padding: 12px;
	text-align: center;
	font-size: 16px;
}

/* Header row styling */
th {
	background-color: #ff9a9e;
	color: white;
	font-weight: bold;
}

/* Alternating row colors */
tr:nth-child(even) {
	background-color: #f2f2f2;
}

/* Row hover effect */
tr:hover {
	background-color: #ffd1d1;
	transition: background-color 0.3s;
}

/* Styling for links */
a {
	color: #ff6b6b;
	text-decoration: none;
	font-weight: bold;
}

a:hover {
	color: #ff9a9e;
	text-decoration: underline;
}

/* Styling for the header */
h1 {
	color: #ffffff;
	font-size: 28px;
	text-shadow: 1px 1px 5px rgba(0, 0, 0, 0.3);
}
</style>
</head>
<body>

	<h1>All Employees</h1>

	<table>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Phone</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>

		<c:forEach var="emp" items="${list}">
			<tr>
				<td>${emp.id}</td>
				<td>${emp.name}</td>
				<td>${emp.phone}</td>
				<td><a href="empEdit?id=${emp.id}">Edit</a></td>
				<td><a href="delete?id=${emp.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>
