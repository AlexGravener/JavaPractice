package com.exceptions;

public class InvalidFoodType extends Exception{

    public InvalidFoodType(){
        super("invalid food type");
    }
    public InvalidFoodType(String message){
        super(message);
    }
}
