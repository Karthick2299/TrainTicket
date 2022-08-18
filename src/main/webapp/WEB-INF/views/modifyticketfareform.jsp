<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Modify TicketFare</title>
</head>
<body>
<h3>Modify Ticket Fare</h3>
    <br>
    <form action="/ticketfare/updateticketfareform" method="get"
        style="margin: 0;">
        <label>Enter Train Number </label> <input type="text" placeholder="Train Number"
            name="TrainNo"> <input type='submit' value="Submit" name="submit">
    </form>
</body>
</html>