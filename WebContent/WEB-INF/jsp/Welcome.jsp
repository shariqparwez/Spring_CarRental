<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Form Submitted</h1>
	<h3>Car details - </h3>
	
		<ul>
			<li>${req.name}</li>
			<li>${command.mobileNumber}</li>
			<li>${command.email}</li>
			<li>${command.type}</li>
		
		</ul>
		
	<h2>Search</h2>
	<form action="cust/check">
		<label>Name</label>	<input type="text" name="userName"/>
		<input type="submit" value="Search">
	</form>		
		${prevBooking} 
</body>
</html>