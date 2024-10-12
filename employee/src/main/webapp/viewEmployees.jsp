<%@ page import="java.util.ArrayList"%>
<%@ page import="com.employee.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Employees</title>
<link rel="stylesheet" href="viewEmployee.css">
</head>
<body>
	<h1>View Employees</h1>
	<form class="search-form" action="SearchEmployeeServlet">
		<input type="text" name="search" placeholder="Search Employees"
			required> <input type="submit" value="Search">
	</form>

	<table class="view-employees-table" border="1" align="center">
		<tr>
			<th>Employee ID</th>
			<th>Full Name</th>
			<th>Email</th>
			<th>Department</th>
			<th>Contact</th>
			<th>Salary</th>
			<th>Address</th>
			<th>Designation</th>
		</tr>

		<%
			try {
			ArrayList<Employee> employees = (ArrayList<Employee>) request.getAttribute("employees");
			if (employees != null && !employees.isEmpty()) {
				for (int i = 0; i < employees.size(); i++) {
			Employee employee = employees.get(i);
		%>
		<tr>
			<td><%=employee.getEmployeeId()%></td>
			<td><%=employee.getEname()%></td>
			<td><%=employee.getEmail()%></td>
			<td><%=employee.getDept()%></td>
			<td><%=employee.getContact()%></td>
			<td><%=employee.getSalary()%></td>
			<td><%=employee.getAddress()%></td>
			<td><%=employee.getDesignation()%></td>
		</tr>
		<%
			}
		} else {
		out.println("No employees found.");
		}
		} catch (Exception e) {
		out.println("An error occurred: " + e.getMessage());
		}
		%>
	</table>

	<button class="back-button" onclick="goBack()">Back</button>

	<script>
		// Function to go back to the index.jsp page
		function goBack() 
		{
			window.location.href = 'index.jsp';
		}

		// Function to search employees
		function searchEmployees() 
		{
			var searchInput = document.getElementById("search").value;
			var employees = document
					.querySelectorAll(".view-employees-table tr");

			employees.forEach(function(employee) 
					{
				var employeeName = employee.cells[1].textContent;
				if (employeeName.toLowerCase().includes(
						searchInput.toLowerCase())) {
					employee.style.display = "table-row";
				} else 
				{
					employee.style.display = "none";
				}
			});
		}

		// Add event listener to search input
		document.getElementById("search").addEventListener("input",
				searchEmployees);
	</script>
</body>
</html>