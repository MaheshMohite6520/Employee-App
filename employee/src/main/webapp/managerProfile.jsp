<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manager Dashboard</title>
<style>
body {
	margin: 0;
	padding: 0;
	background-color: #f2f2f2;
	font-family: Arial, sans-serif;
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

.info {
	margin-bottom: 20px;
}

.info p {
	margin-bottom: 10px;
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
</style>
</head>
<body>
	<div class="header">
		<h1>Manager Dashboard</h1>
	</div>
	<div class="container animate">
		<h2>Welcome, ${fullName}!</h2>
		<div class="info">
			<p>Your email is: ${email}</p>
			<p>Your contact number is: ${contact}</p>
			<p>Your address is: ${address}</p>
			<p>Your department is: ${department.name}</p>
		</div>
		<button class="button" onclick="location.href='index.jsp'">Manage
			Employees</button>
	</div>
</body>
</html>