<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>find Payment by Ticket number</title>
</head>
<body>
<div id="root">
		<div id="form">
		<form:form  method="post" modelAttribute="getpaymentbytktno">
				<div>
					<label for="ticketNo">Ticket Number</label>
					<div>
						<form:input path="ticketNo" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="userId"> User Id</label>
					<div>
						<form:input path="userId" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="amount"> Amount</label>
					<div>
						<form:input path="amount" readonly="true"/>
					</div>
				</div>
				
				<div>
					<label for="modeOfPayment">Mode Of Payment</label>
					<div>
						<form:input path="modeOfPayment" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="paymentDetails">Payment Detail</label>
					<div>
						<form:input path="paymentDetails" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="paymentDate">Payment Date</label>
					<div>
						<form:input path="paymentDate" readonly="true"/>
					</div>
				</div>
				
		</form:form>
	</div>
	</div>
</body>
</html>