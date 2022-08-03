<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Ticket Fare By Ticket Number</title>
</head>
<body>
<div id="root">
		<div id="form">
		<form:form  method="post" modelAttribute="getticketfarebynum">
				<div>
					<label for="trainNo">Train Number</label>
					<div>
						<form:input path="trainNo" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="travelDate">Travel Date</label>
					<div>
						<form:input path="travelDate" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="maxSeats">Max Seats</label>
					<div>
						<form:input path="maxSeats" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="seatClass">Seat Class</label>
					<div>
						<form:input path="seatClass" readonly="true"/>
					</div>
				</div>
				
				<div>
					<label for="fare">Fare</label>
					<div>
						<form:input path="fare" readonly="true"/>
					</div>
				</div>
		</form:form>
	</div>
	</div>
</body>
</html>