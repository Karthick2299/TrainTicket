<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>find ticket</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form method="post" modelAttribute="getticketbyid">
				<div>
					<label for="userId">User Id</label>
					<div>
						<form:input path="userId" readonly="true" />
					</div>
				</div>
				<div>
					<label for="trainNo">Train Number</label>
					<div>
						<form:input path="trainNo" readonly="true" />
					</div>
				</div>
				<div>
					<label for="ticketNo">Ticket Number</label>
					<div>
						<form:input path="ticketNo" readonly="true" />
					</div>
				</div>
				<div>
					<label for="seatClass">Seat Class</label>
					<div>
						<form:input path="seatClass" readonly="true" />
					</div>
				</div>

				<div>
					<label for="travellingDate">Travel Date</label>
					<div>
						<form:input path="travellingDate" readonly="true" />
					</div>
				</div>
				<div>
					<label for="amount">Amount</label>
					<div>
						<form:input path="amount" readonly="true" />
					</div>
				</div>
				<div>
					<label for="pnr">PNR</label>
					<div>
						<form:input path="pnr" readonly="true" />
					</div>
				</div>
				<div>
					<label for="status">Status</label>
					<div>
						<form:input path="status" readonly="true" />
					</div>
				</div>
				<div>
					<label for="boardingStation">Boarding Station</label>
					<div>
						<form:input path="boardingStation" readonly="true" />
					</div>
				</div>
				<div>
					<label for="destinationStation">Destination Station</label>
					<div>
						<form:input path="destinationStation" readonly="true" />
					</div>
				</div>
				<div>
					<label for="boardingTime">Boarding Time</label>
					<div>
						<form:input path="boardingTime" readonly="true" />
					</div>
				</div>
				<div>
					<label for="arrivalTime">Arrival Time</label>
					<div>
						<form:input path="arrivalTime" readonly="true" />
					</div>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>