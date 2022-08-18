<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Update Train Detail</title>
</head>
<body>
<div id="root">
		<div id="form">
		<form:form action="updatetn" method="post" modelAttribute="updatetrain">
				<div>
					<label for="trainNo">Train Number</label>
					<div>
						<form:input path="trainNo" readonly="true"/>
					</div>
				</div>
				<form:errors path="trainNo" cssClass="text-danger" />
				<div>
					<label for="trainName"> Train Name</label>
					<div>
						<form:input path="trainName"   title="Name can't be empty"
						pattern="^[A-Za-z]\\w{3,20}$" required="true"/>
					</div>
				</div>
				<form:errors path="trainName" cssClass="text-danger" />
				<div>
					<label for="startPlace">Start Place</label>
					<div>
						<form:input path="startPlace"  title="Source place can't be empty"
						pattern="^[A-Za-z]\\w{1,10}$" required="true"/>
					</div>
				</div>
				<form:errors path="startPlace" cssClass="text-danger" />
				<div>
					<label for="destination"> Destination</label>
					<div>
						<form:input path="destination" title="Destination can't be empty"
						pattern="^[A-Za-z]\\w{1,10}$" required="true"/>
					</div>
				</div>
				<form:errors path="destination" cssClass="text-danger" />
				<div>
					<label for="arrivalTime">Arrival Time</label>
					<div>
						<form:input path="arrivalTime" required="true" type="time"/>
					</div>
				</div>
				<form:errors path="arrivalTime" cssClass="text-danger" />
				<div>
					<label for="departureTime">Departure Time</label>
					<div>
						<form:input path="departureTime" required="true" type="time"/>
					</div>
				</div>
				<form:errors path="departureTime" cssClass="text-danger" />
				<div>
				<form:button>Update Train</form:button>
		        </div>
		</form:form>
	</div>
	</div>
</body>
</html>