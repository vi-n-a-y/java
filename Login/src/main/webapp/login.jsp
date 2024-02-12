<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login page</title>
</head>
<body>
		<div>
		
				<form action="http://localhost:8080/Login/home" method="post"> 
					<table>
						<tr><td><label>UserName : </label> </td><td><input type="text" name="user_name" ></td></tr>
					
						<tr><td><label>Password : </label> </td><td><input type="text" name="user_pass" ></td></tr>
				   </table>
				
				<button>Submit</button>
				</form>
				
				<input type="reset">
				
				
				
				
		</div>
</body>
</html>