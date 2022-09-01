<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Ticket Fare</title>
<style><%@include file ="/WEB-INF/views/css/station.css"%>
</style>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
  <div class="box">
   <h2>Ticket Amount</h2>
   
	<div id="table root">
		<table class="container">
		<caption></caption>
			<thead>
				<tr>
					<th>Train Number</th>
					<th>Max Seats</th>
					<th>Seat Class</th>
					<th>Fare</th>
					<th> book </th>

				</tr>
			</thead>
			<tbody>
				<c:forEach var="tktf" items="${alltktfare}">
					<tr>
						<td>${tktf.trainNo}</td>
						<td>${tktf.maxSeats}</td>
						<td>${tktf.seatClass}</td>
						<td>${tktf.fare}</td>
						<td> <button onclick="document.location='/ticketfare/getticketfarebyno?TrainNo=${tktf.trainNo}&class=${tktf.seatClass}'" class=movecenter>Check Amount</button>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>
	</div>
	<div>
		<a href="/user/useraccessa"><button class="button3">
				<em class="fa fa-home"></em>
			</button></a>
	</div>
</body>
</html>