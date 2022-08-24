<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Payment Detail</title>
<style><%@include file ="/WEB-INF/views/css/admincontrol.css"%>
</style>
</head>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<body>
<div id="table root" class="align">
		<table>
		<caption></caption>
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
				<c:forEach var="pdf" items="${allpayments}">
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
	<div>
		<a href="/admin/adminaccess"><button class="button3">
				<em class="fa fa-home"></em>
			</button></a>
	</div>
</body>
</html>