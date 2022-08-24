<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Passenger Details</title>
<style><%@include file ="/WEB-INF/views/css/passenger.css"%>
</style>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
	
	<h3>Ticket Booking</h3>
	<div id="root">
		<div id="form">
			<form:form action="addpassengers" method="post"
				modelAttribute="ticketDetail">
				<div>
					<label for="ticketNo">Ticket Number</label>
					<div>
						<form:input path="ticketNo" readonly="true" />
					</div>
				</div>
				<div>
					<label for="seatNo"> Seat Number</label>
					<div>
						<form:input path="seatNo" title="Seat Number Can't Be Empty"
							required="true" />
					</div>
				</div>
				<div>
					<label for="passengerName">Passenger Name</label>
					<div>
						<form:input path="passengerName" title="Name can't be empty"
							pattern="^[A-Za-z]\\w{3,20}$" required="true" />
					</div>
				</div>
				<form:errors path="passengerName" cssClass="text-danger" />
				<div>
					<label for="dob"> Date Of Birth</label>
					<div>
						<form:input path="dob" type="date" required="true" />
					</div>
				</div>

				<div>
                    <label for="gender">Gender</label>
                    <form:select path="gender">
                        <form:option value="Male" label="Male" required="true" />
                        <form:option value="Female" label="Female" required="true" />
                        <form:option value="Other" label="Other" required="true" />
                    </form:select>
            </div>
				<form:errors path="gender" cssClass="text-danger" />
				<div>
					<label for="nationality">Nationality</label>
					<div>
						<form:input path="nationality" title=" Enter Your Nationality"
							required="true" />
					</div>
				</div>
				<form:errors path="nationality" cssClass="text-danger" />
				<div>
					<form:button>Apply</form:button>
				</div>
			</form:form>
		</div>
	</div>
	<div id="root">
		<table>
		<caption></caption>
			<thead>
				<tr>
					<th>Ticket Number</th>
					<th>Seat Number</th>
					<th>Passenger Name</th>
					<th>Date Of Birth</th>
					<th>Gender</th>
					<th>Nationality</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach var="ticketdetail" items="${ticketDetailList}">
					<tr>
						<td>${ticketdetail.ticketNo}</td>
						<td>${ticketdetail.seatNo}</td>
						<td>${ticketdetail.passengerName}</td>
						<td>${ticketdetail.dob}</td>
						<td>${ticketdetail.gender}</td>
						<td>${ticketdetail.nationality}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<div>
		<a href="/paymentdetail/addform?ticketNo=${ticketDetail.ticketNo}"><button>Pay
				And Confirm</button></a>
	</div>
	<div>
		<a href="/user/useraccessa"><button class="button3">
				<em class="fa fa-home"></em>
			</button></a>
	</div>

</body>
</html>