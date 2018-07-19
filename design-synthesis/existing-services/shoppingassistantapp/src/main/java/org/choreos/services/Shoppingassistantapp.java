package org.choreos.services;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "Shoppingassistantapp", targetNamespace = "http://services.choreos.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Shoppingassistantapp {

    @WebMethod
    @RequestWrapper(localName = "scenarioSetup", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.ScenarioSetup")
    @ResponseWrapper(localName = "scenarioSetupResponse", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.ScenarioSetupResponse")
    @Action(input = "http://services.choreos.org/Shoppingassistantapp/scenarioSetupRequest", output = "http://services.choreos.org/Shoppingassistantapp/scenarioSetupResponse")
    public void scenarioSetup();

    @WebMethod
    @RequestWrapper(localName = "shopAssistAppSubscribe", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.ShopAssistAppSubscribe")
    @ResponseWrapper(localName = "shopAssistAppSubscribeResponse", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.ShopAssistAppSubscribeResponse")
    @Action(input = "http://services.choreos.org/Shoppingassistantapp/shopAssistAppSubscribeRequest", output = "http://services.choreos.org/Shoppingassistantapp/shopAssistAppSubscribeResponse", fault = {
        @FaultAction(className = ScenarioException_Exception.class, value = "http://services.choreos.org/Shoppingassistantapp/shopAssistAppSubscribe/Fault/ScenarioException")
    })
    public void shopAssistAppSubscribe(
            @WebParam(name = "sessionId", targetNamespace = "") String sessionId)
            throws ScenarioException_Exception;

    @WebMethod
    @RequestWrapper(localName = "shopAssistAppUnsubscribe", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.ShopAssistAppUnsubscribe")
    @ResponseWrapper(localName = "shopAssistAppUnsubscribeResponse", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.ShopAssistAppUnsubscribeResponse")
    @Action(input = "http://services.choreos.org/Shoppingassistantapp/shopAssistAppUnsubscribeRequest", output = "http://services.choreos.org/Shoppingassistantapp/shopAssistAppUnsubscribeResponse", fault = {
        @FaultAction(className = ScenarioException_Exception.class, value = "http://services.choreos.org/Shoppingassistantapp/shopAssistAppUnsubscribe/Fault/ScenarioException")
    })
    public void shopAssistAppUnsubscribe(
            @WebParam(name = "sessionId", targetNamespace = "") String sessionId)
            throws ScenarioException_Exception;

    @WebMethod(operationName = "private_offer")
    @RequestWrapper(localName = "private_offer", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.PrivateOffer")
    @ResponseWrapper(localName = "private_offerResponse", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.PrivateOfferResponse")
    @Action(input = "http://services.choreos.org/Shoppingassistantapp/private_offerRequest", output = "http://services.choreos.org/Shoppingassistantapp/private_offerResponse", fault = {
        @FaultAction(className = ScenarioException_Exception.class, value = "http://services.choreos.org/Shoppingassistantapp/private_offer/Fault/ScenarioException")
    })
    public void privateOffer(
            @WebParam(name = "sessionId", targetNamespace = "") String sessionId,
            @WebParam(name = "offer", targetNamespace = "") Offer offer)
            throws ScenarioException_Exception;

    @WebMethod(operationName = "record_bought_items")
    @RequestWrapper(localName = "record_bought_items", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.RecordBoughtItems")
    @ResponseWrapper(localName = "record_bought_itemsResponse", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.RecordBoughtItemsResponse")
    @Action(input = "http://services.choreos.org/Shoppingassistantapp/record_bought_itemsRequest", output = "http://services.choreos.org/Shoppingassistantapp/record_bought_itemsResponse", fault = {
        @FaultAction(className = ScenarioException_Exception.class, value = "http://services.choreos.org/Shoppingassistantapp/record_bought_items/Fault/ScenarioException")
    })
    public void recordBoughtItems(
            @WebParam(name = "sessionId", targetNamespace = "") String sessionId,
            @WebParam(name = "items", targetNamespace = "") List<Product> items)
            throws ScenarioException_Exception;

    @WebMethod(operationName = "communicate_questionnaire")
    @RequestWrapper(localName = "communicate_questionnaire", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.CommunicateQuestionnaire")
    @ResponseWrapper(localName = "communicate_questionnaireResponse", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.CommunicateQuestionnaireResponse")
    @Action(input = "http://services.choreos.org/Shoppingassistantapp/communicate_questionnaireRequest", output = "http://services.choreos.org/Shoppingassistantapp/communicate_questionnaireResponse", fault = {
        @FaultAction(className = ScenarioException_Exception.class, value = "http://services.choreos.org/Shoppingassistantapp/communicate_questionnaire/Fault/ScenarioException")
    })
    public void communicateQuestionnaire(
            @WebParam(name = "sessionId", targetNamespace = "") String sessionId,
            @WebParam(name = "q", targetNamespace = "") Questionnaire q)
            throws ScenarioException_Exception;

    @WebMethod
    @RequestWrapper(localName = "remind", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.Remind")
    @ResponseWrapper(localName = "remindResponse", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.RemindResponse")
    @Action(input = "http://services.choreos.org/Shoppingassistantapp/remindRequest", output = "http://services.choreos.org/Shoppingassistantapp/remindResponse", fault = {
        @FaultAction(className = ScenarioException_Exception.class, value = "http://services.choreos.org/Shoppingassistantapp/remind/Fault/ScenarioException")
    })
    public void remind(
            @WebParam(name = "sessionId", targetNamespace = "") String sessionId,
            @WebParam(name = "rem", targetNamespace = "") Reminder rem)
            throws ScenarioException_Exception;

    @WebMethod(operationName = "communicate_incentive")
    @RequestWrapper(localName = "communicate_incentive", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.CommunicateIncentive")
    @ResponseWrapper(localName = "communicate_incentiveResponse", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.CommunicateIncentiveResponse")
    @Action(input = "http://services.choreos.org/Shoppingassistantapp/communicate_incentiveRequest", output = "http://services.choreos.org/Shoppingassistantapp/communicate_incentiveResponse", fault = {
        @FaultAction(className = ScenarioException_Exception.class, value = "http://services.choreos.org/Shoppingassistantapp/communicate_incentive/Fault/ScenarioException")
    })
    public void communicateIncentive(
            @WebParam(name = "sessionId", targetNamespace = "") String sessionId,
            @WebParam(name = "inc", targetNamespace = "") Specialoffer inc)
            throws ScenarioException_Exception;

    @WebMethod
    @RequestWrapper(localName = "setInvocationAddress", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.SetInvocationAddress")
    @ResponseWrapper(localName = "setInvocationAddressResponse", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.SetInvocationAddressResponse")
    @Action(input = "http://services.choreos.org/Shoppingassistantapp/setInvocationAddressRequest", output = "http://services.choreos.org/Shoppingassistantapp/setInvocationAddressResponse")
    public void setInvocationAddress(
            @WebParam(name = "arg0", targetNamespace = "") String arg0,
            @WebParam(name = "arg1", targetNamespace = "") String arg1,
            @WebParam(name = "arg2", targetNamespace = "") List<String> arg2);

    @WebMethod
    @RequestWrapper(localName = "setEndpointAddress", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.SetEndpointAddress")
    @ResponseWrapper(localName = "setEndpointAddressResponse", targetNamespace = "http://services.choreos.org/", className = "org.choreos.services.SetEndpointAddressResponse")
    @Action(input = "http://services.choreos.org/Shoppingassistantapp/setEndpointAddressRequest", output = "http://services.choreos.org/Shoppingassistantapp/setEndpointAddressResponse")
    public void setEndpointAddress(
            @WebParam(name = "arg0", targetNamespace = "") String arg0);

}
