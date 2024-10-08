<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Employee</title>
<link rel="stylesheet" href="UpdateEmployee.css">
</head>
<body>
	<h1>Update Employee</h1>

    <div class="card-container">
        <div class="card">
            <div class="card-body">
                <h5 class="card-title">Update by Employee ID</h5>
                <p class="card-text">Update an employee's information by their ID.</p>
                <form action="update-by-id">
                    <div class="form-group">
                        <label for="eid">Employee ID:</label>
                        <input type="number" id="eid" name="eid" placeholder="Enter Employee ID" required="required">
                    </div>
                    <div class="button-group">
                        <input type="submit" value="Fetch Employee" class="btn btn-primary">
                        <button type="button" class="btn btn-secondary" onclick="goBack()">Back</button>
                    </div>
                </form>
            </div>
        </div>
    </div>

    <script>
        // Function to go back to the index.jsp page
        function goBack() {
            window.location.href = 'index.jsp';
        }
    </script>
</body>
</html>