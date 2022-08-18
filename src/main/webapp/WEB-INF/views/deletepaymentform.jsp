<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Delete Payment</title>
</head>
<body>
<h3>Delete Payment</h3>
    <br>
    <form action="/paymentdetail/deletepayment" method="get"
        style="margin: 0;">
        <label>Enter Ticket Number </label> <input type="text" placeholder="Ticket Number"
            name="ticketNo"> 
            <label>Enter Your Id</label> <input type="text" placeholder="Your Id"
            name="userId"> 
            <input type='submit' value="Delete" name="submit">
    </form>

</body>
</html>