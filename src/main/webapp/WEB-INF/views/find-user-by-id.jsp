<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 	
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>find user By Id</title>
<style><%@include file ="/WEB-INF/views/css/userprofile.css"%>
</style>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<div id="root" class="box1">
	<h3>User Details</h3>
		<div id="form">
			<form:form method="post" modelAttribute="getuserbyid">
				<div>
					<label for="userId">User Id</label>
					<div>
						<form:input path="userId" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="userPassword"> Password</label>
					<div>
						<form:input path="userPassword" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="userName">User Name</label>
					<div>
						<form:input path="userName" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="dateOfBirth"> DOB</label>
					<div>
						<form:input path="dateOfBirth" readonly="true"/>
					</div>
				</div>

				<div>
					<label for="gender">Gender</label>
					<div>
						<form:input path="gender" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="mailId">E-Mail</label>
					<div>
						<form:input path="mailId" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="phoneNumber">Phone Number</label>
					<div>
						<form:input path="phoneNumber" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="address">Address</label>
					<div>
						<form:input path="address" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="nationality">Nationality</label>
					<div>
						<form:input path="nationality" readonly="true"/>
					</div>
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