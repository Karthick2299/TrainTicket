<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>list Ticket Payment Detail form</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form  method="post"
				modelAttribute="ticket">
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
	<div id="root">
		<div id="form">
		<form:form  method="post" modelAttribute="paymentdetail">
				<div>
					<label for="ticketNo">Ticket Number</label>
					<div>
						<form:input path="ticketNo" />
					</div>
				</div>
				<div>
					<label for="userId"> User Id</label>
					<div>
						<form:input path="userId" />
					</div>
				</div>
				<div>
					<label for="receiptNo">Receipt Number</label>
					<div>
						<form:input path="receiptNo" />
					</div>
				</div>
				<div>
					<label for="amount"> Amount</label>
					<div>
						<form:input path="amount" />
					</div>
				</div>
				
				<div>
					<label for="modeOfPayment">Mode Of Payment</label>
					<div>
						<form:input path="modeOfPayment" />
					</div>
				</div>
				<div>
					<label for="paymentDetails">Payment Detail</label>
					<div>
						<form:input path="paymentDetails" />
					</div>
				</div>
				<div>
					<label for="paymentDate">Payment Date</label>
					<div>
						<form:input path="paymentDate" />
					</div>
				</div>
				
		</form:form>
	</div>
	</div>
</body>
</html>