package io.ws.soap.exceptions;

/**
 * @author Hamza Ouni
 */
public class UserNotFoundException extends RuntimeException {



    public UserNotFoundException(String message) {
        super(message);
    }
}
