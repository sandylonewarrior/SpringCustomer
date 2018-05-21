<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Search</title>
</head>
<body>
	<div class="container">
		<a href="/homepage"> Home New </a>
		<form method="POST" action="<%= request.getContextPath() %>/getCustomerDetails">
			<table>
				<tr>
					<td>Enter Customer Id:</td>
					<td><input type="text" name="customerId" /></td>
				</tr>
				<tr>
					<td colspan="1"><input type="submit" value="Search"></td>
				</tr>
			</table>
		</form>
	</div>

</body>
</html>