<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Add Ticket</title>
<style type="text/css">
body {
	background-image:
		url("");
		background-size: cover;
	background-repeat: no-repeat;
}
h1 {text-align: center;}
div{text-align: center;}
.heading-text {
    font-weight: bold;
    font-size: 20px;
}
.input-size {
    padding: 5px;
    width: 15%;
}
.text-danger {
	color: #e80c4d;
	font-size: 0.9em;
}
.top
{
    margin-top: 69px;
}
.submit
{
margin-top: 26px;
}
.tab{
		border:1px black solid;
		border-radius: 2px;
		background-color: #FFE5CC;
		margin-left: 30%;
		width:450px;
		color:red;
		font-weight: bold;
		font-style:normal;
		text-align:center;
		font-size: 22px;
		margin-bottom:10px;
		padding:10px;
	}
	.yel{
	color:yellow;
	}
	.red{
		color:red;
	}
	.green{
		color:green;
	}
	.brown{
		color:brown;
	}
	.blue{
		color:blue;
	}
.text-danger {
    color: #e80c4d;
    font-size: 0.9em;
}
</style>
</head>
<body>
<div id="root">
		<div id="form">
		<form:form action="newticket" method="post" modelAttribute="addticket">
				<div>
					<label for="userId">User Id</label>
					<div>
						<form:input path="userId" title="User Id can't be empty" required="true"/>
					</div>
				</div>
				<form:errors path="userId" cssClass="text-danger" />
				<div>
					<label for="trainNo">Train Number</label>
					<div>
						<form:input path="trainNo" title="It's Contain a Number" required="true"/>
					</div>
				</div>
				<div>
					<label for="seatClass">Seat Class</label>
					<div>
						<form:input path="seatClass" title="Choose your Seat Class" required="true"/>
					</div>
				</div>
				<form:errors path="seatClass" cssClass="text-danger" />
				<div>
					<label for="travellingDate">Travel Date</label>
					<div>
						<form:input path="travellingDate" type="date" title="Select Your Travelling Date" required="true"/>
					</div>
				</div>
				<div>
					<label for="amount">Amount</label>
					<div>
						<form:input path="amount" tiltle="Put the Amount" required="true"/>
					</div>
				</div>
			
				<div>
					<label for="status">Status</label>
					<div>
						<form:input path="status" title="Enter Booking Status" pattern="^[A-Za-z]\\w{3,20}$" required="true"/>
					</div>
				</div>
				<form:errors path="status" cssClass="text-danger" />
				<div>
					<label for="boardingStation">Boarding Station</label>
					<div>
						<form:input path="boardingStation" title="Enter Boarding Station" pattern="^[A-Za-z]\\w{1,10}$" required="true"/>
					</div>
				</div>
				<form:errors path="boardingStation" cssClass="text-danger" />
				<div>
					<label for="destinationStation">Destination Station</label>
					<div>
						<form:input path="destinationStation" title="Enter Destination Station" pattern="^[A-Za-z]\\w{1,10}$" required="true"/>
					</div>
				</div>
				<form:errors path="destinationStation" cssClass="text-danger" />
				<div>
					<label for="boardingTime">Boarding Time</label>
					<div>
						<form:input path="boardingTime" type="time" required="true"/>
					</div>
				</div>
				<form:errors path="boardingTime" cssClass="text-danger" />
				<div>
					<label for="arrivalTime">Arrival Time</label>
					<div>
						<form:input path="arrivalTime" type="time" required="true"/>
					</div>
				</div>
				<form:errors path="arrivalTime" cssClass="text-danger" />
				<br>
				<div>
				<form:button>Add New Ticket</form:button>
		        </div>
		</form:form>
	</div>
	</div>

</body>
</html>