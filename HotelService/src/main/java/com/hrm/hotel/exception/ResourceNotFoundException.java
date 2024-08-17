package com.hrm.hotel.exception;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(){
        super("Not Found");
    }

    public ResourceNotFoundException(String s) {
        super(s);
    }
}
