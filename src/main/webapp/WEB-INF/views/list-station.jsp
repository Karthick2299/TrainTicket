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
		<table  border="2" width="100%" cellpadding="2">
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
</body>
</html>