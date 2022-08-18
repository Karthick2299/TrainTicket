<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Train Detail</title>
<style>
.movecenter{
margin-left : 77px
}
</style>
</head>
<body>
	<div id="table root">

		<table border="2" width="100%" cellpadding="2">

			<thead>

				<tr>
					<th>Train Number</th>
					<th>Train Name</th>
					<th>Start Place</th>
					<th>Destination</th>
					<th>Arrival Time</th>
					<th>Departure Time</th>
					<th>Booking</th>

				</tr>
			</thead>
			<tbody>
			
				<c:forEach var="trnd" items="${alltrains}">
				
					<tr>
						<td>${trnd.trainNo}</td>
						<td>${trnd.trainName}</td>
						<td>${trnd.startPlace}</td>
						<td>${trnd.destination}</td>
						<td>${trnd.arrivalTime}</td>
						<td>${trnd.departureTime}</td>
						<td> <button onclick="document.location='/ticket/addticketform'" class=movecenter>Book Now</button>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		

		</table>
	</div>

</body>
</html>