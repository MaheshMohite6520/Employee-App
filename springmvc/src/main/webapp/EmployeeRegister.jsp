<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile Registration</title>
<style>
/* Styling for the body */
body {
	font-family: Arial, sans-serif;
	background: linear-gradient(135deg, #ff7e5f, #feb47b);
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
	margin: 0;
	color: #333;
}

/* Animation keyframes */
@
keyframes fadeIn {from { opacity:0;
	transform: translateY(-20px);
}

to {
	opacity: 1;
	transform: translateY(0);
}

}

/* Styling for the form container */
form {
	background: #ffffff;
	padding: 30px;
	border-radius: 10px;
	box-shadow: 0 10px 20px rgba(0, 0, 0, 0.2);
	width: 300px;
	text-align: center;
	animation: fadeIn 1s ease;
}

/* Styling for form heading */
h2 {
	margin-bottom: 20px;
	color: #ff7e5f;
}

/* Styling for input fields */
input[type="text"] {
	width: 100%;
	padding: 10px;
	margin: 10px 0;
	border: 1px solid #ddd;
	border-radius: 5px;
	font-size: 16px;
	transition: border-color 0.3s;
}

input[type="text"]:focus {
	border-color: #ff7e5f;
	outline: none;
}

/* Styling for the register button */
button {
	background-color: #ff7e5f;
	color: white;
	padding: 10px;
	border: none;
	border-radius: 5px;
	cursor: pointer;
	width: 100%;
	font-size: 18px;
	transition: background-color 0.3s, transform 0.2s;
}

button:hover {
	background-color: #feb47b;
	transform: scale(1.05);
}
</style>
</head>
<body>

	<form action="saveEmp">
		<h2>Profile Registration</h2>
		ID: <input type="text" name="id"> <br> Name: <input
			type="text" name="name"> <br> Phone: <input type="text"
			name="phone"> <br>
		<button>Register</button>
	</form>

</body>
</html>
