<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ticket Detail List</title>
</head>
<body>
<div id="table root">
		<table>
			<thead>
				<tr>
					<th>Ticket Number</th>
					<th>Seat Number</th>
					<th>Passenger Name</th>
					<th>Age</th>
					<th>Gender</th>
					<th>Nationality</th>
					
				</tr>
			</thead>
			<tbody>
				<c:forEach var="tktd" items="${allticketdetails}">
					<tr>
						<td>${tktd.ticketNo}</td>
						<td>${tktd.seatNo}</td>
						<td>${tktd.passengerName}</td>
						<td>${tktd.age}</td>
						<td>${tktd.gender}</td>
						<td>${tktd.nationality}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>