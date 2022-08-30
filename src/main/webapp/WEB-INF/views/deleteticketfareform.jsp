<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Delete Ticket Fare</title>
<style><%@include file ="/WEB-INF/views/css/admincontrol.css"%>
</style>
</head>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<body>
<div>
<h3>Delete Ticket Fare</h3>
    <br>
    <form action="/ticketfare/deleteticketfareform" method="get"
        style="margin: 0;">
        <label>Enter Train Number </label>
         <input type="text" placeholder="Train Number" name="TrainNo">
          <label>Seat Class </label>
           <input type="text" placeholder="Seat Class" name="class">
          <input type='submit' value="Delete" name="submit">
    </form>
    </div>
    <div>
		<a href="/admin/adminaccess"><button class="button3">
				<em class="fa fa-home"></em>
			</button></a>
	</div>
</body>
</html>