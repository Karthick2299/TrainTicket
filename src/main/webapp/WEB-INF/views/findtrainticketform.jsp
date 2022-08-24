<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Find Train And Ticket Book</title>
<style><%@include file ="/WEB-INF/views/css/findtrain.css"%>
</style>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
	<div class="box">
		<h2>Find Train And Ticket Book</h2>
		<br>
		<form action="/traindetail/gettrainticketbook" method="get"
			style="margin: 0;">
			<div class="main">
			<label>Enter Train Number </label> <br>
			<input type="text" placeholder="Train Number" name="TrainNo"> 
			<div class="menu">
			<input type='submit' value="Fetch" name="submit">
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