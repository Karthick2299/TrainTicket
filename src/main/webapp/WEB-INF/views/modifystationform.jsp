<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Station Modify Form</title>
</head>
<body>
	 <h3>Modify Station</h3>
    <br>
    <form action="/station/updatestationform" method="get"
        style="margin: 0;">
        <label>Enter Station Code </label> <input type="text" placeholder="station code"
            name="stationId"> <input type='submit' value="Submit" name="submit">
    </form>

</body>
</html>