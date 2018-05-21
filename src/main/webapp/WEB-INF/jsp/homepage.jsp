<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Welcome to customer application</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<h2>Welcome to customer application</h2>
	<div class="list-group">
		<a href="${contextPath}/CustomerSearch" class="list-group-item">Show Customers</a> 
		<a href="${contextPath}/addCustomer" class="list-group-item">Add Customer</a> 
		<a href="${contextPath}/addProduct" class="list-group-item">Add Product</a> 
		<a href="${contextPath}/placeOrder" class="list-group-item">Place Order </a>
	</div>
</div>
</body>
</html>