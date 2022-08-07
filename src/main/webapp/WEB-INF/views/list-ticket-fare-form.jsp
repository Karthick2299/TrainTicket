<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>s
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ticket Fare</title>
</head>
<body>
	<div id="table root">
		<table  border="2" width="100%" cellpadding="2">
			<thead>
				<tr>
					<th>Train Number</th>
					<th>Max Seats</th>
					<th>Seat Class</th>
					<th>Fare</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach var="tktf" items="${alltktfare}">
					<tr>
						<td>${tktf.trainNo}</td>
						<td>${tktf.maxSeats}</td>
						<td>${tktf.seatClass}</td>
						<td>${tktf.fare}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>