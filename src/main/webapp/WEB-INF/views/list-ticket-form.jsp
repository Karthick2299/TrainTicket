<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Ticket list</title>
</head>
<body>
<div id="table root">
		<table  border="2" width="100%" cellpadding="2">
			<thead>
				<tr>
					<th>User Id</th>
					<th>Train Number</th>
					<th>Ticket Number</th>
					<th>Seat Class</th>
					<th>Travelling Date</th>
					<th>Amount</th>
					<th>PNR</th>
					<th>Status</th>
					<th>Boarding Station</th>
					<th>Destination Station</th>
					<th>Boarding Time</th>
					<th>Arrival Time</th>
					<th>Confirm Your Ticket</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="tkt" items="${alltickets}">
					<tr>
						<td>${tkt.userId}</td>
						<td>${tkt.trainNo}</td>
						<td>${tkt.ticketNo}</td>
						<td>${tkt.seatClass}</td>
						<td>${tkt.travellingDate}</td>
						<td>${tkt.amount}</td>
						<td>${tkt.pnr}</td>
						<td>${tkt.status}</td>
						<td>${tkt.boardingStation}</td>
						<td>${tkt.destinationStation}</td>
						<td>${tkt.boardingTime}</td>
						<td>${tkt.arrivalTime}</td>
						<td><a href="/paymentdetail/addform">Pay And Confirm</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>