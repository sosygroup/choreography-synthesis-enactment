
package org.choreos.services.enactchoreography.client.selfcheckoutmachine;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
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
@WebService(name = "SelfCheckOutMachine", targetNamespace = "http://services.choreos.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SelfCheckOutMachine {


    /**
     * 
     */
    @WebMethod
    @RequestWrapper(localName = "scenarioSetup", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.enactchoreography.client.selfcheckoutmachine.ScenarioSetup")
    @ResponseWrapper(localName = "scenarioSetupResponse", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.enactchoreography.client.selfcheckoutmachine.ScenarioSetupResponse")
    @Action(input = "http://services.choreos.org/SelfCheckOutMachine/scenarioSetupRequest", output = "http://services.choreos.org/SelfCheckOutMachine/scenarioSetupResponse")
    public void scenarioSetup();

    /**
     * 
     * @param sessionId
     * @param shoppingBag
     * @param comId
     */
    @WebMethod
    @RequestWrapper(localName = "pay", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.enactchoreography.client.selfcheckoutmachine.Pay")
    @ResponseWrapper(localName = "payResponse", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.enactchoreography.client.selfcheckoutmachine.PayResponse")
    @Action(input = "http://services.choreos.org/SelfCheckOutMachine/payRequest", output = "http://services.choreos.org/SelfCheckOutMachine/payResponse")
    public void pay(
        @WebParam(name = "sessionId", targetNamespace = "")
        String sessionId,
        @WebParam(name = "comId", targetNamespace = "")
        String comId,
        @WebParam(name = "shoppingBag", targetNamespace = "")
        List<ShoppingListEntry> shoppingBag);

    /**
     * 
     * @param sessionId
     * @param cartId
     * @return
     *     returns boolean
     * @throws ScenarioException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkout", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.enactchoreography.client.selfcheckoutmachine.Checkout")
    @ResponseWrapper(localName = "checkoutResponse", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.enactchoreography.client.selfcheckoutmachine.CheckoutResponse")
    @Action(input = "http://services.choreos.org/SelfCheckOutMachine/checkoutRequest", output = "http://services.choreos.org/SelfCheckOutMachine/checkoutResponse", fault = {
        @FaultAction(className = ScenarioException_Exception.class, value = "http://services.choreos.org/SelfCheckOutMachine/checkout/Fault/ScenarioException")
    })
    public boolean checkout(
        @WebParam(name = "sessionId", targetNamespace = "")
        String sessionId,
        @WebParam(name = "cartId", targetNamespace = "")
        String cartId)
        throws ScenarioException_Exception
    ;

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "setInvocationAddress", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.enactchoreography.client.selfcheckoutmachine.SetInvocationAddress")
    @ResponseWrapper(localName = "setInvocationAddressResponse", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.enactchoreography.client.selfcheckoutmachine.SetInvocationAddressResponse")
    @Action(input = "http://services.choreos.org/SelfCheckOutMachine/setInvocationAddressRequest", output = "http://services.choreos.org/SelfCheckOutMachine/setInvocationAddressResponse")
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
    @RequestWrapper(localName = "setEndpointAddress", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.enactchoreography.client.selfcheckoutmachine.SetEndpointAddress")
    @ResponseWrapper(localName = "setEndpointAddressResponse", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.enactchoreography.client.selfcheckoutmachine.SetEndpointAddressResponse")
    @Action(input = "http://services.choreos.org/SelfCheckOutMachine/setEndpointAddressRequest", output = "http://services.choreos.org/SelfCheckOutMachine/setEndpointAddressResponse")
    public void setEndpointAddress(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
