package com.ust.EcoTrack.Exceptions;

public class UserDoesNotExistException extends RuntimeException{
    public UserDoesNotExistException(String msg){
        super(msg);
    }
}
