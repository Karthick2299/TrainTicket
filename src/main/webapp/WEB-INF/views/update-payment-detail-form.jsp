<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Payment Detail</title>
</head>
<body>
<div id="root">
		<div id="form">
		<form:form action="modifypayment" method="post" modelAttribute="updatepayment">
				<div>
					<label for="ticketNo">Ticket Number</label>
					<div>
						<form:input path="ticketNo" />
					</div>
				</div>
				<div>
					<label for="userId"> User Id</label>
					<div>
						<form:input path="userId" />
					</div>
				</div>
				<div>
					<label for="receiptNo">Receipt Number</label>
					<div>
						<form:input path="receiptNo" />
					</div>
				</div>
				<div>
					<label for="amount"> Amount</label>
					<div>
						<form:input path="amount" />
					</div>
				</div>
				
				<div>
					<label for="modeOfPayment">Mode Of Payment</label>
					<div>
						<form:input path="modeOfPayment" />
					</div>
				</div>
				<div>
					<label for="paymentDetails">Payment Detail</label>
					<div>
						<form:input path="paymentDetails" />
					</div>
				</div>
				<div>
					<label for="paymentDate">Payment Date</label>
					<div>
						<form:input path="paymentDate" />
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