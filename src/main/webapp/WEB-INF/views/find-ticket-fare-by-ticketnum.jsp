<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Find Ticket Fare By Ticket Number</title>
<style type="text/css"><%@include file ="/WEB-INF/views/css/findticketfare.css"%>
</style>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
	<div id="root" class="box">
		<div id="form">
			<form:form action="/ticket/addticketform" method="post"
				modelAttribute="getticketfarebynum">
				<div>
					<label for="trainNo">Train Number</label>
					<div>
						<form:input path="trainNo" readonly="true" />
					</div>
				</div>
				<div>
					<label for="maxSeats">Max Seats</label>
					<div>
						<form:input path="maxSeats" readonly="true" />
					</div>
				</div>
				<div>
					<label for="seatClass">Seat Class</label>
					<div>
						<form:input path="seatClass" readonly="true" />
					</div>
				</div>
				<div>
					<label for="fare">Fare</label>
					<div>
						<form:input path="fare" readonly="true" />
					</div>
				</div>
				<br>
				<form:button>Book Now</form:button>
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