/**
 * 
 */
package com.mnpapiv1.exception;

/**
 * 
 */
public class NoSuchCustomerExistsException extends RuntimeException {

    private String message;

    public NoSuchCustomerExistsException() {}

    public NoSuchCustomerExistsException(String msg) {
        super(msg);
        this.message = msg;
    }
	
} // End of NoSuchCustomerExistsException 
