<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Ticket Detail</title>
</head>
<body>
<div id="root">
		<div id="form">
		<form:form action="newticketdetail" method="post" modelAttribute="addticketdetil">
				<div>
					<label for="ticketNo">Ticket Number</label>
					<div>
						<form:input path="ticketNo" />
					</div>
				</div>
				<div>
					<label for="seatNo"> Seat Number</label>
					<div>
						<form:input path="seatNo" />
					</div>
				</div>
				<div>
					<label for="passengerName">Passenger Name</label>
					<div>
						<form:input path="passengerName" />
					</div>
				</div>
				<div>
					<label for="age"> Age</label>
					<div>
						<form:input path="age" />
					</div>
				</div>
				
				<div>
					<label for="gender">Gender</label>
					<div>
						<form:input path="gender" />
					</div>
				</div>
				<div>
					<label for="nationality">Nationality</label>
					<div>
						<form:input path="nationality" />
					</div>
				</div>
				
				<div>
				<form:button>Add New Ticket Detail</form:button>
		        </div>
		</form:form>
	</div>
	</div>
</body>
</html>