package com.spring.security.jwt.exceptions;

public class InvalidCredentialsException extends RuntimeException {
    public InvalidCredentialsException(String message)
    {
        super(message);
    }
}
