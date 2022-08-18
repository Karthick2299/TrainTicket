<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Station Start Place</title>
</head>
<body>
 <h3>Start Place</h3>
    <br>
    <form action="/station/getstationstartplace" method="get"
        style="margin: 0;">
        <label>Enter Station Code </label> <input type="text" placeholder="Station Code"
            name="name"> <input type='submit' value="Submit" name="submit">
    </form>
</body>
</html>