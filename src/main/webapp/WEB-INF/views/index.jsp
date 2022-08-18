<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
<style>
* {
	box-sizing: border-box;
}

body {
	background-image:
		url(https://www.teahub.io/photos/full/73-737422_hd-beautiful-scenery-4k-pic-for-android-hd.jpg);
	background-height: 768px;
	background-width: 1366px;
	background-attachment: fixed;
	background-size: cover;
	background-repeat: no-repeat;
}

.header {
	background-color: white;
	/* text-align: left; */
	padding: 30px;
	color: lime;
	font-weight: bold;
	font-size: 40px;
	padding-left: 25px;
	padding-bottom: 5px;
	font-variant: small-caps;
}

.container {
	background-color: white;
	display: flex;
}

.main {
	text-align: left;
	margin-left: 41%;
	/* margin-right: 33.3%; */
	padding: 10px;
	margin-bottom: 10px;
	/* 	width: 700px; */
	color: lime;
	/* float:right; */
	display: flex;
}

.dropdown-content {
	display: none;
	position: absolute;
	background-color: red;
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

.menu {
	border: 1px black solid;
	border-radius: 13px;
	background-color: white;
	color: lime;
	font-weight: bold;
	font-size: 18px;
	text-align: center;
	margin-right: 15px;
	padding: 5px;
	padding-left: 10px;
	padding-right: 10px;
	width: 130px;
}

.foot {
	text-align: center;
    color: cyan;
    font-weight: bold;
    font-size: 45px;
    padding-left: 25px;

}
</style>
</head>
<body>
	<div class="container">
		<span class="header "> Book My Train </span>
		<div class="main">
			<p class="menu">
				<a href="user/userloginform">Login</a>
			</p>
			<p class="menu">
				<a href="user/addform">New User </a>
			</p>
			<p class="menu">
				<a href="">Contact </a>
			</p>

		</div>
	</div>
	<div class="foot">Welcome To Indian Train Ticket Booking
		System</div>
</body>
</html>