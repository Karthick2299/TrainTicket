<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>train</title>
<style>
* {
	box-sizing: border-box;
}

body {
	background-image: url(https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTsl4kA9gXajPE0_wlTJdB4ITIsplk7HPvDEQ&usqp=CAU);
	background-size: cover; 
	background-repeat:no-repeat;
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
h3 {
	color: #eb3434;
	text-align: center;
}
.button {
    margin-top: 10px;
    width: 130px;
    height: 38px;
    font-size: 15px;
    background-color: deepskyblue;
    border: 2px solid blue;
    border-radius: 5px;
}

</style>
</head>
<body>
	
	<h3>User Id and Password Not Found </h3>

	<div class="tab green">User Login</div>
	<form action="checkuserloginform" class="tab brown" method="post"
		modelattribute="userlogin">
		<br />UserName: <input type="text" name="userName"><br />
		<br /> Password: <input type="password" name="userPassword"><br />
		<br /> <input type="submit" value=" LOGIN "><br />
		<div>
			<h3>
				<button class="button"><a href="/user/addform">Create New Account </a></button>
			</h3>
		</div>
	</form>
	<br />
</body>
</body>
</html>