
package org.choreos.services.enactchoreography.client.instoretotem;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "InStoreTotem", targetNamespace = "http://services.choreos.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface InStoreTotem {


    /**
     * 
     */
    @WebMethod
    @RequestWrapper(localName = "scenarioSetup", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.enactchoreography.client.instoretotem.ScenarioSetup")
    @ResponseWrapper(localName = "scenarioSetupResponse", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.enactchoreography.client.instoretotem.ScenarioSetupResponse")
    @Action(input = "http://services.choreos.org/InStoreTotem/scenarioSetupRequest", output = "http://services.choreos.org/InStoreTotem/scenarioSetupResponse")
    public void scenarioSetup();

    /**
     * 
     * @param sessionId
     * @param offer
     * @throws ScenarioException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "publish", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.enactchoreography.client.instoretotem.Publish")
    @ResponseWrapper(localName = "publishResponse", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.enactchoreography.client.instoretotem.PublishResponse")
    @Action(input = "http://services.choreos.org/InStoreTotem/publishRequest", output = "http://services.choreos.org/InStoreTotem/publishResponse", fault = {
        @FaultAction(className = ScenarioException_Exception.class, value = "http://services.choreos.org/InStoreTotem/publish/Fault/ScenarioException")
    })
    public void publish(
        @WebParam(name = "sessionId", targetNamespace = "")
        String sessionId,
        @WebParam(name = "offer", targetNamespace = "")
        Offer offer)
        throws ScenarioException_Exception
    ;

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "setInvocationAddress", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.enactchoreography.client.instoretotem.SetInvocationAddress")
    @ResponseWrapper(localName = "setInvocationAddressResponse", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.enactchoreography.client.instoretotem.SetInvocationAddressResponse")
    @Action(input = "http://services.choreos.org/InStoreTotem/setInvocationAddressRequest", output = "http://services.choreos.org/InStoreTotem/setInvocationAddressResponse")
    public void setInvocationAddress(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        List<String> arg2);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "setEndpointAddress", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.enactchoreography.client.instoretotem.SetEndpointAddress")
    @ResponseWrapper(localName = "setEndpointAddressResponse", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.enactchoreography.client.instoretotem.SetEndpointAddressResponse")
    @Action(input = "http://services.choreos.org/InStoreTotem/setEndpointAddressRequest", output = "http://services.choreos.org/InStoreTotem/setEndpointAddressResponse")
    public void setEndpointAddress(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
