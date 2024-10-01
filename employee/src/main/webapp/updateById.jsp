	<%@ page language="java" contentType="text/html; charset=UTF-8"
		pageEncoding="UTF-8"%>
	<!DOCTYPE html>
	<html>
	<head>
	<meta charset="UTF-8">
	<title>Add Employee</title>
	<link rel="stylesheet" href="updateById.css">
	</head>
	<body>
		<h1>Update Employee By Id</h1>
		<form action="UpdateEmployeeServlet">
			<br> <label for="eid">EmployeeId:</label> <input type="text" id="eid" name="eid" value="<%= request.getAttribute("eid") %>"><br>
			<br> <label for="name">Name:</label> <input type="text" id="name" name="name" value="<%= request.getAttribute("name") %>"><br> 
			<br> <label for="email">Email:</label> <input type="email" id="email" name="email" value="<%= request.getAttribute("email") %>"><br> <br>
			<label for="department">Department:</label> <input type="text" id="department" name="department" value="<%= request.getAttribute("department") %>"><br> 
			<br> <label for="contact">Contact:</label> <input type="text" id="contact" name="contact" value="<%= request.getAttribute("contact") %>"><br>
			<br> <label for="salary">Salary:</label> <input type="text" id="salary" name="salary" value="<%= request.getAttribute("salary") %>"><br> 
			<br> <label for="address">Address:</label> <input type="text" id="address" name="address" value="<%= request.getAttribute("address") %>"><br> 
			<br> <label for="designation">Designation:</label> <input type="text" id="designation" name="designation" value="<%= request.getAttribute("designation") %>"><br>
	
			<br> <input type="submit" value="Update Employee">
		</form>
	</body>
	</html>