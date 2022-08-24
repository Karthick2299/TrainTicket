<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>User And Ticket</title>
</head>
<body>
<div id="root">
		<div id="form">
		<form:form action="" method="post" modelAttribute="user">
				<div>
					<label for="userId">User Id</label>
					<div>
						<form:input path="userId" />
					</div>
				</div>
				<div>
					<label for="userPassword"> Password</label>
					<div>
						<form:input path="userPassword" />
					</div>
				</div>
				<div>
					<label for="userName">User Name</label>
					<div>
						<form:input path="userName" />
					</div>
				</div>
				<div>
					<label for="dateOfBirth"> DOB</label>
					<div>
						<form:input path="dateOfBirth" />
					</div>
				</div>
				
				<div>
					<label for="gender">Gender</label>
					<div>
						<form:input path="gender" />
					</div>
				</div>
				<div>
					<label for="mailId">E-Mail</label>
					<div>
						<form:input path="mailId" />
					</div>
				</div>
				<div>
					<label for="phoneNumber">Phone Number</label>
					<div>
						<form:input path="phoneNumber" />
					</div>
				</div>
				<div>
					<label for="address">Address</label>
					<div>
						<form:input path="address" />
					</div>
				</div>
				<div>
					<label for="nationality">Nationality</label>
					<div>
						<form:input path="nationality" />
					</div>
				</div>
				</form:form>
	</div>
	</div>
	<div id="table root">
		<table>
		<caption></caption>
			<thead>
				<tr>
					<th>User Id</th>
					<th>Train Number</th>
					<th>Ticket Number</th>
					<th>Seat Class</th>
					<th>Travelling Date</th>
					<th>Amount</th>
					<th>PNR</th>
					<th>Status</th>
					<th>Boarding Station</th>
					<th>Destination Station</th>
					<th>Boarding Time</th>
					<th>Arrival Time</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="tkt" items="${ticket}">
					<tr>
						<td>${tkt.userId}</td>
						<td>${tkt.trainNo}</td>
						<td>${tkt.ticketNo}</td>
						<td>${tkt.seatClass}</td>
						<td>${tkt.travellingDate}</td>
						<td>${tkt.amount}</td>
						<td>${tkt.pnr}</td>
						<td>${tkt.status}</td>
						<td>${tkt.boardingStation}</td>
						<td>${tkt.destinationStation}</td>
						<td>${tkt.boardingTime}</td>
						<td>${tkt.arrivalTime}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>