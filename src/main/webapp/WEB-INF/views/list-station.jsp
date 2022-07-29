<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Stations List</title>
</head>
<body>
<div id="table root">
		<table>
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
						<td>${stn.station_id}</td>
						<td>${stn.station_name}</td>
						<td>${stn.station_address}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>