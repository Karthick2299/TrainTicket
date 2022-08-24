<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>User Access</title>
<style><%@include file ="/WEB-INF/views/css/useraccess.css"%>
</style>
</head>
<body>
	<h1>Welcome</h1>

	<div class="navbar">
		<div class="dropdown">
			<button class="dropbtn">
				Stations<em class="fa fa-caret-down"></em>
			</button>
			<div class="dropdown-content">
				<a href="/station/liststation">List Of Stations</a>
			</div>
		</div>

		<div class="dropdown">
			<button class="dropbtn">
				Train Detail <em class="fa fa-caret-down"></em>
			</button>
			<div class="dropdown-content">
				<a href="/traindetail/listtrain">List Of Trains</a> 
				<a href="/traindetail/findtraindetail">Find Train</a>
					
			</div>
		</div>

		<div class="dropdown">
			<button class="dropbtn">
				Ticket <em class="fa fa-caret-down"></em>
			</button>
			<div class="dropdown-content"> 
				<a href="/ticket/modifyticket">Update Ticket</a>
				 <a	href="/ticket/removeticket">Cancel Your Ticket</a>
				 <a	href="/ticket/findticket">Your Ticket Details</a>
			</div>
		</div>
		<div class="dropdown">
			<button class="dropbtn">
				Payments <em class="fa fa-caret-down"></em>
			</button>
			<div class="dropdown-content"> 
				<a href="/paymentdetail/removepayment">Remove Payment</a> 
				<a href="/paymentdetail/findpayment">Find Your Transaction</a>
			</div>
		</div>
		<div class="dropdown">
			<button class="dropbtn">
				User Profile <em class="fa fa-caret-down"></em>
			</button>
			<div class="dropdown-content">
				<a href="/user/finduser">View Profile</a> 
				<a href="/user/modifyuser">Update Profile</a> 
			</div>
			
		</div>
		<div>
		<a class="right-side" href="/">Log Out</a>
		</div>
	</div>
	
</body>
</html>