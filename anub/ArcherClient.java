
import javax.xml.soap.*;

public class ArcherClient {

	public static void main(String args[]) {
	    try {
	    	System.setProperty("javax.net.ssl.trustStore", "C:/Temp/cacerts.jks");
	        System.setProperty("javax.net.ssl.keyStorePassword", "changeit");
			
	        	// Create SOAP Connection
	    		SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
	    		SOAPConnection soapConnection = soapConnectionFactory.createConnection();

	            String url = "https://egrcb.archer.rsa.com/ws/general.asmx";	            
	            SOAPMessage soapResponse = soapConnection.call(createSOAPRequest(),url);
	            
	            System.out.print(soapResponse.getSOAPBody().getTextContent());	     

	            soapConnection.close();
	        } catch (Exception e) {
	            System.err
	                    .println("Error occurred while sending SOAP Request to Server");
	            e.printStackTrace();
	        }
	}


	private static SOAPMessage createSOAPRequest() throws Exception {
		
	        MessageFactory messageFactory = MessageFactory.newInstance();
	        SOAPMessage soapMessage = messageFactory.createMessage();
	        SOAPPart soapPart = soapMessage.getSOAPPart();

	        String serverURI = "http://archer-tech.com/webservices/CreateUserSessionFromInstance";

	        // SOAP Envelope
	        SOAPEnvelope envelope = soapPart.getEnvelope();

	        // SOAP Body
	        SOAPBody soapBody = envelope.getBody();

	        SOAPElement soapBodyElem = soapBody.addChildElement("CreateUserSessionFromInstance","webns","http://archer-tech.com/webservices/");

	        SOAPElement soapBodyElem1 = soapBodyElem.addChildElement("userName","webns","http://archer-tech.com/webservices/");
	        soapBodyElem1.addTextNode("ITIM_ARCHER_TEST1");

	        SOAPElement soapBodyElem2 = soapBodyElem.addChildElement("instanceName","webns","http://archer-tech.com/webservices/");
	        soapBodyElem2.addTextNode("10077");
	        
	        SOAPElement soapBodyElem3 = soapBodyElem.addChildElement("password","webns","http://archer-tech.com/webservices/");
	        soapBodyElem3.addTextNode("lO3cR$17Ou");

	        MimeHeaders headers = soapMessage.getMimeHeaders();
	        headers.addHeader("SOAPAction", serverURI );

	        soapMessage.saveChanges();

	        /* Print the request message */
	        System.out.print("Request SOAP Message = ");
	        soapMessage.writeTo(System.out);
	        System.out.println();

	        return soapMessage;
	    }
}
