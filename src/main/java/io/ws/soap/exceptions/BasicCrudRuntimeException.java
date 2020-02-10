package io.ws.soap.exceptions;

/**
 * @author Hamza Ouni
 */
public class BasicCrudRuntimeException extends RuntimeException {

    public BasicCrudRuntimeException() {
    }

    public BasicCrudRuntimeException(String message) {
        super(message);
    }
}
