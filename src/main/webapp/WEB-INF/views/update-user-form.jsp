<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update User</title>
</head>
<body>
<div id="root">
		<div id="form">
			<form:form action="updateur" method="post" modelAttribute="updateuser">
				<div>
					<label for="userId">User Id</label>
					<div>
						<form:input path="userId" />
					</div>
				</div>
				<div>
					<label for="userPassword"> Password</label>
					<div>
						<form:input path="userPassword" />
					</div>
				</div>
				<div>
					<label for="userName">User Name</label>
					<div>
						<form:input path="userName" />
					</div>
				</div>
				<div>
					<label for="dateOfBirth"> DOB</label>
					<div>
						<form:input path="dateOfBirth" />
					</div>
				</div>
				
				<div>
					<label for="gender">Gender</label>
					<div>
						<form:input path="gender" />
					</div>
				</div>
				<div>
					<label for="mailId">E-Mail</label>
					<div>
						<form:input path="mailId" />
					</div>
				</div>
				<div>
					<label for="phoneNumber">Phone Number</label>
					<div>
						<form:input path="phoneNumber" />
					</div>
				</div>
				<div>
					<label for="address">Address</label>
					<div>
						<form:input path="address" />
					</div>
				</div>
				<div>
					<label for="nationality">Nationality</label>
					<div>
						<form:input path="nationality" />
					</div>
				</div>
				<div>
				<form:button>Update User</form:button>
		</div>
		</form:form>
	</div>
	</div>
</body>
</html>