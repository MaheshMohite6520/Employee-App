<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Management System</title>
<link rel="stylesheet" href="styles.css">
</head>
<body>
	<h1>Employee Management System</h1>
	
	<section>
		<h2 align="center">Welcome to the Employee Management System</h2>
		<p align="center">This system allows you to manage employee
			records, including adding, updating, and deleting employees.</p>
	</section>

	<div class="card-container">
		<div class="card" style="width: 18rem;">
			<div class="card-body">
				<h5 class="card-title">Add Employee</h5>
				<p class="card-text">Add a new employee to the system.</p>
				<a href="addEmployee.jsp" class="card-link">Add Employee</a>
			</div>
		</div>
		<div class="card" style="width: 18rem;">
			<div class="card-body">
				<h5 class="card-title">View Employees</h5>
				<p class="card-text">View all employees in the system.</p>
				<a href="fetch-emp" class="card-link">View Employees</a>
			</div>
		</div>
		<div class="card" style="width: 18rem;">
			<div class="card-body">
				<h5 class="card-title">Update Employee</h5>
				<p class="card-text">Update an existing employee's information.</p>
				<a href="updateEmployee.jsp" class="card-link">Update Employee</a>
			</div>
		</div>
		<div class="card" style="width: 18rem;">
			<div class="card-body">
				<h5 class="card-title">Delete Employee</h5>
				<p class="card-text">Delete an existing employee from the
					system.</p>
				<a href="deleteEmployee.jsp" class="card-link">Delete Employee</a>
			</div>
		</div>
	</div>

	
</body>
</html>