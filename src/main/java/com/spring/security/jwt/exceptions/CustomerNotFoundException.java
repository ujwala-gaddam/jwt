package com.spring.security.jwt.exceptions;

public class CustomerNotFoundException extends RuntimeException {
    public CustomerNotFoundException(String message) {
            super(message);
    }
    }