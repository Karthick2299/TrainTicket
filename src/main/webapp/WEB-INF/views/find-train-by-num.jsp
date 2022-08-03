<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Train By Number</title>
</head>
<body>
<div id="root">
		<div id="form">
		<form:form  method="post" modelAttribute="gettrainbynum">
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
</body>
</html>