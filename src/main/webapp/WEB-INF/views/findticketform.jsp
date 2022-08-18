<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Find Ticket</title>
</head>
<body>
<h3>Find Ticket</h3>
    <br>
    <form action="/ticket/getticketbyid" method="get"
        style="margin: 0;">
        <label>Enter Train Number </label> <input type="text" placeholder="Ticket Number"
            name="ticketNo"> <input type='submit' value="Fetch" name="submit">
    </form>
</body>
</html>