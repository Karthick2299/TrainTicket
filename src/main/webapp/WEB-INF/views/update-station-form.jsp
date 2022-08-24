<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Update Station List</title>
<style><%@include file ="/WEB-INF/views/css/admincontrol.css"%>
</style>
</head>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<body>
<div id="root">
		<div id="form">
		<form:form action="updatestation" method="post" modelAttribute="updatestn">
				<div>
					<label for="stationId">Station Id</label>
					<div>
						<form:input path="stationId" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="stationName">Station Name</label>
					<div>
						<form:input path="stationName" title="Name can't be empty"
						pattern="^[A-Za-z]\\w{3,50}$" required="true"/>
					</div>
				</div>
				<form:errors path="stationName" cssClass="text-danger" />
				<div>
					<label for="stationAddress">Station address</label>
					<div>
						<form:input path="stationAddress" title="Address can't be empty"
						pattern="^[A-Za-z]\\w{3,20}$" required="true"/>
					</div>
				</div>
				<form:errors path="stationAddress" cssClass="text-danger" />
				<div>
				<form:button>Update station</form:button>
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