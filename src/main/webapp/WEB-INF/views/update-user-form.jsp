<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Update User</title>
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
			<form:form action="updateur" method="post" modelAttribute="updateuser">
				<div>
					<label for="userId">User Id</label>
					<div>
						<form:input path="userId" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="userPassword"> Password</label>
					<div>
						<form:input path="userPassword" type="password"
					title='password must begin with letter and contain atleast one number and must have atleast 8 characters'
						pattern="^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$"
						required="true"/>
					</div>
				</div>
				<div>
					<label for="userName">User Name</label>
					<div>
						<form:input path="userName"  title="Name can't be empty"
						pattern="^[A-Za-z]\\w{3,20}$" required="true"/>
					</div>
				</div>
				<form:errors path="userName" cssClass="text-danger" />
				<div>
					<label for="dateOfBirth"> DOB</label>
					<div>
						<form:input path="dateOfBirth" required="true"/>
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
					<label for="mailId">E-Mail</label>
					<div>
						<form:input path="mailId" title="Email Not Valid"
					pattern="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$" required="true"/>
					</div>
				</div>
				<form:errors path="mailId" cssClass="text-danger" />
				<div>
					<label for="phoneNumber">Phone Number</label>
					<div>
						<form:input path="phoneNumber" max="10" title="PhoneNumber should have atleast 10 digits"
					pattern="^\\+?[1-9][0-9]{7,14}$" required="true"/>
					</div>
				</div>
				<form:errors path="phoneNumber" cssClass="text-danger" />
				<div>
					<label for="address">Address</label>
					<div>
						<form:input path="address" title="Address should atleast contain 10 characters" required="true"/>
					</div>
				</div>
				<form:errors path="address" cssClass="text-danger" />
				<div>
					<label for="nationality">Nationality</label>
					<div>
						<form:input path="nationality" title="Please Enter Your Nationality" required="true"/>
					</div>
				</div>
				<form:errors path="nationality" cssClass="text-danger" />
				<div>
				<form:button>Update User</form:button>
		</div>
		</form:form>
	</div>
	</div>
</body>
</html>