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
 
 <h2>Blue Cross Blue Shield </h2> <br />
 <h3>External Member Portal</h3> 
 
 <% if(user.equals("Unauthenticated")) { %>
 <div>
 <b>Sign-in</b>

<form method="POST" action="../../pkmslogin">

<table border="0" width="400">
<tbody><tr>
<td align="LEFT"><ul><li>Username</li></ul></td>
<td><input name="username" size="15"></td>
</tr>
<tr>
<td align="LEFT"><ul><li>Password</li></ul></td>
<td><input name="password" size="15" type="PASSWORD"></td>
</tr>
</tbody></table>
<input name="login-form-type" value="pwd" type="HIDDEN">
<input name="Target" value="https://localhost:451/jct/poc/index.jsp" type="HIDDEN">
<br><input value="Login" type="SUBMIT">
</form>
<!--
<p><a href="fblogin.jsp">Login with Facebook</a></p>
<p><a href="stepdown.jsp">Login with lower Authentication Level</a> (For Step-Up demo)</p>
<p><a href="eailogin.jsp">Login with EAI</a> (For Step-Up demo)</p>
-->
 </div>
 <% }
 else { %>

 <h4>Welcome <%=user %> </h4>
 <a href="../../pkmslogout">logout</a>
 <div>
 <h3>Links:</h3>
 <a href="privileged/index.jsp">Protected Test Page - level 2 protection</a>(Step-up demonstration)<br /> 
 <a href="./profile/me.jsp">User Profile</a>
 </div>
 <% } %>
</body>
</html>