package com.animal;

public class Human extends Animal{
    public Human() {
        this.iqScore=100.00D;
    }

    public Human(String name, int weight, String species, double iqScore) {
        super(name, weight, species);
        this.iqScore=iqScore;
    }
    private double iqScore;

    @Override
    public double eatFood(String food) {
        return Math.random();
    }
}
