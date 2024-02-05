<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body>

<div>
<form action="RegiHome" method="post">
<table>
<tr><td><label>User Name : </label></td><td><input type="text" name="user_name" required></td></tr>
<tr><td><label>First Name : </label></td><td><input type="text" name="first_name" required></td></tr>
<tr><td><label>Last Name : </label></td><td><input type="text" name="last_name" required></td></tr>
<tr><td><label>Phone Number : </label></td><td><input type="text" name="phone_number" required></td></tr>
<tr><td><label>Email : </label></td><td><input type="text" name="email" required></td></tr>
  
</table>
<button>submit</button>
</form>
<input type="reset">
</div>



</body>
</html>