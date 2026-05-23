package com.spring.security.jwt.exceptions;

public class CustomerExistsException extends RuntimeException{
    public CustomerExistsException(String message){
        super(message);
    }
}
