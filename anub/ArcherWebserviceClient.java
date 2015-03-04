//package com.twitter.client;


import java.util.HashMap;
import java.util.Map;

import org.apache.axiom.om.OMAbstractFactory;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axiom.om.OMText;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.log4j.Logger;


public class ArcherWebserviceClient {
	
	private static Map<String,String> contextMap;
	
	public static void main(String[] args) {
		System.out.println ("Setting the CA trust store..");
		//System.setProperty("javax.net.ssl.keyStore", "C:\\Temp\\java\\cacerts");
        System.setProperty("javax.net.ssl.trustStore", "C:/Temp/java/cacerts.jks");
        System.setProperty("javax.net.ssl.keyStorePassword", "changeit");

		//addObject();
		new ArcherWebserviceClient().createSessionToken("ITIM_ARCHER_TEST1","10077","lO3cR$17Ou");
	}
	
	private static final Logger logger = Logger.getLogger("com.humana.archer.useronboarding");
	private static final String className="ArcherWebserviceClient";
	private static int maxRetryCount =5;
	private static int retryCounter =1;
	private static int retryInterval = 2000;
	private static String wsdlURL ="";
	private static String wsdlUserName ="";
	private static String wsdlUserPassword = "";
	private static int statusCode = 0;//initializing with invalid server response code
	
	/**
	 * 
	 * @param WSDL_URL_PARAM
	 * @param WSDL_URL_USERNAME_PARAM
	 * @param WSDL_URL_PASSWORD
	 * @param retryCount
	 * @param retryIntervalTime
	 * @throws Exception
	 */
	
	public static void initWSDLContext(String WSDL_URL_PARAM,String WSDL_URL_USERNAME_PARAM,String WSDL_URL_PASSWORD,
			String retryCount,String retryIntervalTime)throws Exception {
		final String methodName = "initWSDLContext";
		logger.info(className+":"+methodName+":Init param WSDL_URL_PARAM:"+WSDL_URL_PARAM);
		logger.debug(className+":"+methodName+":Init param WSDL_URL_USERNAME_PARAM:"+WSDL_URL_USERNAME_PARAM);
		wsdlURL = WSDL_URL_PARAM;
		wsdlUserName = 	WSDL_URL_USERNAME_PARAM;
		wsdlUserPassword = WSDL_URL_PASSWORD;
		if(null==wsdlURL||0>=wsdlURL.length()){
    		logger.error("One of the parameters WSDL/Service URL or WSDL login username or Password are null ");
    		throw new Exception("Input WSDL/Service URL is null.Can not proceed furter.");
    	}else if(null==wsdlUserName||0>=wsdlUserName.length()||null==wsdlUserPassword||0>=wsdlUserPassword.length()){
    		logger.error("One of the parameters WSDL login username or Password are null ");
    		throw new Exception("Input WSDL Username/Password is null.Can not proceed furter.");
    	}
		if(retryCount!=null)
			maxRetryCount = Integer.parseInt(retryCount);
		if(retryIntervalTime!=null){
			retryInterval =Integer.parseInt(retryIntervalTime);
		}
		
		/***********************
		 * 
		 * Code to build context goes here
		 */
		
		
		System.out.println(className+":"+methodName+":Completed execution of the method.");
	
	}
/**
 * 
 * @param sessionToken
 * @param firstName
 * @param middleName
 * @param lastName
 * @param companyName
 * @param title
 * @param securityParameter
 * @param address
 * @param timeZone
 * @return createUserWSResponse
 */
	
