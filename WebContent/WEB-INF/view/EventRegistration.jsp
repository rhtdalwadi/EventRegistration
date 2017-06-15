<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:errors path="student.*" />
	<form action="submitEvent" method="post">
		<table>
			<tr>
				<th width="100" align="left">Employee Id :</th>
				<td><input type="text" name="empId" value="${empId}"/></td>
			</tr>
			<tr>
				<th width="100" align="left">Employee Name :</th>
				<td><input type="text" name="empName" /></td>
			</tr>

			<tr>
				<th width="100" align="left">Event Slot :</th>
				<td><select name="skills">
						<option value="City1">Ahmedabad</option>
						<option value="City2">Rajkot</option>
						<option value="City3">Gandhinagar</option>
				</select></td>
			</tr>
			<tr>
				<th width="100" align="left">Event Slot :</th>
				<td><select name="skills">
						<option value="Slot1">Friday 10:00 AM - 11:00 AM</option>
						<option value="Slot2">Friday 11:00 AM - 12:00 AM</option>
						<option value="Slot3">Friday 12:00 AM - 1:00 PM</option>
				</select></td>
			</tr>

			<tr>
				<th></th>
				<td><input type="submit" value="Submit Form"></td>
			</tr>

		</table>

	</form>
</body>
</html>
