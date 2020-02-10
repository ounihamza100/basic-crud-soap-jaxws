package io.ws.soap.exceptions;

import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPFault;
import javax.xml.ws.soap.SOAPFaultException;

/**
 * @author Hamza Ouni
 */
public class BasicCrudSOAPFaultException extends SOAPFaultException {
    /**
     * Constructor for SOAPFaultException
     *
     * @param fault <code>SOAPFault</code> representing the fault
     * @see SOAPFactory#createFault
     **/
    public BasicCrudSOAPFaultException(SOAPFault fault) {
        super(fault);
    }



    private static SOAPFactory soapFactory;

    static {
        try {
            soapFactory = SOAPFactory.newInstance();
        } catch (SOAPException e) {
            throw new BasicCrudRuntimeException("Error initializing SOAPFactory object."
                    + " Stack: " + e.getMessage());
        }
    }

    public static SOAPFactory getSoapFactory() {
        return soapFactory;
    }
}
