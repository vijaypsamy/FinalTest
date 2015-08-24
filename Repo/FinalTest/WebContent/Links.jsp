<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");

		if (uname.equals("vijay") && pwd.equals("password")) {
	%>

	<a href="/FinalTest/CheckBillDetails.jsp">Check Bill Details</a>
	<a href="/Payment.jsp">Payment</a>
	<%
		} else
	%><h1>Invalid Username and password</h1>
	<%
		
	%>
</body>
</html>