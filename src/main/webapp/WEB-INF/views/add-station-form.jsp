<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Add Station list</title>
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
		<form:form action="addstation" method="post" modelAttribute="newstation">
				<div>
					<label for="stationId">Station Id</label>
					<div>
						<form:input path="stationId" title="Station Code can't be empty"
						pattern="^[A-Za-z]\\w{1,10}$" required="true"/>
					</div>
				</div>
				<form:errors path="stationId" cssClass="text-danger" />
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
				<form:button>Add station</form:button>
		        </div>
		</form:form>
</div>
</div>
</body>
</html>