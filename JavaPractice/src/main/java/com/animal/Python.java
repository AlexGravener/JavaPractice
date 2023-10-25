package com.animal;

import com.exceptions.InvalidFoodType;
import com.exceptions.SillyBilly;

public class Python extends Animal {

    public Python() {
        this.hasScales = true;
    }

    public Python(String name, int weight, String species) {
        super(name, weight, species);
        this.hasScales = true;
    }

    private Boolean hasScales;

    @Override
    public String eatFood(String food) throws InvalidFoodType, SillyBilly {

        if (food.matches(".*\\d.")) {
            throw new InvalidFoodType("Pythons the animal don't make a habit of eating numbers.");
        } else {
            return food + " has been swallowed.";
        }

    }

    @Override
    public String directionGrown() {
        return "Pythons grow leftyrighty";
    }
}
