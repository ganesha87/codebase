<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="Pragma" content="no-cache">
<title>EAI Login</title>
<%

  String user = request.getParameter("user");
  if (user == null) {
%>
</head>
<body>
<form action="stepdown.jsp" method="post">
UserName : <input name="user" />
<br />
<input type="submit" name="submit" value="submit" />
</form>

<%
  } else {
    response.setHeader("am-eai-user-id", user);
    response.setHeader("am-eai-auth-level", "1");
    response.setHeader("am-eai-redir-url", "index.jsp");
%>

If you see this, you haven't set the trigger URL properly in WebSEAL's config file.
<br />
User is: <%=user%>

<%
}
%>
</body>
</html>

