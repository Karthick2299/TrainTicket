<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Ticket And Ticket Detail</title>
</head>
<body>
<div id="root">
		<div id="form">
		<form:form action="" method="post" modelAttribute="ticket1">
				<div>
					<label for="userId">User Id</label>
					<div>
						<form:input path="userId" />
					</div>
				</div>
				<div>
					<label for="trainNo">Train Number</label>
					<div>
						<form:input path="trainNo" />
					</div>
				</div>
				<div>
					<label for="ticketNo">Ticket Number</label>
					<div>
						<form:input path="ticketNo" />
					</div>
				</div>
				<div>
					<label for="seatClass">Seat Class</label>
					<div>
						<form:input path="seatClass" />
					</div>
				</div>
				
				<div>
					<label for="travellingDate">Travel Date</label>
					<div>
						<form:input path="travellingDate" />
					</div>
				</div>
				<div>
					<label for="amount">Amount</label>
					<div>
						<form:input path="amount" />
					</div>
				</div>
				<div>
					<label for="pnr">PNR</label>
					<div>
						<form:input path="pnr" />
					</div>
				</div>
				<div>
					<label for="status">Status</label>
					<div>
						<form:input path="status" />
					</div>
				</div>
				<div>
					<label for="boardingStation">Boarding Station</label>
					<div>
						<form:input path="boardingStation" />
					</div>
				</div>
				<div>
					<label for="destinationStation">Destination Station</label>
					<div>
						<form:input path="destinationStation" />
					</div>
				</div>
				<div>
					<label for="boardingTime">Boarding Time</label>
					<div>
						<form:input path="boardingTime" />
					</div>
				</div>
				<div>
					<label for="arrivalTime">Arrival Time</label>
					<div>
						<form:input path="arrivalTime" />
					</div>
				</div>
		</form:form>
	</div>
	</div>
	<div id="table root">
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
				<c:forEach var="ticketdetail" items="${ticketdetail}">
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

</body>
</html>