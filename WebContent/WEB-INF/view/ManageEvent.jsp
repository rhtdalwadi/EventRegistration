<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Manage Events</title>
</head>
<body>
	
	<table>
		<tr>
			<th width="100" align="left">My Schudeled Events :</th>
		</tr>
		<tr>
			<th width="100" align="left">Event Id :</th>
			<td><input type="text" name="${event.eventId}" /></td>
		</tr>

		<tr>
			<th width="100" align="left">Event Name :</th>
			<td><select name="${event.eventName}">
					<option value="Event1">Ahmedabad-Time1</option>
					<option value="Event2">Rajkot-Time2</option>
					<option value="Event3">Gandhinagar-Time3</option>
			</select></td>
		</tr>
		<tr>
			<th width="100" align="left">Event Slot :</th>
			<td><input type="text" name="eventStartTime" value="${event.eventStartTime}"></td>
			<td><input type="text" name="eventStartTime" value="${event.eventEndTime}"></td>
		</tr>
		<tr>
			<th width="100" align="left">Event Capacity :</th>
			<td><input type="text" name="event.eventName" value="${event.eventCapacity}"></td>
		</tr>
	</table>
	
	<form action="addNewEvent" method="post">
		<table>
			<tr>
				<th width="100" align="left">Event Id :</th>
				<td><input type="text" name="event.eventId" value="${eventId}" /></td>
			</tr>
			<tr>
				<th width="100" align="left">Event Name :</th>
				<td><input type="text" name="eventName" value="${event.eventName}"/></td>
			</tr>

			<tr>
				<th width="100" align="left">Event City :</th>
				<td><select name="cityName">
						<option value="City1">Ahmedabad</option>
						<option value="City2">Rajkot</option>
						<option value="City3">Gandhinagar</option>
				</select></td>
			</tr>
			<tr>
				<th width="100" align="left">Event Start Time :</th>
				<td><input type="text" name="eventStartTime" value="${eventStartTime}"></td>
				<td><input type="text" name="eventStartTime" value="${eventEndTime}" ></td>
			</tr>
			<tr>
				<th width="100" align="left">Event Capacity :</th>
				<td><input type="text" name="eventName" value="${event.eventCapacity}"></td>
			</tr>
			<tr>
				<th></th>
				<td><input type="submit" value="Add New Event"></td>
			</tr>
		</table>
	</form>
</body>
</html>