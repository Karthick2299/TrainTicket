<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Delete Station </title>
</head>
<body>
 <h3>Remove Station</h3>
    <br>
    <form action="/station/deletestation" method="get"
        style="margin: 0;">
        <label>Enter Station Code </label> <input type="text" placeholder="station code"
            name="stationId"> <input type='submit' value="Delete" name="submit">
    </form>

</body>
</html>