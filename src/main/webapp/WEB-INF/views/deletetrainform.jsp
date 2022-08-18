<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Delete Train </title>
</head>
<body>
<h3>Delete Train</h3>
    <br>
    <form action="/traindetail/deletetrain" method="get"
        style="margin: 0;">
        <label>Enter Train Number </label> <input type="text" placeholder="Train Number"
            name="TrainNo"> <input type='submit' value="Delete" name="submit">
    </form>

</body>
</html>