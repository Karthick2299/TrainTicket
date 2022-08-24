<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style>
<%@include file ="/WEB-INF/views/css/user.css"%>
</style>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
	
	<div class="tab green center">User Login</div>
	<form action="checkuserloginform" class="tab brown" method="post"
		modelattribute="userlogin">
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