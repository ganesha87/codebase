<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to BCBS Member Portal</title>
</head>
<body>
<% String user = request.getHeader("iv-user");  %>
Welcome : <%=user %> <br />
You have now access to level 2 information
<br />
<br /> 
 
 <a href="../profile/me.jsp">User Profile</a><br />
 <a href="https://localhost:451/pkmslogout">logout</a>
 
</body>
</html>