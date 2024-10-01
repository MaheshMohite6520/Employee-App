<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Employee</title>
<link rel="stylesheet" href="deleteEmployee.css">
</head>
<body>
	<h1>Delete Employee</h1>
	<form action="DeleteEmployeeServlet">
		<label for="eid">Employee ID:</label> <input type="text" id="eid" name="eid"><br>
		
		<br> <input type="submit" value="Delete Employee">
	</form>
	
	<p align="center">Note: Please enter the Employee ID of the employee you want to
		delete.</p>
</body>
</html>