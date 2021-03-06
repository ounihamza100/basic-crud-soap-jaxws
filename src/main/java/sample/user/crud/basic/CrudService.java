
package sample.user.crud.basic;

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
 * JAX-WS RI 2.2.6b21 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CrudService", targetNamespace = "http://basic.crud.user.sample", wsdlLocation = "file:/D:/SAGAN/basiccrud/src/main/webapp/WEB-INF/wsdl/basic-crud.wsdl")
public class CrudService
    extends Service
{

    private final static URL CRUDSERVICE_WSDL_LOCATION;
    private final static WebServiceException CRUDSERVICE_EXCEPTION;
    private final static QName CRUDSERVICE_QNAME = new QName("http://basic.crud.user.sample", "CrudService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/D:/SAGAN/basiccrud/src/main/webapp/WEB-INF/wsdl/basic-crud.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CRUDSERVICE_WSDL_LOCATION = url;
        CRUDSERVICE_EXCEPTION = e;
    }

    public CrudService() {
        super(__getWsdlLocation(), CRUDSERVICE_QNAME);
    }

    public CrudService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CRUDSERVICE_QNAME, features);
    }

    public CrudService(URL wsdlLocation) {
        super(wsdlLocation, CRUDSERVICE_QNAME);
    }

    public CrudService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CRUDSERVICE_QNAME, features);
    }

    public CrudService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CrudService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CrudPort
     */
    @WebEndpoint(name = "wsCRUDUserServicePortTypeBindingCrud")
    public CrudPort getWsCRUDUserServicePortTypeBindingCrud() {
        return super.getPort(new QName("http://basic.crud.user.sample", "wsCRUDUserServicePortTypeBindingCrud"), CrudPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CrudPort
     */
    @WebEndpoint(name = "wsCRUDUserServicePortTypeBindingCrud")
    public CrudPort getWsCRUDUserServicePortTypeBindingCrud(WebServiceFeature... features) {
        return super.getPort(new QName("http://basic.crud.user.sample", "wsCRUDUserServicePortTypeBindingCrud"), CrudPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CRUDSERVICE_EXCEPTION!= null) {
            throw CRUDSERVICE_EXCEPTION;
        }
        return CRUDSERVICE_WSDL_LOCATION;
    }

}
