/**
 * SecurityTokenValidationEndpoints_v1_0Locator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bluecrossmn.ws_ns.wsdl.sharedsvcs.manage_it.SecurityTokenValidation_v1_0;

public class SecurityTokenValidationEndpoints_v1_0Locator extends org.apache.axis.client.Service implements com.bluecrossmn.ws_ns.wsdl.sharedsvcs.manage_it.SecurityTokenValidation_v1_0.SecurityTokenValidationEndpoints_v1_0 {

    public SecurityTokenValidationEndpoints_v1_0Locator() {
    }


    public SecurityTokenValidationEndpoints_v1_0Locator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SecurityTokenValidationEndpoints_v1_0Locator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SecurityTokenValidationEndpoint_v1_0
    private java.lang.String SecurityTokenValidationEndpoint_v1_0_address = "https://tvlatdi01:9998/SecurityTokenValidation/SecurityTokenValidationEndpoints_v1_0";

    public java.lang.String getSecurityTokenValidationEndpoint_v1_0Address() {
        return SecurityTokenValidationEndpoint_v1_0_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SecurityTokenValidationEndpoint_v1_0WSDDServiceName = "SecurityTokenValidationEndpoint_v1_0";

    public java.lang.String getSecurityTokenValidationEndpoint_v1_0WSDDServiceName() {
        return SecurityTokenValidationEndpoint_v1_0WSDDServiceName;
    }

    public void setSecurityTokenValidationEndpoint_v1_0WSDDServiceName(java.lang.String name) {
        SecurityTokenValidationEndpoint_v1_0WSDDServiceName = name;
    }

    public com.bluecrossmn.ws_ns.wsdl.sharedsvcs.manage_it.SecurityTokenValidation_v1_0.SecurityTokenValidationInterface_v1_0 getSecurityTokenValidationEndpoint_v1_0() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SecurityTokenValidationEndpoint_v1_0_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSecurityTokenValidationEndpoint_v1_0(endpoint);
    }

    public com.bluecrossmn.ws_ns.wsdl.sharedsvcs.manage_it.SecurityTokenValidation_v1_0.SecurityTokenValidationInterface_v1_0 getSecurityTokenValidationEndpoint_v1_0(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.bluecrossmn.ws_ns.wsdl.sharedsvcs.manage_it.SecurityTokenValidation_v1_0.SecurityTokenValidation_v1_0_soap11BindingStub _stub = new com.bluecrossmn.ws_ns.wsdl.sharedsvcs.manage_it.SecurityTokenValidation_v1_0.SecurityTokenValidation_v1_0_soap11BindingStub(portAddress, this);
            _stub.setPortName(getSecurityTokenValidationEndpoint_v1_0WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSecurityTokenValidationEndpoint_v1_0EndpointAddress(java.lang.String address) {
        SecurityTokenValidationEndpoint_v1_0_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.bluecrossmn.ws_ns.wsdl.sharedsvcs.manage_it.SecurityTokenValidation_v1_0.SecurityTokenValidationInterface_v1_0.class.isAssignableFrom(serviceEndpointInterface)) {
                com.bluecrossmn.ws_ns.wsdl.sharedsvcs.manage_it.SecurityTokenValidation_v1_0.SecurityTokenValidation_v1_0_soap11BindingStub _stub = new com.bluecrossmn.ws_ns.wsdl.sharedsvcs.manage_it.SecurityTokenValidation_v1_0.SecurityTokenValidation_v1_0_soap11BindingStub(new java.net.URL(SecurityTokenValidationEndpoint_v1_0_address), this);
                _stub.setPortName(getSecurityTokenValidationEndpoint_v1_0WSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SecurityTokenValidationEndpoint_v1_0".equals(inputPortName)) {
            return getSecurityTokenValidationEndpoint_v1_0();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws-ns.bluecrossmn.com/wsdl/sharedsvcs/manage-it/SecurityTokenValidation_v1_0", "SecurityTokenValidationEndpoints_v1_0");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws-ns.bluecrossmn.com/wsdl/sharedsvcs/manage-it/SecurityTokenValidation_v1_0", "SecurityTokenValidationEndpoint_v1_0"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SecurityTokenValidationEndpoint_v1_0".equals(portName)) {
            setSecurityTokenValidationEndpoint_v1_0EndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
