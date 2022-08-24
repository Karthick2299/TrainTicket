<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Update Ticket Fare</title>
<style><%@include file ="/WEB-INF/views/css/admincontrol.css"%>
</style>
</head>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<body>
<div id="root">
		<div id="form">
		<form:form action="updatetf" method="post" modelAttribute="updatetkfare">
				<div>
					<label for="trainNo">Train Number</label>
					<div>
						<form:input path="trainNo" title="It's Contain a Number" required="true"/>
					</div>
				</div>
				
				<div>
					<label for="maxSeats">Max Seats</label>
					<div>
						<form:input path="maxSeats" title="Enter the Max Seats" required="true"/>
					</div>
				</div>
				<form:errors path="maxSeats" cssClass="text-danger" />
				<div>
					<label for="seatClass">Seat Class</label>
					<div>
						<form:input path="seatClass" title="It's Contain Alphabets" required="true"/>
					</div>
				</div>
				<form:errors path="seatClass" cssClass="text-danger" />
				<div>
					<label for="fare">Fare</label>
					<div>
						<form:input path="fare" title="It's Contain Number" required="true"/>
					</div>
				</div>
				
				<div>
				<form:button>Update Ticket Fare </form:button>
		        </div>
		</form:form>
	</div>
	</div>
	<div>
		<a href="/admin/adminaccess"><button class="button3">
				<em class="fa fa-home"></em>
			</button></a>
	</div>
</body>
</html>