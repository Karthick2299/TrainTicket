<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Re login</title>
<style>
* {
	box-sizing: border-box;
}

body {
	background-image:
		url(https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTsl4kA9gXajPE0_wlTJdB4ITIsplk7HPvDEQ&usqp=CAU);
	background-size: cover;
	background-repeat: no-repeat;
}
h4{
font-size: larger;
    color: red;
    margin-top: 61px;
    text-align: center;
    text-align: 18px;
    margin-bottom: -82px;
    margin-left: -59px;
}

.main {
	border: 1px blue solid;
	background-color: yellow;
	border-radius: 10px;
	text-align: center;
	margin-left: 22%;
	margin-right: 33.3%;
	padding: 10px;
	margin-bottom: 10px;
	width: 700px;
	color: red;
}

.menu {
	border: 1px black solid;
	border-radius: 13px;
	background-color: white;
	color: green;
	font-weight: bold;
	font-size: 18px;
	text-align: center;
	margin-right: 15px;
	padding: 5px;
	padding-left: 10px;
	padding-right: 10px;
	width: 130px;
}

a:hover {
	color: red;
}

a:link {
	color: green;
	text-decoration: none;
}

.tab {
	border: 1px black solid;
	border-radius: 15px;
	background-color: #FFE5CC;
	margin-left: 30%;
	width: 450px;
	color: red;
	font-weight: bold;
	font-style: normal;
	text-align: center;
	font-size: 22px;
	margin-bottom: 10px;
	padding: 10px;
}

.yel {
	color: yellow;
}

.red {
	color: red;
}

.green {
	color: green;
}

.brown {
	color: brown;
}

footer {
	margin-top: 15%;
}
.button{
	margin-top: 10px;
    width: 164px;
    height: 32px;
    font-size: 16px;
    background-color: cyan;
    border: 2pxsolidblue;
    border-radius: 5px;

}
.center {
	margin-top: 150px;
	margin-right: 50px;
}
.back{
   float: right;
   font-size: 15px;
    margin-top: 10px;
    color: black;
   }
.button3 {
    position: absolute;
    top: 8px;
    left: 16px;
    font-size: 20px;
    color: crimson;
    margin-top:8px;
    background-color: black;
    margin-left: 2px;
    border-radius: 10px;
    height: 41px;
    width: 38px;
     
}      
</style>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<h4>User Name And Password Not Found</h4>
	<div class="tab green center">User Login</div>
	<form action="checkuserloginform" class="tab brown" method="post" modelattribute="userlogin">
		<br />UserName: <input type="text" name="userName"><br /> <br />
		Password: <input type="password" name="userPassword"><br /> <br />
		<input type="submit" value=" LOGIN "><br />
		<div>
			<h3>
				<button class="button">
					<a href="/user/addform">Create New Account </a>
				</button>
			</h3>
		</div>
	</form>
	<br />
	<div>
		<a href="/"><button class="button3">
				<em class="fa fa-home"></em>
			</button></a>
	</div>
</body>
</html>