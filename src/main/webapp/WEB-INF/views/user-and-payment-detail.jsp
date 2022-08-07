<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User And Payment Detail</title>
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
			<thead>
				<tr>
					<th>Ticket Number</th>
					<th>User Id</th>
					<th>Receipt Number</th>
					<th>Amount</th>
					<th>Mode Of Payment</th>
					<th>Payment Detail</th>
					<th>Payment Date</th>
					
				</tr>
			</thead>
			<tbody>
				<c:forEach var="pdf" items="${payment}">
					<tr>
						<td>${pdf.ticketNo}</td>
						<td>${pdf.userId}</td>
						<td>${pdf.receiptNo}</td>
						<td>${pdf.amount}</td>
						<td>${pdf.modeOfPayment}</td>
						<td>${pdf.paymentDetails}</td>
						<td>${pdf.paymentDate}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>