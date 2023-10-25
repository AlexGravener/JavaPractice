package com.animal;

public class Python extends Animal{

    public Python() {
        this.hasScales = true;
    }

    public Python(String name, int weight, String species) {
        super(name, weight, species);
        this.hasScales = true;
    }

    private Boolean hasScales;

    @Override
    public String eatFood(String food) {
        return food + " has been swallowed.";
    }
}
