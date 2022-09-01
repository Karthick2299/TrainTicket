<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Add Ticket</title>
<style><%@include file ="/WEB-INF/views/css/ticket.css"%>
</style>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script>
<%@include file ="/WEB-INF/views/js/date.js"%>
</script>
</head>
<body>
<h2>Welcome To Train Ticket Booking ${loggeduser.userName}!</h2>
<div id="root" class="box">
		<div id="form">
		<form:form action="newticket" method="post" modelAttribute="addticket">
				<div>
					<label for="userId"></label>
					<div>
						<form:input path="userId" type="hidden" required="true" />
					</div>
				</div>
				<div>
					<label for="trainNo">Train Number</label>
					<div>
						<form:input path="trainNo" title="It's Contain a Number" required="true"/>
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
						<form:input path="travellingDate" type="date" id="travelDate" title="Select Your Travelling Date" 
						onblur="travelDateCheck()" required="true" />
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
						<form:input path="status" required="true"/>
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
						<form:input path="boardingTime" type="time" required="true" class="input"/>
					</div>
				</div>
				<form:errors path="boardingTime" cssClass="text-danger" />
				<div>
					<label for="arrivalTime">Arrival Time</label>
					<div>
						<form:input path="arrivalTime" type="time" required="true" class="input"/>
					</div>
				</div>
				<form:errors path="arrivalTime" cssClass="text-danger" />
				<br>
				<div>
				<form:button>Book Ticket</form:button>
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