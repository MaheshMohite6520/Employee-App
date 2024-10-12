<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Profile</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f0f0f0;
	margin: 0;
	padding: 0;
}

.header {
	background-color: #333;
	color: #fff;
	padding: 20px;
	text-align: center;
}

.header h1 {
	margin: 0;
}

.container {
	max-width: 800px;
	margin: 40px auto;
	background-color: #fff;
	padding: 20px;
	border: 1px solid #ddd;
	border-radius: 10px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

table {
	width: 100%;
	border-collapse: collapse;
	margin-bottom: 20px;
}

th, td {
	border: 1px solid #ddd;
	padding: 10px;
	text-align: left;
}

th {
	background-color: #f7f7f7;
}

.animate {
	animation: animate 2s;
}

@
keyframes animate { 0% {
	opacity: 0;
	transform: translateY(-50px);
}

100
%
{
opacity
:
1;
transform
:
translateY(
0
);
}
}
.button {
	background-color: #4CAF50;
	color: #fff;
	padding: 10px 20px;
	border: none;
	border-radius: 5px;
	cursor: pointer;
}

.button:hover {
	background-color: #3e8e41;
}

a {
	color: #337ab7;
	text-decoration: none;
}

a:hover {
	color: #23527c;
}
</style>
</head>
<body>
	<div class="header">
		<h1>Employee Profile</h1>
	</div>
	<div class="container animate">
		<table>
			<tr>
				<th>Name:</th>
				<td>${fullName}</td>
			</tr>
			<tr>
				<th>Email:</th>
				<td>${email}</td>
			</tr>
			<tr>
				<th>Password:</th>
				<td>${password}</td>
			</tr>
			<tr>
				<th>Contact:</th>
				<td>${contact}</td>
			</tr>
			<tr>
				<th>Address:</th>
				<td>${address}</td>
			</tr>
			<tr>
				<th>Department:</th>
				<td>${department.name}</td>
			</tr>
		</table>
	</div>
</body>
</html>