package io.ws.soap.exceptions;

/**
 * @author Hamza Ouni
 */
public class UserAlreadyExistException extends RuntimeException {

    public UserAlreadyExistException() {
         new UserAlreadyExistException("User already exist!!");
    }

    public UserAlreadyExistException(String message) {
        super(message);
    }
}
