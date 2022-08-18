<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>User Modify Form</title>
</head>
<body>
    <h3>Modify User</h3>
    <br>
    <form action="/user/updateform" method="get"
        style="margin: 0;">
        <label>Enter user id </label> <input type="text" placeholder="user id"
            name="id"> <input type='submit' value="Submit" name="submit">
    </form>

</body>
</html>