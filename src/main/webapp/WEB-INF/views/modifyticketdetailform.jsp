<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Modify Ticket Detail</title>
</head>
<body>
<h3>Modify Ticket Detail</h3>
    <br>
    <form action="/ticketdetail/updateform" method="get"
        style="margin: 0;">
        <label>Enter Train Number </label> <input type="text" placeholder="Ticket Number"
            name="ticketNo"> 
            <label>Enter Your Name</label> <input type="text" placeholder="Your Name"
            name="name"> 
            <input type='submit' value="Submit" name="submit">
    </form>

</body>
</html>