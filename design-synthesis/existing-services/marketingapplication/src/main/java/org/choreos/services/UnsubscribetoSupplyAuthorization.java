
package org.choreos.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "unsubscribeto_supply_authorization", propOrder = {
    "callbackAddress"
})
public class UnsubscribetoSupplyAuthorization {

    protected String callbackAddress;

    public String getCallbackAddress() {
        return callbackAddress;
    }

    public void setCallbackAddress(String value) {
        this.callbackAddress = value;
    }

}
