package com.animal;

import com.exceptions.InvalidFoodType;
import com.exceptions.SillyBilly;

public abstract class Animal {

    public Animal(){
        this("Unknown Name",0,"Unknown Species");
    }

    public Animal(String name, int weight, String species){
        this.name=name;
        this.weight=weight;
        this.species=species;
    }

    private static String kingdom = "Animalia";
    private int weight;
    private String name;

    private String species;

    public static String getKingdom() {
        return kingdom;
    }

    public static void setKingdom(String kingdom) {
        Animal.kingdom = kingdom;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public abstract String eatFood(String food) throws InvalidFoodType, SillyBilly;

}