	public String createUser(String sessionToken, String firstName, String middleName, String lastName, String companyName, String title,
			String securityParameter, String address,String timeZone){
			    
		String createUserWSResponse = "";
		try {
			        OMFactory fac = OMAbstractFactory.getOMFactory();        
			        OMNamespace soapNS = fac.createOMNamespace("http://www.w3.org/2003/05/soap-envelope", "soap");
			        OMNamespace webNS = fac.createOMNamespace("http://archer-tech.com/webservices/", "web");
			        OMElement soapEnvelope = fac.createOMElement("Envelope", soapNS);
			        
			        OMElement soapHeader = fac.createOMElement("Header", soapNS);
			        OMElement soapBody = fac.createOMElement("Body", soapNS);
			        OMElement createUserExNode = fac.createOMElement("CreateUserEx", webNS);
			       
			        OMElement sessionTokenNode = fac.createOMElement("sessionToken", webNS);
			       // OMText sessionTokenValue = fac.createOMText(sessionToken,"75F65FC480703CA600B0C62F0EF57E52");
			        sessionTokenNode.setText("69BE69776B2D1285B369A09612D11E9A");
			        OMElement firstNameNode = fac.createOMElement("firstName", webNS);
			        firstNameNode.setText(firstName);
			        OMElement middleNameNode = fac.createOMElement("middleName", webNS);
			        middleNameNode.setText(middleName);
			        OMElement lastNameNode = fac.createOMElement("lastName", webNS);
			        lastNameNode.setText(lastName);
			        OMElement companyNameNode = fac.createOMElement("companyName", webNS);
			        companyNameNode.setText(companyName);
			        OMElement titleNode = fac.createOMElement("title", webNS);
			        titleNode.setText(title);
			        OMElement securityParameterNode = fac.createOMElement("securityParameter", webNS);
			        securityParameterNode.setText(securityParameter);
			        OMElement addressNode = fac.createOMElement("address", webNS);
			        addressNode.setText(address);
			        OMElement timeZoneNode = fac.createOMElement("timeZone", webNS);
			        timeZoneNode.setText(timeZone);
			        
			        createUserExNode.addChild(sessionTokenNode);
			        createUserExNode.addChild(firstNameNode);
			        createUserExNode.addChild(middleNameNode);
			        createUserExNode.addChild(lastNameNode);
			        createUserExNode.addChild(companyNameNode);
			        createUserExNode.addChild(titleNode);
			        createUserExNode.addChild(securityParameterNode);
			        createUserExNode.addChild(addressNode);
			        createUserExNode.addChild(timeZoneNode);
			        
			        soapBody.addChild(createUserExNode);
			        soapEnvelope.addChild(soapHeader);
			        soapEnvelope.addChild(soapBody);
			        
			        System.out.println(soapEnvelope);
			        
			        ServiceClient sc = new ServiceClient();
			        Options opts = new Options();
			        opts.setTo(new EndpointReference("https://egrcb.archer.rsa.com/ws/accesscontrol.asmx?WSDL"));
			        opts.setAction("http://archer-tech.com/webservices/CreateUserEx");
			        sc.setOptions(opts);
			        System.out.println("---------About to receive response----Response::");
			        OMElement res = sc.sendReceive(soapEnvelope);
			        System.out.println("-------------Response::"+res);
			        createUserWSResponse = String.valueOf(res);
			    }
			    catch(Exception e) 
			    {
			      e.printStackTrace(); 
			      logger.error(e.getMessage(), e);
			    }
			  
		return createUserWSResponse;
	}
	
	/**
	 * 
	 * @return
	 */
	public String createSessionToken(String userName, String instanceName, String password){
		
		String createSessionTokenResponse="";
			    try 
			    {
			        OMFactory fac = OMAbstractFactory.getOMFactory();        
			        OMNamespace soapNS = fac.createOMNamespace("http://www.w3.org/2003/05/soap-envelope", "soap");
			        OMNamespace webNS = fac.createOMNamespace("http://archer-tech.com/webservices/", "web");
					OMElement soapEnvelope = fac.createOMElement("Envelope", soapNS);
			        OMElement soapHeader = fac.createOMElement("Header", soapNS);
			        soapEnvelope.addChild(soapHeader);
			        OMElement soapBody = fac.createOMElement("Body", soapNS);
			        OMElement createUserSessionFromInstanceNode = fac.createOMElement("CreateUserSessionFromInstance", webNS);
			       
			        OMElement userNameNode = fac.createOMElement("userName", webNS);
			       // OMText sessionTokenValue = fac.createOMText(sessionToken,"75F65FC480703CA600B0C62F0EF57E52");
			        userNameNode.setText(userName);
			        OMElement instanceNameNode = fac.createOMElement("instanceName", webNS);
			        instanceNameNode.setText(instanceName);
			       // OMText instanceNameValue = fac.createOMText(instanceName,"10077");
			        OMElement passwordNode = fac.createOMElement("password", webNS);
			        passwordNode.setText(password);
			        
			        createUserSessionFromInstanceNode.addChild(userNameNode);
			        createUserSessionFromInstanceNode.addChild(instanceNameNode);
			        createUserSessionFromInstanceNode.addChild(passwordNode);
			        
			        soapBody.addChild(createUserSessionFromInstanceNode);
			        
			        soapEnvelope.addChild(soapBody);
			        System.out.println(soapEnvelope);
			        ServiceClient sc = new ServiceClient();
			        Options opts = new Options();
			        //opts.setTo(new EndpointReference("https://egrcb.archer.rsa.com/ws/general.asmx?WSDL"));
					opts.setTo(new EndpointReference("https://egrcb.archer.rsa.com/ws/general.asmx"));
			        opts.setAction("http://archer-tech.com/webservices/CreateUserSessionFromInstance");
					opts.setSoapVersionURI("1.2");
			        sc.setOptions(opts);
			        System.out.println("---------About to receive newer response----Response::");
												
			        OMElement res = sc.sendReceive(soapEnvelope);
			        System.out.println("-------------Response::"+res);
			        createSessionTokenResponse=res.toString(); 

			    }
			    catch(Exception e) 
			    {
			      e.printStackTrace();
			    }
			  
			  return createSessionTokenResponse;
		
	}
	
	public Map<String, String> getWebServiceContext(){
		if(contextMap==null){
			contextMap= new HashMap<String, String>();
		}
		return contextMap;
	}
}
