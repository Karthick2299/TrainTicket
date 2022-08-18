<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Find Station </title>
</head>
<body>
<h3>Get Station</h3>
    <br>
    <form action="/station/getstationbyid" method="get"
        style="margin: 0;">
        <label>Enter Station Code </label> <input type="text" placeholder="station code"
            name="stationId"> <input type='submit' value="Fetch" name="submit">
    </form>

</body>
</html>