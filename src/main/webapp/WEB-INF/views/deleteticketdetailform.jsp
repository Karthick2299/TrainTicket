<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Delete Ticket Detail</title>
</head>
<body>
<h3>Delete Ticket Detail</h3>
    <br>
    <form action="/ticketdetail/deleteticketdetail" method="get"
        style="margin: 0;">
        <label>Enter Ticket Number </label> <input type="text" placeholder="Ticket Number"
            name="ticketNo">
            <label>Enter your name</label> <input type="text" placeholder="Enter Your Name"
            name="name">
             <input type='submit' value="Fetch" name="submit">
    </form>


</body>
</html>