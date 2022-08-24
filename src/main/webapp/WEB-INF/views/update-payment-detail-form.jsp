<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Update Payment Detail</title>
<style type="text/css">
.text-danger {
	color: #e80c4d;
	font-size: 0.9em;
}
</style>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="modifypayment" method="post"
				modelAttribute="updatepayment">
				<div>
					<label for="ticketNo">Ticket Number</label>
					<div>
						<form:input path="ticketNo" title="Enter ticket Number" required="true"/>
					</div>
				</div>
				<div>
					<label for="userId"> User Id</label>
					<div>
						<form:input path="userId" title="User Id can't be empty" required="true"/>
					</div>
				</div>
				<div>
					<label for="amount"> Amount</label>
					<div>
						<form:input path="amount" title="Amount can't be empty" required="true"/>
					</div>
				</div>
				<div>
					<label for="modeOfPayment">Mode Of Payment</label>
					<div>
						<form:input path="modeOfPayment" title="Choose Payment" required="true"/>
					</div>
				</div>
				<form:errors path="modeOfPayment" cssClass="text-danger" />
				<div>
					<label for="paymentDetails">Payment Detail</label>
					<div>
						<form:input path="paymentDetails" Pattern="^[a-zA-Z]*$" title= "*Value should be in Alphabets " required="true"/>
					</div>
				</div>
				<form:errors path="paymentDetails" cssClass="text-danger" />
				<div>
					<label for="paymentDate">Payment Date</label>
					<div>
						<form:input path="paymentDate" type="date" required="true"/>
					</div>
				</div>
				<div>
					<form:button>Update Payment Detail</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>