<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Logged in User Information</title>
</head>
<body>
<p>Current Logged in User : <%=request.getHeader("iv-user")%>.</p>
 
   <a href="https://localhost:451/pkmslogout">logout</a>

<% java.util.Enumeration names = request.getHeaderNames();
        while(names.hasMoreElements()){
            String name = (String) names.nextElement();
            out.println(name + ":<BR>" + request.getHeader(name) + "<BR><BR>");
        }
        %>
</body>
</html>