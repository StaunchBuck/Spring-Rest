package com.tech.spring.rest.restfulwebservice.jackson.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND) //not required if using CustomizedExceptionResponseHandler
public class StudentNotFoundException extends RuntimeException {

    public StudentNotFoundException(String message) {
        super(message);
        // TODO Auto-generated constructor stub
    }
}
