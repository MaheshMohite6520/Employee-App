<%@page import="java.util.ArrayList"%>
<%@ page import="com.employee.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="searchDisplay.css">
</head>
<body>
	<h1>Employees</h1>
	<table class="view-employees-table" border="1" align="center">
		<tr>
			<th>Employee ID</th>
			<th>Name</th>
			<th>Email</th>
			<th>Department</th>
			<th>Contact</th>
			<th>Salary</th>
			<th>Address</th>
			<th>Designation</th>
		</tr>

		<%
			try 
		{
			ArrayList<Employee> employees = (ArrayList<Employee>) request.getAttribute("employees");
			if (employees != null && !employees.isEmpty()) 
			{
				for (int i = 0; i < employees.size(); i++) 
				{
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
		} 
			else 
			{
		out.println("No employees found.");
		}
		} 
		catch (Exception e) 
		{
		out.println("An error occurred: " + e.getMessage());
		}
		%>
	</table>
	
	<button class="back-button"  onclick="goBack()">Back</button>

	<script>
		// Function to go back to the index.jsp page
		function goBack() 
		{
			window.location.href = 'index.jsp';
		}
	</script>
	
</body>
</html>