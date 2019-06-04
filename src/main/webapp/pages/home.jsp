<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<h3>Add Employee</h3>
	<form action="addEmployee">
		ID:     <input type="text" name="id"/><br/>
		Name:   <input type="text" name="name"/><br/>
		Age:    <input type="text" name="age"/><br/>
		Salary: <input type="text" name="salary"/><br/>
		<input type=submit value="Submit"/>
	</form>
	<br/><br/>
	<h3>Delete Employee</h3>
	<form action="deleteEmployee">
		ID:     <input type="text" name="id"/><br/>
		<input type=submit value="Submit"/>
	</form>
</body>
</html>