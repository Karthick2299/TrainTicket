<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Add User</title>
<style type="text/css">
body {
	background-image:
		url("https://www.teahub.io/photos/full/364-3648431_abstract-aqua-bubbles-bright-wallpaper-abstract-hd-plain.jpg");
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

</style>
</head>
<body>

	<div id="root" class="top">
	
		<div id="form">
		
			<form:form action="newuser" method="post" modelAttribute="adduser">
				
				<div>
					<label class="heading-text" for="userPassword"> Password</label>
					<div>
						<form:input path="userPassword" type="password"
							title='password must begin with letter and contain atleast one number and must have atleast 8 characters'
							pattern="^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$"
							required="true" class="input-size" />
					</div>
				</div>
				<form:errors path="userPassword" cssClass="text-danger" />
				<div>
					<label class="heading-text" for="userName">User Name</label>
					<div>
						<form:input path="userName" title="Name can't be empty"
							pattern="^[A-Za-z]\\w{3,20}$" required="true" class="input-size" />
					</div>
				</div>
				<form:errors path="userName" cssClass="text-danger" />
				<div>
					<label class="heading-text" for="dateOfBirth">DOB</label>
					<div>
						<form:input path="dateOfBirth" type="date" required="true" class="input-size" />
					</div>
				</div>
				<div>
					<label class="heading-text" for="gender">Gender</label>
					<div>
                        <form:radiobutton path="gender" value="Male" />
                        Male
                        <form:radiobutton path="gender" value="Female" />
                        Female
                        <form:radiobutton path="gender" value="Others" />
                        Others
                    </div>
				</div>
				<form:errors path="gender" cssClass="text-danger" />
				<div>
					<label class="heading-text" for="mailId">E-Mail</label>
					<div>
						<form:input path="mailId" title="Email Not Valid"
							pattern="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$" required="true" class="input-size"/>
					</div>
				</div>
				<form:errors path="mailId" cssClass="text-danger" />
				<div>
					<label class="heading-text" for="phoneNumber">Phone Number</label>
					<div>
						<form:input path="phoneNumber" max="10"
							title="PhoneNumber should have atleast 10 digits"
							pattern="^\\+?[1-9][0-9]{7,14}$" required="true" class="input-size" />
					</div>
				</div>
				<form:errors path="phoneNumber" cssClass="text-danger" />
				<div>
					<label class="heading-text" for="address">Address</label>
					<div>
						<form:input path="address"
							title="Address should atleast contain 10 characters"
							required="true" class="input-size" />
					</div>
				</div>
				<form:errors path="address" cssClass="text-danger" />
				<div>
					<label class="heading-text" for="nationality">Nationality</label>
					<div>
                        <form:radiobutton path="nationality" value="Indian" />
                        Indian
                        <form:radiobutton path="nationality" value="Others" />
                        Others
                    </div>
				</div>
				<form:errors path="nationality" cssClass="text-danger" />
		      <input type="checkbox" id="condition" name="conditions" value="terms">
			   <label for="condition"> I AGREE FOR ALL TERMS & CONDITIONS !!!</label><br>
				
				<div class="submit">
					<form:button type="submit">Add New User</form:button>
				</div>
			</form:form>
			
		</div>
	</div>

</body>
</html>