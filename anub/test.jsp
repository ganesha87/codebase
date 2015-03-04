<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    
    import="org.apache.axis.client.*"
	import="com.bluecrossmn.ws_ns.wsdl.sharedsvcs.manage_it.SecurityTokenValidation_v1_0.*"
	import="javax.xml.namespace.QName"
    
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String res = "";
String res2 = "";
String error = "";
int res3 = 100;
try {
	SecurityTokenValidationEndpoints_v1_0Locator locator = new SecurityTokenValidationEndpoints_v1_0Locator();
    String endpoint = locator.getSecurityTokenValidationEndpoint_v1_0Address();
	SecurityTokenValidationInterface_v1_0Proxy prxy = new SecurityTokenValidationInterface_v1_0Proxy(endpoint );
	
	
	SendTokenRequest sendTokenRequestValue = new SendTokenRequest("member_portal", "1cf6191f794ffb1cf6191f794ffb1c66", "email", "ganesh.varma@bcbsmn.com");
	SendTokenResponse resp = prxy.sendToken(sendTokenRequestValue);
	
	res = resp.getResultDesc();
	
	ValidateTokenRequest validateTokenRequestValue = new ValidateTokenRequest("member_portal", "1cf6191f794ffb1cf6191f794ffb1c66","434166");
	ValidateTokenResponse validateResp = prxy.validateToken(validateTokenRequestValue);
	
	res2 = validateResp.getResultDesc();
	res3 = validateResp.getResult();
	
}
catch (Exception e) {
    error = e.toString();
 }

%>
Result = <%=res %><br />
Result = <%=res2 %><br />
Result = <%=res3 %><br />
Error = <%=error %> 
</body>
</html>