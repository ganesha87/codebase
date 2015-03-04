/**
 * ValidateTokenRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bluecrossmn.ws_ns.wsdl.sharedsvcs.manage_it.SecurityTokenValidation_v1_0;

public class ValidateTokenRequest  implements java.io.Serializable {
    private java.lang.String application;

    private java.lang.String extId;

    private java.lang.String token;

    public ValidateTokenRequest() {
    }

    public ValidateTokenRequest(
           java.lang.String application,
           java.lang.String extId,
           java.lang.String token) {
           this.application = application;
           this.extId = extId;
           this.token = token;
    }


    /**
     * Gets the application value for this ValidateTokenRequest.
     * 
     * @return application
     */
    public java.lang.String getApplication() {
        return application;
    }


    /**
     * Sets the application value for this ValidateTokenRequest.
     * 
     * @param application
     */
    public void setApplication(java.lang.String application) {
        this.application = application;
    }


    /**
     * Gets the extId value for this ValidateTokenRequest.
     * 
     * @return extId
     */
    public java.lang.String getExtId() {
        return extId;
    }


    /**
     * Sets the extId value for this ValidateTokenRequest.
     * 
     * @param extId
     */
    public void setExtId(java.lang.String extId) {
        this.extId = extId;
    }


    /**
     * Gets the token value for this ValidateTokenRequest.
     * 
     * @return token
     */
    public java.lang.String getToken() {
        return token;
    }


    /**
     * Sets the token value for this ValidateTokenRequest.
     * 
     * @param token
     */
    public void setToken(java.lang.String token) {
        this.token = token;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidateTokenRequest)) return false;
        ValidateTokenRequest other = (ValidateTokenRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.application==null && other.getApplication()==null) || 
             (this.application!=null &&
              this.application.equals(other.getApplication()))) &&
            ((this.extId==null && other.getExtId()==null) || 
             (this.extId!=null &&
              this.extId.equals(other.getExtId()))) &&
            ((this.token==null && other.getToken()==null) || 
             (this.token!=null &&
              this.token.equals(other.getToken())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getApplication() != null) {
            _hashCode += getApplication().hashCode();
        }
        if (getExtId() != null) {
            _hashCode += getExtId().hashCode();
        }
        if (getToken() != null) {
            _hashCode += getToken().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidateTokenRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws-ns.bluecrossmn.com/wsdl/sharedsvcs/manage-it/SecurityTokenValidation_v1_0", ">ValidateTokenRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("application");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws-ns.bluecrossmn.com/wsdl/sharedsvcs/manage-it/SecurityTokenValidation_v1_0", "Application"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws-ns.bluecrossmn.com/wsdl/sharedsvcs/manage-it/SecurityTokenValidation_v1_0", "ExtId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("token");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws-ns.bluecrossmn.com/wsdl/sharedsvcs/manage-it/SecurityTokenValidation_v1_0", "Token"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
