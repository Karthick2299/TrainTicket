<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User List</title>
</head>
<body>
	<div id="table root">
		<table>
			<thead>
				<tr>
					<th>User Id</th>
					<th>Password</th>
					<th>User Name</th>
					<th>Date of Birth</th>
					<th>Gender</th>
					<th>E-Mail</th>
					<th>Phone Number</th>
					<th>Address</th>
					<th>Nationality</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="usr" items="${allusers}">
					<tr>
						<td>${usr.user_id}</td>
						<td>${usr.user_password}</td>
						<td>${usr.user_name}</td>
						<td>${usr.date_of_birth}</td>
						<td>${usr.gender}</td>
						<td>${usr.mail_id}</td>
						<td>${usr.phone_number}</td>
						<td>${usr.address}</td>
						<td>${usr.nationality}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>