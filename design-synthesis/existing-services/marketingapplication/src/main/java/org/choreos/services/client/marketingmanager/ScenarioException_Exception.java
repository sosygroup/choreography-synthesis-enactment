
package org.choreos.services.client.marketingmanager;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "ScenarioException", targetNamespace = "http://services.choreos.org/")
public class ScenarioException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ScenarioException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public ScenarioException_Exception(String message, ScenarioException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public ScenarioException_Exception(String message, ScenarioException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.choreos.services.client.marketingmanager.ScenarioException
     */
    public ScenarioException getFaultInfo() {
        return faultInfo;
    }

}
