<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Employee</title>
<link rel="stylesheet" href="addEmployee.css">
</head>
<body>
	<h1>Add Employee</h1>
	<form action="AddEmployeeServlet" id="addEmployeeForm">
		<div class="form-container">
			<div class="form-group">
				<label for="eid">EmployeeId:</label> <input type="number" id="eid"
					name="eid" required>
			</div>
			<div class="form-group">
				<label for="name">Name:</label> <input type="text" id="name"
					name="name" required>
			</div>
			<div class="form-group">
				<label for="email">Email:</label> <input type="email" id="email"
					name="email" required>
			</div>
			<div class="form-group">
				<label for="department">Department:</label> <input type="text"
					id="department" name="department" required>
			</div>
			<div class="form-group">
				<label for="contact">Contact:</label> <input type="number"
					id="contact" name="contact" required>
			</div>
			<div class="form-group">
				<label for="salary">Salary:</label> <input type="number" id="salary"
					name="salary" required>
			</div>
			<div class="form-group">
				<label for="address">Address:</label> <input type="text"
					id="address" name="address" required>
			</div>
			<div class="form-group">
				<label for="designation">Designation:</label> <input type="text"
					id="designation" name="designation" required>
			</div>
			<div class="button-container">
				<input type="submit" value="Add Employee">
				&nbsp;&nbsp;&nbsp;&nbsp; <input type="submit" onclick="goBack()"
					value="Back">
			</div>
		</div>
	</form>

	<script>
		// Get the form element
		var form = document.getElementById('addEmployeeForm');

		// Add an event listener to the form's submit event
		form.addEventListener('submit', function(event) {
			// Check if all fields are filled
			if (form.checkValidity()) {
				// If all fields are filled, submit the form
				return true;
			} else {
				// If not all fields are filled, prevent the form from submitting
				event.preventDefault();
				alert('Please fill all the details');
			}
		});

		// Function to go back to the index.jsp page
		function goBack() {
			window.location.href = 'index.jsp';
		}
	</script>
</body>
</html>