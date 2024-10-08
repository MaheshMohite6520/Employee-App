<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Employee</title>
<link rel="stylesheet" href="deleteEmployee.css">
</head>
<body>
	<h1>Delete Employee</h1>
	<form action="DeleteEmployeeServlet" class="delete-employee-form">
		<div class="form-group">
			<label for="eid">Employee ID:</label> <input type="text" id="eid" name="eid" required>
		</div>
		<div class="button-container">
			<a id="delete" class="button" href="#" onclick="deleteEmployee()">Delete
				Employee</a> <a class="button" href="index.jsp">Back</a>
		</div>
	</form>

	<p class="note">Note: Please enter the Employee ID of the employee
		you want to delete.</p>

	<script>
		function deleteEmployee() {
			var eid = document.getElementById("eid").value;
			window.location.href = "DeleteEmployeeServlet?eid=" + eid;
		}
	</script>


</body>
</html>