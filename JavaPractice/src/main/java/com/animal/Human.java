package com.animal;

import com.exceptions.InvalidFoodType;
import com.exceptions.SillyBilly;
import com.growable.IGrowable;

public class Human extends Animal {
    public Human() {
        this.iqScore=100.00D;
        this.setSpecies("Human");
    }

    public Human(String name, int weight, double iqScore){
        super(name, weight, "Human");
        this.iqScore = iqScore;
    }

    public Human(String name, int weight, String species, double iqScore) {
        super(name, weight, species);
        this.iqScore=iqScore;
    }
    private double iqScore;


    @Override
    public String eatFood(String food) throws InvalidFoodType, SillyBilly {

        if (food.matches(".*\\d.")){
            throw new InvalidFoodType();
        } else if (food.equals("abc")) {
            throw new SillyBilly();
        } else{
            return food + " has been chewed.";
        }


//        if (food instanceof String){
//            return food + " has been chewed.";
//        }else {
//            throw new InvalidFoodType();
//        }
    }

    @Override
    public String directionGrown() {
        return "Humans grow uppyleftyrighty";
    }
}
