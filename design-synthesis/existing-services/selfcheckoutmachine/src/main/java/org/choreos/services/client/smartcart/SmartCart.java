
package org.choreos.services.client.smartcart;

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
@WebService(name = "SmartCart", targetNamespace = "http://services.choreos.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SmartCart {


    /**
     * 
     */
    @WebMethod
    @RequestWrapper(localName = "scenarioSetup", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.client.smartcart.ScenarioSetup")
    @ResponseWrapper(localName = "scenarioSetupResponse", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.client.smartcart.ScenarioSetupResponse")
    @Action(input = "http://services.choreos.org/SmartCart/scenarioSetupRequest", output = "http://services.choreos.org/SmartCart/scenarioSetupResponse")
    public void scenarioSetup();

    /**
     * 
     * @param product
     * @param sessionId
     * @param qty
     * @param cartId
     * @throws ScenarioException_Exception
     */
    @WebMethod(operationName = "add_product")
    @RequestWrapper(localName = "add_product", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.client.smartcart.AddProduct")
    @ResponseWrapper(localName = "add_productResponse", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.client.smartcart.AddProductResponse")
    @Action(input = "http://services.choreos.org/SmartCart/add_productRequest", output = "http://services.choreos.org/SmartCart/add_productResponse", fault = {
        @FaultAction(className = ScenarioException_Exception.class, value = "http://services.choreos.org/SmartCart/add_product/Fault/ScenarioException")
    })
    public void addProduct(
        @WebParam(name = "sessionId", targetNamespace = "")
        String sessionId,
        @WebParam(name = "cartId", targetNamespace = "")
        String cartId,
        @WebParam(name = "product", targetNamespace = "")
        Product product,
        @WebParam(name = "qty", targetNamespace = "")
        Integer qty)
        throws ScenarioException_Exception
    ;

    /**
     * 
     * @param product
     * @param sessionId
     * @param cartId
     * @throws ScenarioException_Exception
     */
    @WebMethod(operationName = "remove_product")
    @RequestWrapper(localName = "remove_product", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.client.smartcart.RemoveProduct")
    @ResponseWrapper(localName = "remove_productResponse", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.client.smartcart.RemoveProductResponse")
    @Action(input = "http://services.choreos.org/SmartCart/remove_productRequest", output = "http://services.choreos.org/SmartCart/remove_productResponse", fault = {
        @FaultAction(className = ScenarioException_Exception.class, value = "http://services.choreos.org/SmartCart/remove_product/Fault/ScenarioException")
    })
    public void removeProduct(
        @WebParam(name = "sessionId", targetNamespace = "")
        String sessionId,
        @WebParam(name = "cartId", targetNamespace = "")
        String cartId,
        @WebParam(name = "product", targetNamespace = "")
        Product product)
        throws ScenarioException_Exception
    ;

    /**
     * 
     * @param product
     * @param sessionId
     * @param qty
     * @param cartId
     * @throws ScenarioException_Exception
     */
    @WebMethod(operationName = "change_qty")
    @RequestWrapper(localName = "change_qty", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.client.smartcart.ChangeQty")
    @ResponseWrapper(localName = "change_qtyResponse", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.client.smartcart.ChangeQtyResponse")
    @Action(input = "http://services.choreos.org/SmartCart/change_qtyRequest", output = "http://services.choreos.org/SmartCart/change_qtyResponse", fault = {
        @FaultAction(className = ScenarioException_Exception.class, value = "http://services.choreos.org/SmartCart/change_qty/Fault/ScenarioException")
    })
    public void changeQty(
        @WebParam(name = "sessionId", targetNamespace = "")
        String sessionId,
        @WebParam(name = "cartId", targetNamespace = "")
        String cartId,
        @WebParam(name = "product", targetNamespace = "")
        Product product,
        @WebParam(name = "qty", targetNamespace = "")
        Integer qty)
        throws ScenarioException_Exception
    ;

    /**
     * 
     * @param sessionId
     * @param cartId
     */
    @WebMethod
    @RequestWrapper(localName = "subscribeUserToCart", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.client.smartcart.SubscribeUserToCart")
    @ResponseWrapper(localName = "subscribeUserToCartResponse", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.client.smartcart.SubscribeUserToCartResponse")
    @Action(input = "http://services.choreos.org/SmartCart/subscribeUserToCartRequest", output = "http://services.choreos.org/SmartCart/subscribeUserToCartResponse")
    public void subscribeUserToCart(
        @WebParam(name = "sessionId", targetNamespace = "")
        String sessionId,
        @WebParam(name = "cartId", targetNamespace = "")
        String cartId);

    /**
     * 
     * @param sessionId
     * @param cartId
     */
    @WebMethod
    @RequestWrapper(localName = "unsubscribeUserFrom", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.client.smartcart.UnsubscribeUserFrom")
    @ResponseWrapper(localName = "unsubscribeUserFromResponse", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.client.smartcart.UnsubscribeUserFromResponse")
    @Action(input = "http://services.choreos.org/SmartCart/unsubscribeUserFromRequest", output = "http://services.choreos.org/SmartCart/unsubscribeUserFromResponse")
    public void unsubscribeUserFrom(
        @WebParam(name = "sessionId", targetNamespace = "")
        String sessionId,
        @WebParam(name = "cartId", targetNamespace = "")
        String cartId);

    /**
     * 
     * @param sessionId
     * @param comId
     * @param cartId
     */
    @WebMethod
    @RequestWrapper(localName = "payRequired", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.client.smartcart.PayRequired")
    @ResponseWrapper(localName = "payRequiredResponse", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.client.smartcart.PayRequiredResponse")
    @Action(input = "http://services.choreos.org/SmartCart/payRequiredRequest", output = "http://services.choreos.org/SmartCart/payRequiredResponse")
    public void payRequired(
        @WebParam(name = "sessionId", targetNamespace = "")
        String sessionId,
        @WebParam(name = "cartId", targetNamespace = "")
        String cartId,
        @WebParam(name = "comId", targetNamespace = "")
        String comId);

    /**
     * 
     * @param cartId
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "isAvailable", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.client.smartcart.IsAvailable")
    @ResponseWrapper(localName = "isAvailableResponse", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.client.smartcart.IsAvailableResponse")
    @Action(input = "http://services.choreos.org/SmartCart/isAvailableRequest", output = "http://services.choreos.org/SmartCart/isAvailableResponse")
    public boolean isAvailable(
        @WebParam(name = "cartId", targetNamespace = "")
        String cartId);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "setInvocationAddress", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.client.smartcart.SetInvocationAddress")
    @ResponseWrapper(localName = "setInvocationAddressResponse", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.client.smartcart.SetInvocationAddressResponse")
    @Action(input = "http://services.choreos.org/SmartCart/setInvocationAddressRequest", output = "http://services.choreos.org/SmartCart/setInvocationAddressResponse")
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
    @RequestWrapper(localName = "setEndpointAddress", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.client.smartcart.SetEndpointAddress")
    @ResponseWrapper(localName = "setEndpointAddressResponse", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.client.smartcart.SetEndpointAddressResponse")
    @Action(input = "http://services.choreos.org/SmartCart/setEndpointAddressRequest", output = "http://services.choreos.org/SmartCart/setEndpointAddressResponse")
    public void setEndpointAddress(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
