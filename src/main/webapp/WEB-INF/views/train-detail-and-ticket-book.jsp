<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Train Ticket Book</title>
</head>
<body>
<div id="root">
		<div id="form">
		<form:form action="" method="post" modelAttribute="traindetail1">
				<div>
					<label for="trainNo">Train Number</label>
					<div>
						<form:input path="trainNo" />
					</div>
				</div>
				<div>
					<label for="trainName"> Train Name</label>
					<div>
						<form:input path="trainName" />
					</div>
				</div>
				<div>
					<label for="startPlace">Start Place</label>
					<div>
						<form:input path="startPlace" />
					</div>
				</div>
				<div>
					<label for="destination"> Destination</label>
					<div>
						<form:input path="destination" />
					</div>
				</div>
				
				<div>
					<label for="arrivalTime">Arrival Time</label>
					<div>
						<form:input path="arrivalTime" />
					</div>
				</div>
				<div>
					<label for="departureTime">Departure Time</label>
					<div>
						<form:input path="departureTime" />
					</div>
				</div>
		</form:form>
	</div>
	</div>
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
				</tr>
			</thead>
			<tbody>
				<c:forEach var="tkt" items="${ticket}">
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
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>