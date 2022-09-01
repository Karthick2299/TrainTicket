<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Delete Payment</title>
<style><%@include file ="/WEB-INF/views/css/updateticket.css"%>
</style>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<div class="box">
<h3>Cancel Ticket</h3>
    <br>
    <form action="/paymentdetail/deletepayment" method="get"
        style="margin: 0;">
        <div class="main">
        <label>Enter Ticket Number </label> <input type="text" placeholder="Ticket Number"
            name="ticketNo"><br>
         </div>
         <div class="menu">   
         <label>Enter Your Id</label></div><div class="menu1"> <input type="number" placeholder="Your id"
            name="userId"> </div> <br>
            
            <input type='submit' value="Cancel" name="submit">
    </form>
    </div>
	<div>
		<a href="/user/useraccessa"><button class="button3">
				<em class="fa fa-home"></em>
			</button></a>
	</div>
</body>
</html>