package com.exceptions;

public class SillyBilly extends Exception{
    public SillyBilly(){
        super("you dumbdumb");
    }
    public SillyBilly(String message){
        super(message);
    }
}
