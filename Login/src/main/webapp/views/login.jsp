<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<h1>${errorMsg}</h1>
<form method="post">
<input type="text" name="userId" placeholder="User ID" /><br>
<br>
<input type="password" name="password" placeholder="Password" /><br>

<button>Submit</button>
</form>
</body>
</html>