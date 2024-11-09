<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
	
	<%-- JSTL Tag Library for JSTL-Form --%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form:form action="update" modelAttribute="emp" method="get" >
	
		ID: <form:input path="id" readonly="true"/> <br>
		NAME: <form:input path="name"/> <br>
		PHONE: <form:input path="phone"/> <br>
		
		<form:button>UPDATE</form:button>
	
	</form:form>

</body>
</html>