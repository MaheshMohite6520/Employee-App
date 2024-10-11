<!DOCTYPE html>
<html>
<head>
<title>Manager Registration</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f0f0f0;
}

table {
	width: 50%;
	border-collapse: collapse;
	margin: 40px auto;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

th, td {
	border: 1px solid #ddd;
	padding: 10px;
	text-align: left;
}

th {
	background-color: #f7f7f7;
}

td input[type="text"], td input[type="email"], td input[type="password"]
	{
	width: 100%;
	padding: 10px;
	border: 1px solid #ccc;
}

td select {
	width: 100%;
	padding: 10px;
	border: 1px solid #ccc;
}

td input[type="submit"] {
	background-color: #4CAF50;
	color: #fff;
	padding: 10px 10px;
	border: none;
	border-radius: 5px;
	cursor: pointer;
}

td input[type="submit"]:hover {
	background-color: #3e8e41;
}

h1 {
	text-align: center;
}

p {
	text-align: center;
	margin-top: 20px;
}

a {
	color: #337ab7;
	text-decoration: none;
}

a:hover {
	color: #23527c;
}
</style>
</head>
<body>
	<h1>Manager Registration</h1>
	<form action="ManagerDataServlet">
		<table>
			<tr>
				<th>Name:</th>
				<td><input type="text" name="fullName" required /></td>
			</tr>
			<tr>
				<th>Email:</th>
				<td><input type="email" name="email" required /></td>
			</tr>
			<tr>
				<th>Password:</th>
				<td><input type="password" name="password" required /></td>
			</tr>
			<tr>
				<th>Contact:</th>
				<td><input type="number" name="contact" required /></td>
			</tr>
			<tr>
				<th>Address:</th>
				<td><input type="text" name="address" required /></td>
			</tr>
			<tr>
				<th>Department:</th>
				<td><select name="department" required>
						<option value="">Select Department</option>
						<option value="dev">Development</option>
						<option value="test">Testing</option>
						<option value="fullstack">Full Stack Development</option>
				</select></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Register Manager" /></td>
			</tr>
		</table>
	</form>

	<p>
		Already have an account? <a href="managerLogin.jsp">Login here</a>
	</p>
</body>
</html>