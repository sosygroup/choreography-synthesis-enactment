
package org.choreos.services.cd;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MarketingApplicationService", targetNamespace = "http://services.choreos.org/", wsdlLocation = "file:/Users/alexander/Sviluppo/CHOReOS/choreosynt/rest/cd-generator/examples/wp7/cd/CD-shopentrance-marketingapplication/src/main/webapp/WEB-INF/wsdl/CD-shopentrance-marketingapplication.wsdl")
public class MarketingApplicationService
    extends Service
{

    private final static URL MARKETINGAPPLICATIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException MARKETINGAPPLICATIONSERVICE_EXCEPTION;
    private final static QName MARKETINGAPPLICATIONSERVICE_QNAME = new QName("http://services.choreos.org/", "MarketingApplicationService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/Users/alexander/Sviluppo/CHOReOS/choreosynt/rest/cd-generator/examples/wp7/cd/CD-shopentrance-marketingapplication/src/main/webapp/WEB-INF/wsdl/CD-shopentrance-marketingapplication.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MARKETINGAPPLICATIONSERVICE_WSDL_LOCATION = url;
        MARKETINGAPPLICATIONSERVICE_EXCEPTION = e;
    }

    public MarketingApplicationService() {
        super(__getWsdlLocation(), MARKETINGAPPLICATIONSERVICE_QNAME);
    }

    public MarketingApplicationService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MARKETINGAPPLICATIONSERVICE_QNAME, features);
    }

    public MarketingApplicationService(URL wsdlLocation) {
        super(wsdlLocation, MARKETINGAPPLICATIONSERVICE_QNAME);
    }

    public MarketingApplicationService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MARKETINGAPPLICATIONSERVICE_QNAME, features);
    }

    public MarketingApplicationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MarketingApplicationService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MarketingApplication
     */
    @WebEndpoint(name = "MarketingApplicationPort")
    public MarketingApplication getMarketingApplicationPort() {
        return super.getPort(new QName("http://services.choreos.org/", "MarketingApplicationPort"), MarketingApplication.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MarketingApplication
     */
    @WebEndpoint(name = "MarketingApplicationPort")
    public MarketingApplication getMarketingApplicationPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.choreos.org/", "MarketingApplicationPort"), MarketingApplication.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MARKETINGAPPLICATIONSERVICE_EXCEPTION!= null) {
            throw MARKETINGAPPLICATIONSERVICE_EXCEPTION;
        }
        return MARKETINGAPPLICATIONSERVICE_WSDL_LOCATION;
    }

}
