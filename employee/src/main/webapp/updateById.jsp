<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Employee By Id</title>
<link rel="stylesheet" href="updateById.css">
</head>
<body>
	<h1>Update Employee By Id</h1>
	<form action="UpdateEmployeeServlet" class="update-employee-form">
		<div class="form-group">
			<label for="eid">Employee ID:</label> <input type="number" id="eid" name="eid" value="<%=request.getAttribute("eid")%>" required>
		</div>
		<div class="form-group">
			<label for="name">Name:</label> <input type="text" id="name" name="name" value="<%=request.getAttribute("name")%>" required>
		</div>
		<div class="form-group">
			<label for="email">Email:</label> <input type="email" id="email" name="email" value="<%=request.getAttribute("email")%>" required>
		</div>
		<div class="form-group">
			<label for="department">Department:</label> <input type="text" id="department" name="department" value="<%=request.getAttribute("department")%>" required>
		</div>
		<div class="form-group">
			<label for="contact">Contact:</label> <input type="number" id="contact" name="contact" value="<%=request.getAttribute("contact")%>" required>
		</div>
		<div class="form-group">
			<label for="salary">Salary:</label> <input type="number" id="salary" name="salary" value="<%=request.getAttribute("salary")%>" required>
		</div>
		<div class="form-group">
			<label for="address">Address:</label> <input type="text" id="address" name="address" value="<%=request.getAttribute("address")%>" required>
		</div>
		<div class="form-group">
			<label for="designation">Designation:</label> <input type="text" id="designation" name="designation" value="<%=request.getAttribute("designation")%>" required>
		</div>
		<div class="button-container">
			<a id="update" class="button" href="#" onclick="updateEmployee()">Update Employee</a> 
			<a class="button" href="index.jsp">Back</a>
		</div>
	</form>

	<p class="note">Note: Please fill all the details to update the employee.</p>

	<script>
		function updateEmployee() {
			var form = document.getElementById('updateEmployeeForm');
			if (form.checkValidity()) {
				return true;
			} else {
				alert('Please fill all the details');
			}
		}
	</script>
</body>
</html>