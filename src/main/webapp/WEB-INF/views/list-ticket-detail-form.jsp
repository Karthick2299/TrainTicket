<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Ticket Detail List</title>
<style><%@include file ="/WEB-INF/views/css/admincontrol.css"%>
</style>
</head>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<body>
<div id="table root" class="align">
		<table>
		<caption></caption>
			<thead>
				<tr>
					<th>Ticket Number</th>
					<th>Seat Number</th>
					<th>Passenger Name</th>
					<th>Date Of Birth</th>
					<th>Gender</th>
					<th>Nationality</th>
					
				</tr>
			</thead>
			<tbody>
				<c:forEach var="ticketdetail" items="${allticketdetails}">
					<tr>
						<td>${ticketdetail.ticketNo}</td>
						<td>${ticketdetail.seatNo}</td>
						<td>${ticketdetail.passengerName}</td>
						<td>${ticketdetail.dob}</td>
						<td>${ticketdetail.gender}</td>
						<td>${ticketdetail.nationality}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<div>
		<a href="/admin/adminaccess"><button class="button3">
				<em class="fa fa-home"></em>
			</button></a>
	</div>
</body>
</html>