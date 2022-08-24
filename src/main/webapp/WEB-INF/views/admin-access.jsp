<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Admin Access</title>
<style><%@include file ="/WEB-INF/views/css/adminaccess.css"%>
</style>
</head>
<body>
	<h1>Welcome Admin</h1>

	<div class="navbar">
		<div class="dropdown">
			<button class="dropbtn">
				Stations<em class="fa fa-caret-down"></em>
			</button>
			<div class="dropdown-content">
				<a href="/station/addstationform">Add New Station</a>
				<a href="/station/modifystation">Update Station</a>
				<a href="/station/removestation">Remove Station</a>
			</div>
		</div>

		<div class="dropdown">
			<button class="dropbtn">
				Train Detail <em class="fa fa-caret-down"></em>
			</button>
			<div class="dropdown-content">
				<a href="/traindetail/listtrain">List Of Trains</a> <a
					href="/traindetail/addtrainform">Add New Train</a> <a
					href="/traindetail/modifytraindetail">Modify Train Detail</a> 
					<a href="/traindetail/deletetraindetail">Remove Train Detail</a>
					<a href="/traindetail/findtrainticketbook">Find Trains And Ticket Booked Details</a>
					
			</div>
		</div>

		<div class="dropdown">
			<button class="dropbtn">
				TicketFare Details <em class="fa fa-caret-down"></em>
			</button>
			<div class="dropdown-content"> 
				<a href="/ticketfare/addticketfareform">New TicketFare </a>
				 <a	href="/ticketfare/modifyticketfare">Update TicketFare</a>
				 <a	href="/ticketfare/deleteticketfare">Remove TicketFare</a>
			</div>
		</div>
		<div class="dropdown">
			<button class="dropbtn">
			 Booking Status <em class="fa fa-caret-down"></em>
			</button>
			<div class="dropdown-content"> 
				<a href="/ticketdetail/listticketdetail">List Of Booking Details</a> 
			</div>
		</div>
		<div class="dropdown">
			<button class="dropbtn">
				Payments <em class="fa fa-caret-down"></em>
			</button>
			<div class="dropdown-content">
				<a href="/paymentdetail/listpayment">View Profile</a>  
			</div>
			
		</div>
		<div>
		<a class="right-side" href="/">Log Out</a>
		</div>
	</div>
	
</body>

</body>
</html>