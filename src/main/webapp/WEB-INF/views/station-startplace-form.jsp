<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Station Start Place</title>
<style type="text/css"><%@include file ="/WEB-INF/views/css/startplace.css"%>
</style>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
	<div class="box">
	<h3 class="place">Start Place</h3>
	<br>
	<form action="/station/getstationstartplace" method="get"
		style="margin: 0;">
		<div class="code">
			<label>Enter Station Code </label> 
			<input type="text" placeholder="Station Code" name="name" required="true" >
		<div class="submit">	
		    <input type='submit' value="Submit" name="submit">
		</div>    
		</div>
	</form>
	</div>
	<div>
		<a href="/user/useraccessa"><button class="button3">
				<em class="fa fa-home"></em>
			</button></a>
	</div>
</body>
</html>