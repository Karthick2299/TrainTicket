<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Update Ticket Detail</title>
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
		<form:form action="updatetkdetail" method="post" modelAttribute="updateticketdetail">
				<div>
					<label for="ticketNo">Ticket Number</label>
					<div>
						<form:input path="ticketNo" />
					</div>
				</div>
				<div>
					<label for="seatNo"> Seat Number</label>
					<div>
						<form:input path="seatNo" title="Seat Number Can't Be Empty" required="true"/>
					</div>
				</div>
				<div>
					<label for="passengerName">Passenger Name</label>
					<div>
						<form:input path="passengerName" title="Name can't be empty"
						pattern="^[A-Za-z]\\w{3,20}$" required="true"/>
					</div>
				</div>
				<form:errors path="passengerName" cssClass="text-danger" />
				<div>
					<label for="dob"> Date Of Birth</label>
					<div>
						<form:input path="dob" type="date" required="true"/>
					</div>
				</div>
				
				<div>
					<label for="gender">Gender</label>
					<div>
						<form:input path="gender" title="gender is required" required="true"/>
					</div>
				</div>
				<form:errors path="gender" cssClass="text-danger" />
				<div>
					<label for="nationality">Nationality</label>
					<div>
						<form:input path="nationality" title=" Enter Your Nationality" required="true"/>
					</div>
				</div>
				<form:errors path="nationality" cssClass="text-danger" />
				<div>
				<form:button>Update Ticket Detail</form:button>
		        </div>
		</form:form>
	</div>
	</div>
</body>
</html>