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
<title>PIN Verification for Step Up</title>
</head>
<body>
<%
	String gen = request.getParameter("pin");
	String res = null;
	String e = null;
	String res2 = null;
	if(gen == null)
	{
		try {
			SecurityTokenValidationEndpoints_v1_0Locator locator = new SecurityTokenValidationEndpoints_v1_0Locator();
		    String endpoint = locator.getSecurityTokenValidationEndpoint_v1_0Address();
			SecurityTokenValidationInterface_v1_0Proxy prxy = new SecurityTokenValidationInterface_v1_0Proxy(endpoint );
			
			String extidsrc = request.getHeader("iv-user-l");
			String[] userparts = extidsrc.split(",");
			String extid= null;
			
			for(int i=0; i<userparts.length; i++)
			{
				String[] prt = userparts[i].split("=");
				if(prt[0].equalsIgnoreCase("cn")){
					extid = prt[1];
				}
			}
			
			SendTokenRequest sendTokenRequestValue = new SendTokenRequest("member_portal", extid, "email", "ganesh.varma@bcbsmn.com");
			SendTokenResponse resp = prxy.sendToken(sendTokenRequestValue);
			
			res = resp.getResultDesc();
			if(res.contains("Token successfully generated for member")){
			%>
			<h2>Enter the PIN you have received over EMail</h2>
			<form action="verify.jsp" method="post">
			PIN : <input name="pin" />
			<br />
			<input type="submit" name="submit" value="submit" />
			</form>
			<%
			}
						
		}
		catch (Exception ex) {
		    e = ex.toString();
		 }
	}
	else
	{
		try {
			SecurityTokenValidationEndpoints_v1_0Locator locator = new SecurityTokenValidationEndpoints_v1_0Locator();
		    String endpoint = locator.getSecurityTokenValidationEndpoint_v1_0Address();
			SecurityTokenValidationInterface_v1_0Proxy prxy = new SecurityTokenValidationInterface_v1_0Proxy(endpoint );
			
			String extidsrc = request.getHeader("iv-user-l");
			String[] userparts = extidsrc.split(",");
			String extid= null;
			
			for(int i=0; i<userparts.length; i++)
			{
				String[] prt = userparts[i].split("=");
				if(prt[0].equalsIgnoreCase("cn")){
					extid = prt[1];
				}
			}
			
			ValidateTokenRequest validateTokenRequestValue = new ValidateTokenRequest("member_portal", extid,gen);
			ValidateTokenResponse validateResp = prxy.validateToken(validateTokenRequestValue);
			
			res2 = validateResp.getResultDesc();
			int validity = validateResp.getResult();
			if(validity == 0){
				String user = request.getHeader("iv-user");
				response.setHeader("am-eai-user-id", user);
			    response.setHeader("am-eai-auth-level", "2");
			    response.setHeader("am-eai-redir-url", "index.jsp");
			}
		}
		catch (Exception ex) {
		    e = ex.toString();
		 }
	}
%>

logs: <br />
Result1 = <%=res %><br />
Result2 = <%=res2 %><br />
Error = <%=e %> 
</body>
</html>