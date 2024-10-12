<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Start Page</title>
<style type="text/css">
body {
	background-color: #f0f0f0;
	font-family: Arial, sans-serif;
}

.container {
	width: 80%;
	margin: 40px auto;
	text-align: center;
}

h1 {
	color: #333;
	margin-bottom: 20px;
}

.button-container {
	margin-top: 40px;
}

.button-container a {
	background-color: #4CAF50;
	color: #fff;
	padding: 10px 20px;
	border: none;
	border-radius: 5px;
	cursor: pointer;
	text-decoration: none;
}

.button-container a:hover {
	background-color: #3e8e41;
}

.btn-employee {
	background-color: #337ab7;
}

.btn-employee:hover {
	background-color: #23527c;
}

.btn-manager {
	background-color: #ff9800;
}

.btn-manager:hover {
	background-color: #e68a00;
}
</style>
</head>
<body>
	<div class="container">
		<h1>Welcome to Employee Management System</h1>
		<div class="button-container">
			<div class="button-container">
				<a href="employeeRegistration.jsp" class="btn btn-employee">Employee Register</a> 
				<a href="managerRegistration.jsp" class="btn btn-manager">Manager Register</a>
			</div>
		</div>
	</div>

	<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
	<script>
		$(document).ready(function() {
			$(".btn").hover(function() {
				$(this).addClass("animated pulse");
			}, function() {
				$(this).removeClass("animated pulse");
			});
		});
	</script>
</body>
</html>