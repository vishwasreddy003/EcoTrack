package com.ust.EcoTrack.Exceptions;

public class DataAlreadyExistsException extends RuntimeException{
    public DataAlreadyExistsException(String msg){
        super(msg);
    }
}
