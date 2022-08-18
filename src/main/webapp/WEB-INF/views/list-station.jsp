<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Stations List</title>
</head>
<body>
	<button onclick="document.location='/user/useraccessa'"
		style="float: right;">Back</button>
	<h1>Stations List</h1>
	<div id="table root">
		<table border="2" width="100%" cellpadding="2">
			<thead>
				<tr>
					<th>Station Code</th>
					<th>Station Name</th>
					<th>Station Place</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="stn" items="${allstations}">
					<tr>
						<td>${stn.stationId}</td>
						<td>${stn.stationName}</td>
						<td>${stn.stationAddress}</td>

					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<div>
		<h5>
			<a href="/station/findstationstartplace">From Station</a>
		</h5>
	</div>
</body>
</html>