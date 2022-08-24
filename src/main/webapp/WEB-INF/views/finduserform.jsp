<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Find User Form</title>
<style><%@include file ="/WEB-INF/views/css/userprofile.css"%>
</style>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<div class="box">
    <h3>Find User Details</h3>
    <br>
    <form action="/user/getuserbyid" method="get" style="margin: 0;">
    <div class="from">
       <label>Enter user id </label> 
       <input type="text" placeholder="user id" name="id"> 
       </div>
       <div class="to"> 
       <input type='submit' value="Submit" name="submit">
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