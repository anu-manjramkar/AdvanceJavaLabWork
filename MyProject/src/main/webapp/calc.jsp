<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<%
			int no1=Integer.parseInt(request.getParameter("num1"));
			int no2=Integer.parseInt(request.getParameter("num2"));
			int result=no1+no2;
		%>
		
		<h2>The Sum of <%= no1 %> and <%= no2 %> is <%= result %> </h2>
</body>
</html>