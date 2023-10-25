package com.animal;

public class Human extends Animal{
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
    public String eatFood(String food) {
        return food + " has been chewed.";
    }
}