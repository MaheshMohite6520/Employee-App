<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<%-- JSTL Tag Library for JSTL-Form --%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Employee</title>
<style>
/* Styling for the body */
body {
	font-family: Arial, sans-serif;
	background: linear-gradient(135deg, #43cea2, #185a9d);
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
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

/* Styling for the form container */
form {
	background-color: #ffffff;
	padding: 30px;
	border-radius: 10px;
	box-shadow: 0 10px 20px rgba(0, 0, 0, 0.2);
	width: 300px;
	text-align: center;
	animation: fadeIn 1s ease;
}

/* Styling for input fields */
label {
	display: block;
	margin-top: 10px;
	font-weight: bold;
	color: #185a9d;
}

input[type="text"], input[readonly="true"] {
	width: 100%;
	padding: 10px;
	margin-top: 5px;
	border: 1px solid #ddd;
	border-radius: 5px;
	font-size: 16px;
	transition: border-color 0.3s;
}

input[type="text"]:focus, input[readonly="true"]:focus {
	border-color: #43cea2;
	outline: none;
}

/* Styling for the update button */
button {
	background-color: #185a9d;
	color: white;
	padding: 10px;
	border: none;
	border-radius: 5px;
	cursor: pointer;
	width: 100%;
	font-size: 16px;
	margin-top: 20px;
	transition: background-color 0.3s, transform 0.2s;
}

button:hover {
	background-color: #43cea2;
	transform: scale(1.05);
}
</style>
</head>
<body>

	<form:form action="adminUpdate" modelAttribute="admin" method="get">
		<label>ID:</label>
		<form:input path="id" readonly="true" />
		<br>

		<label>Name:</label>
		<form:input path="name" readonly="true" />
		<br>

		<label>Phone:</label>
		<form:input path="phone" />
		<br>

		<form:button>UPDATE</form:button>
	</form:form>

</body>
</html>
