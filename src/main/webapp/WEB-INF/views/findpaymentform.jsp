<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Find Payment Detail</title>
<style type="text/css">
body{
	background-image: url("https://wallpaperaccess.com/full/4597111.jpg");
	background-attachment: fixed;
	background-repeat: no-repeat;
}
</style>
</head>
<body>
<h3>Find Payment</h3>
    <br>
    <form action="/paymentdetail/getpaymentbyno" method="get" style="margin: 0;">
        <label>Enter Ticket Number </label> <input type="text" placeholder="Ticket Number"
            name="ticketNo"> 
            <label>Enter Your Id</label> <input type="text" placeholder="Your Id"
            name="userId"> 
            <input type='submit' value="Fetch" name="submit">
    </form>
</body>
</html>