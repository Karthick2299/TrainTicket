<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>find Station by id </title>
</head>
<body>
<div id="root">
		<div id="form">
		<form:form  method="post" modelAttribute="getuserbystnid">
				<div>
					<label for="stationId">Station Id</label>
					<div>
						<form:input path="stationId" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="stationName">Station Name</label>
					<div>
						<form:input path="stationName" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="stationAddress">Station address</label>
					<div>
						<form:input path="stationAddress" readonly="true"/>
					</div>
				</div>
				
		</form:form>
</div>
</div>


</body>
</html>