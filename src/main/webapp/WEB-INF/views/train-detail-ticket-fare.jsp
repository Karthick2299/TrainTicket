<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<div id="root">
		<div id="form">
		<form:form action="" method="post" modelAttribute="traindetail">
				<div>
					<label for="trainNo">Train Number</label>
					<div>
						<form:input path="trainNo" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="trainName"> Train Name</label>
					<div>
						<form:input path="trainName" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="startPlace">Start Place</label>
					<div>
						<form:input path="startPlace" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="destination"> Destination</label>
					<div>
						<form:input path="destination" readonly="true"/>
					</div>
				</div>
				
				<div>
					<label for="arrivalTime">Arrival Time</label>
					<div>
						<form:input path="arrivalTime" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="departureTime">Departure Time</label>
					<div>
						<form:input path="departureTime" readonly="true"/>
					</div>
				</div>
				
		</form:form>
	</div>
	</div>
	<div id="table root">
		<table  border="2" width="100%" cellpadding="2">
			<thead>
				<tr>
					<th>Train Number</th>
					<th>Travel Date</th>
					<th>Max Seats</th>
					<th>Seat Class</th>
					<th>Fare</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach var="tktf" items="${ticketfare}">
					<tr>
						<td>${tktf.trainNo}</td>
						<td>${tktf.travelDate}</td>
						<td>${tktf.maxSeats}</td>
						<td>${tktf.seatClass}</td>
						<td>${tktf.fare}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>