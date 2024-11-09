package com.ust.EcoTrack.exceptions;

public class UserDoesNotExistException extends RuntimeException{
    public UserDoesNotExistException(String msg){
        super(msg);
    }
}
