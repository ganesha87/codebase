/**
 * SendTokenRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bluecrossmn.ws_ns.wsdl.sharedsvcs.manage_it.SecurityTokenValidation_v1_0;

public class SendTokenRequest  implements java.io.Serializable {
    private java.lang.String application;

    private java.lang.String extId;

    private java.lang.String method;

    private java.lang.String address;

    public SendTokenRequest() {
    }

    public SendTokenRequest(
           java.lang.String application,
           java.lang.String extId,
           java.lang.String method,
           java.lang.String address) {
           this.application = application;
           this.extId = extId;
           this.method = method;
           this.address = address;
    }


    /**
     * Gets the application value for this SendTokenRequest.
     * 
     * @return application
     */
    public java.lang.String getApplication() {
        return application;
    }


    /**
     * Sets the application value for this SendTokenRequest.
     * 
     * @param application
     */
    public void setApplication(java.lang.String application) {
        this.application = application;
    }


    /**
     * Gets the extId value for this SendTokenRequest.
     * 
     * @return extId
     */
    public java.lang.String getExtId() {
        return extId;
    }


    /**
     * Sets the extId value for this SendTokenRequest.
     * 
     * @param extId
     */
    public void setExtId(java.lang.String extId) {
        this.extId = extId;
    }


    /**
     * Gets the method value for this SendTokenRequest.
     * 
     * @return method
     */
    public java.lang.String getMethod() {
        return method;
    }


    /**
     * Sets the method value for this SendTokenRequest.
     * 
     * @param method
     */
    public void setMethod(java.lang.String method) {
        this.method = method;
    }


    /**
     * Gets the address value for this SendTokenRequest.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this SendTokenRequest.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SendTokenRequest)) return false;
        SendTokenRequest other = (SendTokenRequest) obj;
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
            ((this.method==null && other.getMethod()==null) || 
             (this.method!=null &&
              this.method.equals(other.getMethod()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress())));
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
        if (getMethod() != null) {
            _hashCode += getMethod().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SendTokenRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws-ns.bluecrossmn.com/wsdl/sharedsvcs/manage-it/SecurityTokenValidation_v1_0", ">SendTokenRequest"));
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
        elemField.setFieldName("method");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws-ns.bluecrossmn.com/wsdl/sharedsvcs/manage-it/SecurityTokenValidation_v1_0", "Method"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws-ns.bluecrossmn.com/wsdl/sharedsvcs/manage-it/SecurityTokenValidation_v1_0", "Address"));
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
