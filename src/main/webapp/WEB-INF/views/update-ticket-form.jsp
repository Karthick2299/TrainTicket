<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Update Ticket</title>
<style><%@include file ="/WEB-INF/views/css/updateticket.css"%>
</style>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<div id="root" class="box1">
 <h3>Update Your Ticket</h3>
		<div id="form">
			<form:form action="updatetk" method="post"
				modelAttribute="updateticket">
				<div>
					<label for="userId">User Id</label>
					<div>
						<form:input path="userId" readonly="true"/>
					</div>
				</div>
				<form:errors path="userId" cssClass="text-danger" />
				<div>
					<label for="trainNo">Train Number</label>
					<div>
						<form:input path="trainNo" title="It's Contain a Number" required="true"/>
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
						<form:input path="seatClass" title="Choose your Seat Class" required="true"/>
					</div>
				</div>
				<form:errors path="seatClass" cssClass="text-danger" />
				<div>
					<label for="travellingDate">Travel Date</label>
					<div>
						<form:input path="travellingDate" type="date"/>
					</div>
				</div>
				<div>
					<label for="amount">Amount</label>
					<div>
						<form:input path="amount" tiltle="Put the Amount" required="true"/>
					</div>
				</div>

				<div>
					<label for="status">Status</label>
					<div>
						<form:input path="status" title="Enter Booking Status" pattern="^[A-Za-z]\\w{3,20}$" required="true"/>
					</div>
				</div>
				<form:errors path="status" cssClass="text-danger" />
				<div>
					<label for="boardingStation">Boarding Station</label>
					<div>
						<form:input path="boardingStation" title="Enter Boarding Station" pattern="^[A-Za-z]\\w{1,10}$" required="true"/>
					</div>
				</div>
				<form:errors path="boardingStation" cssClass="text-danger" />
				<div>
					<label for="destinationStation">Destination Station</label>
					<div>
						<form:input path="destinationStation" title="Enter Destination Station" pattern="^[A-Za-z]\\w{1,10}$" required="true"/>
					</div>
				</div>
				<form:errors path="destinationStation" cssClass="text-danger" />
				<div>
					<label for="boardingTime">Boarding Time</label>
					<div>
						<form:input path="boardingTime" type="time" required="true"/>
					</div>
				</div>
				<div>
					<label for="arrivalTime">Arrival Time</label>
					<div>
						<form:input path="arrivalTime" type="time" required="true"/>
					</div>
				</div><br>
				<div>
					<form:button>Update Ticket</form:button>
				</div>
			</form:form>
		</div>
	</div>
	 <div>
		<a href="/user/useraccessa"><button class="button3">
				<em class="fa fa-home"></em>
			</button></a>
	</div>
</body>
</html>