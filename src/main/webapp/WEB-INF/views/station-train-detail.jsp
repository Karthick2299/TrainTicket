<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Station And Train Details</title>
<style type="text/css"><%@include file ="/WEB-INF/views/css/stationtraindetail.css"%>
</style>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
	
      <h3>Station Detail</h3>
<div id="root">
		<div id="form" class="main">
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
<br><br>
    <h3>Trains Detail</h3>
<div id="table root" class="menu">
		<table border="2" width="100%" cellpadding="2">
			<thead>
				<tr>
					<th>Train Number</th>
					<th>Train Name</th>
					<th>Start Place</th>
					<th>Destination</th>
					<th>Arrival Time</th>
					<th>Departure Time</th>
					<th>Fare Checking</th>
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
						<td><a href="/ticketfare/listtktfare?trainNo=${trnd.trainNo}"><button class=movecenter>Check Fare</button></a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<div>
		<a href="/user/useraccessa"><button class="button3">
				<em class="fa fa-home"></em>
			</button></a>
	</div>
</body>
</html>