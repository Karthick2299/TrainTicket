<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Update Ticket Fare</title>
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
</body>
</html>