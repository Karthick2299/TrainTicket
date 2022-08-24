<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Add Payment Detail</title>
<style><%@include file ="/WEB-INF/views/css/payment.css"%>
</style>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<div id="root" class="box">
		<div id="form">
		<form:form action="addpayment" method="post" modelAttribute="newpayment">
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
				<form:errors path="userId" cssClass="text-danger" />
				<div>
					<label for="receiptNo">Receipt Number</label>
					<div>
						<form:input path="receiptNo" title="Receipt Number can't be empty" required="true"/>
					</div>
				</div>
				<form:errors path="receiptNo" cssClass="text-danger" />
				<div>
					<label for="amount"> Amount</label>
					<div>
						<form:input path="amount" title="Amount can't be empty" required="true"/>
					</div>
				</div>
				<div>
                    <label for="modeOfPayment">Mode of Payment</label>
                    <br>
                    <form:select path="modeOfPayment">
                        <form:option value="Online" label="Online" required="true" />
                        <form:option value="Offline" label="Offine" required="true" />
                        
                    </form:select>
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
				<br>
				<div>
					<button type="submit" class="btn" onclick="openPopup()">Submit</button>
		        </div>
		</form:form>
	</div>
	</div>
	<div>
		<a href="/user/useraccessa"><button class="button3">
				<em class="fa fa-home"></em>
			</button></a>
	</div>
</body>
</html>