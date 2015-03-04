package com.bluecrossmn.ws_ns.wsdl.sharedsvcs.manage_it.SecurityTokenValidation_v1_0;

public class SecurityTokenValidationInterface_v1_0Proxy implements com.bluecrossmn.ws_ns.wsdl.sharedsvcs.manage_it.SecurityTokenValidation_v1_0.SecurityTokenValidationInterface_v1_0 {
  private String _endpoint = null;
  private com.bluecrossmn.ws_ns.wsdl.sharedsvcs.manage_it.SecurityTokenValidation_v1_0.SecurityTokenValidationInterface_v1_0 securityTokenValidationInterface_v1_0 = null;
  
  public SecurityTokenValidationInterface_v1_0Proxy() {
    _initSecurityTokenValidationInterface_v1_0Proxy();
  }
  
  public SecurityTokenValidationInterface_v1_0Proxy(String endpoint) {
    _endpoint = endpoint;
    _initSecurityTokenValidationInterface_v1_0Proxy();
  }
  
  private void _initSecurityTokenValidationInterface_v1_0Proxy() {
    try {
      securityTokenValidationInterface_v1_0 = (new com.bluecrossmn.ws_ns.wsdl.sharedsvcs.manage_it.SecurityTokenValidation_v1_0.SecurityTokenValidationEndpoints_v1_0Locator()).getSecurityTokenValidationEndpoint_v1_0();
      if (securityTokenValidationInterface_v1_0 != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)securityTokenValidationInterface_v1_0)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)securityTokenValidationInterface_v1_0)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (securityTokenValidationInterface_v1_0 != null)
      ((javax.xml.rpc.Stub)securityTokenValidationInterface_v1_0)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.bluecrossmn.ws_ns.wsdl.sharedsvcs.manage_it.SecurityTokenValidation_v1_0.SecurityTokenValidationInterface_v1_0 getSecurityTokenValidationInterface_v1_0() {
    if (securityTokenValidationInterface_v1_0 == null)
      _initSecurityTokenValidationInterface_v1_0Proxy();
    return securityTokenValidationInterface_v1_0;
  }
  
  public com.bluecrossmn.ws_ns.wsdl.sharedsvcs.manage_it.SecurityTokenValidation_v1_0.SendTokenResponse sendToken(com.bluecrossmn.ws_ns.wsdl.sharedsvcs.manage_it.SecurityTokenValidation_v1_0.SendTokenRequest sendTokenRequestValue) throws java.rmi.RemoteException{
    if (securityTokenValidationInterface_v1_0 == null)
      _initSecurityTokenValidationInterface_v1_0Proxy();
    return securityTokenValidationInterface_v1_0.sendToken(sendTokenRequestValue);
  }
  
  public com.bluecrossmn.ws_ns.wsdl.sharedsvcs.manage_it.SecurityTokenValidation_v1_0.ValidateTokenResponse validateToken(com.bluecrossmn.ws_ns.wsdl.sharedsvcs.manage_it.SecurityTokenValidation_v1_0.ValidateTokenRequest validateTokenRequestValue) throws java.rmi.RemoteException{
    if (securityTokenValidationInterface_v1_0 == null)
      _initSecurityTokenValidationInterface_v1_0Proxy();
    return securityTokenValidationInterface_v1_0.validateToken(validateTokenRequestValue);
  }
  
  
}