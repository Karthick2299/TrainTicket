<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Station And Train Details</title>
</head>
<body>
<div id="root">
		<div id="form">
		<form:form action="" method="post" modelAttribute="station">
				<div>
					<label for="stationId">Station Id</label>
					<div>
						<form:input path="stationId" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="stationName">Station Name</label>
					<div>
						<form:input path="stationName" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="stationAddress">Station address</label>
					<div>
						<form:input path="stationAddress" readonly="true"/>
					</div>
				</div>
				
		</form:form>
</div>
</div>
<div id="table root">
		<table border="2" width="100%" cellpadding="2">
			<thead>
				<tr>
					<th>Train Number</th>
					<th>Train Name</th>
					<th>Start Place</th>
					<th>Destination</th>
					<th>Arrival Time</th>
					<th>Departure Time</th>
					
				</tr>
			</thead>
			<tbody>
				<c:forEach var="trnd" items="${traindetail}">
					<tr>
						<td>${trnd.trainNo}</td>
						<td>${trnd.trainName}</td>
						<td>${trnd.startPlace}</td>
						<td>${trnd.destination}</td>
						<td>${trnd.arrivalTime}</td>
						<td>${trnd.departureTime}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>