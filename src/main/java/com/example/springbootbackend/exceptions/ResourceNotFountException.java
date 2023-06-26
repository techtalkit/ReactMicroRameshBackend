package com.example.springbootbackend.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class ResourceNotFountException extends RuntimeException{
    private static final long serialVersionUId=1L;
    public ResourceNotFountException(String message){
       super(message);
    }
}
