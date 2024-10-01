<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Employee</title>
<link rel="stylesheet" href="addEmployee.css">
</head>
<body>
	<h1>Add Employee</h1>
	<form action="AddEmployeeServlet" >
		<br> <label for="eid">EmployeeId:</label> <input type="text" id="eid" name="eid"><br><br>
		<label for="name">Name:</label> <input type="text" id="name" name="name"><br>
		<br> <label for="email">Email:</label> <input type="email" id="email" name="email"><br>
		<br> <label for="department">Department:</label> <input type="text" id="department" name="department"><br>
		<br> <label for="contact">Contact:</label> <input type="text" id="contact" name="contact"><br><br>
		<label for="salary">Salary:</label> <input type="text" id="salary" name="salary"><br>
		<br> <label for="address">Address:</label> <input type="text" id="address" name="address"><br>
		<br> <label for="designation">Designation:</label> <input type="text" id="designation" name="designation"><br>
		
		<br> <input type="submit" value="Add Employee">
	</form>
</body>
</html>