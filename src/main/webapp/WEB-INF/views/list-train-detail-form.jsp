<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Train Detail</title>
<style><%@include file ="/WEB-INF/views/css/listtrain.css"%>
</style>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
	<h2>Train Detail</h2>
	<div id="table root">
		<div class="container">
			<table>
			<caption></caption>
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

					<c:forEach var="trnd" items="${alltrains}">

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
	</div>
	<div>
		<a href="/admin/adminaccess"><button class="button3">
				<em class="fa fa-home"></em>
			</button></a>
	</div>

</body>
</html>