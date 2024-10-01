<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Management System</title>
<link rel="stylesheet" href="styles.css">
<style>
    .message {
        position: fixed;
        top: 0;
        left: 50%;
        transform: translateX(-50%);
        background-color: #dff0d8;
        color: #3c763d;
        padding: 10px;
        border-radius: 5px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
        animation: fadeIn 2s;
    }

    @keyframes fadeIn {
        from {
            opacity: 0;
        }
        to {
            opacity: 1;
        }
    }
</style>
</head>
<body>
    <h1>Employee Management System</h1>

    <section>
        <h2 align="center">Welcome to the Employee Management System</h2>
        <p align="center">This system allows you to manage employee
            records, including adding, updating, and deleting employees.</p>
    </section>

    <div class="card-container">
        <div class="card">
            <div class="card-body">
                <h5 class="card-title">Add Employee</h5>
                <p class="card-text">Add a new employee to the system.</p>
                <a href="addEmployee.jsp" class="card-link">Add Employee</a>
            </div>
        </div>
        <div class="card">
            <div class="card-body">
                <h5 class="card-title">View Employees</h5>
                <p class="card-text">View all employees in the system.</p>
                <a href="fetch-emp" class="card-link">View Employees</a>
            </div>
        </div>
        <div class="card">
            <div class="card-body">
                <h5 class="card-title">Update Employee</h5>
                <p class="card-text">Update an existing employee's information.</p>
                <a href="updateEmployee.jsp" class="card-link">Update Employee</a>
            </div>
        </div>
        <div class="card">
            <div class="card-body">
                <h5 class="card-title">Delete Employee</h5>
                <p class="card-text">Delete an existing employee from the
                    system.</p>
                <a href="deleteEmployee.jsp" class="card-link">Delete Employee</a>
            </div>
        </div>
    </div>

    <%
        if (request.getAttribute("message") != null) {
    %>
    <div class="message">
        <%=request.getAttribute("message")%>
    </div>
    <%
        }
    %>

    <script>
        setTimeout(function() {
            document.querySelector(".message").style.display = "none";
        }, 5000);
    </script>

</body>
</html>