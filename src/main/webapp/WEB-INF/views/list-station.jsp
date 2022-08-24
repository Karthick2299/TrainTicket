<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Station List</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style><%@include file ="/WEB-INF/views/css/station.css"%>
</style>
</head>
<body>
	<div class="box">
    <h1>STATION LIST</h1>
    <br>
    <br>
    <br>
    <div id="table root">
        <div>
            <table>
            <caption></caption>
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
    </div>
    <div>
		<a class="but" href="/station/findstationstartplace">From
			Station</a>
	</div>
	</div>
	<div>
		<a href="/user/useraccessa"><button class="button3">
				<em class="fa fa-home"></em>
			</button></a>
	</div>
</body>
</html>