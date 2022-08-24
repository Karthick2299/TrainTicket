<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Find Train By Number</title>
<style><%@include file ="/WEB-INF/views/css/findtrain.css"%>
</style>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<div id="root" class="box">
		<h2>Train Detail</h2>
		<div id="form" class="detail">
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
	<div>
		<a href="/user/useraccessa"><button class="button3">
				<em class="fa fa-home"></em>
			</button></a>
	</div>
</body>
</html>