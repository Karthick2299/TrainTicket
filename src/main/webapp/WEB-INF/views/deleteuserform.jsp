<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Delete User Form</title>
</head>
<body>
	<h3>Delete User</h3>
    <br>
    <form action="/user/deleteuser" method="get"
        style="margin: 0;">
        <label>Enter User id </label> <input type="text" placeholder="user id"
            name="id"> <input type='submit' value="delete" name="submit">
    </form>
</body>
</html>