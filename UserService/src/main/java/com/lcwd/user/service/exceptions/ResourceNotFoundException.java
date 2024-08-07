package com.lcwd.user.service.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    //Non-parameterized constructor
    public ResourceNotFoundException(){
        super ("Resource not found on server !!");
    }
    //Parameterized constructor
    public ResourceNotFoundException(String message){
        super(message);
    }
}
