<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Find User Form</title>
</head>
<body>
	<h3>Find User By Id</h3>
    <br>
    <form action="/user/getuserbyid" method="get"
        style="margin: 0;">
        <label>Enter User id </label> <input type="text" placeholder="user id"
            name="id"> <input type='submit' value="Fetch" name="submit">
    </form>

</body>
</html>