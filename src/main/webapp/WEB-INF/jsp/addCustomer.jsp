<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Login Form</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
.login-form {
	width: 340px;
	margin: 50px auto;
}

.login-form form {
	margin-bottom: 15px;
	background: #f7f7f7;
	box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
	padding: 30px;
}

.login-form h2 {
	margin: 0 0 15px;
}

.form-control, .btn {
	min-height: 38px;
	border-radius: 2px;
}

.btn {
	font-size: 15px;
	font-weight: bold;
}
</style>
</head>
<body>
	<a class="text-left" href="/jsp/addCustomer.jsp"> Home
	</a>
	<div class="homepage">
		<form:errors  path =  "customer.*"/>
		<form:form method = "POST" action="/SpringCustomerApp/addCustomer.html">
			<h2 class="text-left">Enter customer details</h2>
			<label class="control-label col-sm-2" for="firstName"> Name:</label>
			<div class="form-group">
				<input type="text" class="form-control" placeholder="customerName"
					required="required">
			</div>
			<label class="control-label col-sm-2" for="address.phone"> Phone:</label>
			<div class="form-group">
				<input type="text" class="form-control" placeholder="customerPhone"
					required="required">
			</div>
			<label class="control-label col-sm-2" for="address.city"> City:</label>
			<div class="form-group">
				<input type="text" class="form-control" placeholder="customerCity"
					required="required">
			</div>
			<label class="control-label col-sm-2" for="address.state"> State:</label>
			<div class="form-group">
				<input type="text" class="form-control" placeholder="customerState"
					required="required">
			</div>
			<label class="control-label col-sm-2" for="address.aptNo">Apartment
				No:</label>
			<div class="form-group">
				<input type="text" class="form-control" placeholder="aptNo"
					required="required">
			</div>
			<label class="control-label col-sm-2" for="address.country">Country:</label>
			<div class="form-group">
				<input type="text" class="form-control"
					placeholder="customerCountry" required="required">
			</div>
			<input class="center" type="submit" value="Submit" /> </br>
		</form:form>
	</div>
</body>
</html>