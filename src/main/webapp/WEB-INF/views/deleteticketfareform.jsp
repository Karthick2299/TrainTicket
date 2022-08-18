<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Delete Ticket Fare</title>
</head>
<body>
<h3>Delete Ticket Fare</h3>
    <br>
    <form action="/ticketfare/deleteticketfareform" method="get"
        style="margin: 0;">
        <label>Enter Train Number </label> <input type="text" placeholder="Train Number"
            name="TrainNo"> <input type='submit' value="Delete" name="submit">
    </form>
</body>
</html>