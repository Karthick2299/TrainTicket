<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>find ticket detail by ticket number</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form method="post" modelAttribute="getticketdetailbynum">
				<div>
					<label for="ticketNo">Ticket Number</label>
					<div>
						<form:input path="ticketNo" readonly="true" />
					</div>
				</div>
				<div>
					<label for="seatNo"> Seat Number</label>
					<div>
						<form:input path="seatNo" readonly="true" />
					</div>
				</div>
				<div>
					<label for="passengerName">Passenger Name</label>
					<div>
						<form:input path="passengerName" readonly="true" />
					</div>
				</div>
				<div>
					<label for="dob"> Date Of Birth</label>
					<div>
						<form:input path="dob" readonly="true" />
					</div>
				</div>

				<div>
					<label for="gender">Gender</label>
					<div>
						<form:input path="gender" readonly="true" />
					</div>
				</div>
				<div>
					<label for="nationality">Nationality</label>
					<div>
						<form:input path="nationality" readonly="true" />
					</div>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>