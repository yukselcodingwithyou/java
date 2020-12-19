package com.yukselcoding.exception;


public class NullValueProvidedException extends Throwable {
    private String message;


    /**
     * Constructor for custom exception
     * Throws when NullPointerException is thrown
     * Wrapper for NullPointerException
     * @param message message of the exception
     */
    public NullValueProvidedException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() { return message; }
}
