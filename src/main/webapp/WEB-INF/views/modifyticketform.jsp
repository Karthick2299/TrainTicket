<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Modify Ticket </title>
</head>
<body>
<h3>Modify Ticket</h3>
    <br>
    <form action="/ticket/updateticketform" method="get"
        style="margin: 0;">
        <label>Enter Ticket Number </label> <input type="text" placeholder="Ticket Number"
            name="ticketNo"> <input type='submit' value="Submit" name="submit">
    </form>
</body>
</html>