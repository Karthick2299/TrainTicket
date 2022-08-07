<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Ticket Fare Form</title>
</head>
<body>
<div id="root">
		<div id="form">
		<form:form action="newticketfare" method="post" modelAttribute="addtktfare">
				<div>
					<label for="trainNo">Train Number</label>
					<div>
						<form:input path="trainNo" />
					</div>
				</div>
				<div>
					<label for="maxSeats">Max Seats</label>
					<div>
						<form:input path="maxSeats" />
					</div>
				</div>
				<div>
					<label for="seatClass">Seat Class</label>
					<div>
						<form:input path="seatClass" />
					</div>
				</div>
				
				<div>
					<label for="fare">Fare</label>
					<div>
						<form:input path="fare" />
					</div>
				</div>
				
				<div>
				<form:button>Add Ticket Fare </form:button>
		        </div>
		</form:form>
	</div>
	</div>
</body>
</html>