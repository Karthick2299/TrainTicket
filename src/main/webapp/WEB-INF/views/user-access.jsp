<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>User Access</title>

<style>
body {
	background-image:
		url("https://media.istockphoto.com/photos/abstract-defocused-blue-soft-background-picture-id937025430?b=1&k=20&m=937025430&s=170667a&w=0&h=dV83s5bygLIt2r5MJm5ARhXmWxtq8CtS5YMuydofQe8=");
	background-height: 500px;
	background-width: 500px;
	background-attachment: fixed;
	background-size: cover;
	font-family: Arial, Helvetica, sans-serif;
}

h1 {
	font-family: lucida Handwriting, Cursive;
    color: hotpink;

}

.navbar {
	overflow: hidden;
	/*     background-color: #38fca4; */
}

.navbar a {
	float: left;
	font-size: 16px;
	/* color: white; */
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}

.dropdown {
	float: left;
	overflow: hidden;
}

.dropdown .dropbtn {
	font-size: 30px;
    border: none;
    outline: none;
    color: orangered;
    padding: 14px 16px;
    background-color: inherit;
    font-family: serif;
    font-weight: bold;
}

a:hover, .dropdown:hover .dropbtn {
	/*     background-color: #fff;
 */
	
}

.dropdown-content {
	display: none;
	position: absolute;
	background-color: #f9f9f9;
	min-width: 160px;
	box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
	z-index: 1;
}

.dropdown-content a {
	float: none;
	color: black;
	padding: 12px 16px;
	text-decoration: none;
	display: block;
	text-align: left;
}

.dropdown-content a:hover {
	background-color: #ddd;
}

.dropdown:hover .dropdown-content {
	display: block;
}
</style>
</head>
<body>
	<h1 align="center">Welcome To The User</h1>

	<div class="navbar">
		<div class="dropdown">
			<button class="dropbtn">
				Stations<em class="fa fa-caret-down"></em>
			</button>
			<div class="dropdown-content">
				<a href="/station/liststation">List Of Stations</a> <a
					href="/station/getstationstartplace?name=">Fetch Starting place</a>
			</div>
		</div>

		<div class="dropdown">
			<button class="dropbtn">
				Train Detail <i class="fa fa-caret-down"></i>
			</button>
			<div class="dropdown-content">
				<a href="/traindetail/listtrain">List Of Trains</a> <a
					href="/traindetail/findtraindetail">Find Trains</a> <a
					href="/traindetail/gettrainticketfare">Find Trains And Ticket
					Amount</a> <a href="/traindetail/gettrainticketbook">Find Trains
					And Ticket Book</a>
			</div>
		</div>

		<div class="dropdown">
			<button class="dropbtn">
				Ticket <i class="fa fa-caret-down"></i>
			</button>
			<div class="dropdown-content">
				<a href="/ticket/addticketform">Book Ticket</a> 
				<a href="/ticket/modifyticket">Update Ticket</a>
				 <a	href="/ticket/removeticket">Cancel Ticket</a>
				 <a	href="/ticket/findticket">Find your Ticket</a>
			</div>
		</div>
		<div class="dropdown">
			<button class="dropbtn">
				Payments <i class="fa fa-caret-down"></i>
			</button>
			<div class="dropdown-content">
				<a href="/paymentdetail/addform">New Payment</a> 
				<a href="/paymentdetail/removepayment">Remove Payment</a> 
				<a href="/paymentdetail/findpayment">Find Your Transaction</a>
			</div>
		</div>
		<div class="dropdown">
			<button class="dropbtn">
				User Profile <i class="fa fa-caret-down"></i>
			</button>
			<div class="dropdown-content">
				<a href="/user/finduser">View Profile</a> 
				<a href="/user/modifyuser">Update Profile</a> 
			</div>
		</div>
	</div>
</body>
</html>