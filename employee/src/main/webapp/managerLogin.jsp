<!DOCTYPE html>
<html>
<head>
<title>Manager Login</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f0f0f0;
}

table {
	width: 30%;
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

td input[type="text"], td input[type="password"] {
	width: 100%;
	padding: 10px;
	border: 1px solid #ccc;
}

td input[type="submit"] {
	background-color: #4CAF50;
	color: #fff;
	padding: 10px 20px;
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
	<h1>Manager Login</h1>
	<form action="loginManager" method="post">
		<table>
			<tr>
				<th>Manager ID:</th>
				<td><input type="text" name="managerId" required /></td>
			</tr>
			<tr>
				<th>Password:</th>
				<td><input type="password" name="password" required /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Login" /></td>
			</tr>
		</table>
	</form>

	<p>
		Don't have an account? <a href="managerRegistration.jsp">Sign up</a>
	</p>
</body>
</html>