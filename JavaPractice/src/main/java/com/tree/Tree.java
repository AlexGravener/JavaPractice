package com.tree;

public class Tree extends Plant {

    public Tree(){
        this("Sakura", "Prunus", "Asia");
    }

    public Tree (String name, String genus, String continent){
        super(name, genus, continent);
    }

    @Override
    public String toString(){

        return new StringBuilder("Name: ")
                .append(getName())
                .append(", Genus: ")
                .append(getGenus())
                .append(", Continent of origin: ")
                .append(getContinent()).toString();
    }

    @Override
    public String abstractMethod(String adjective){
        return "Trees are " + adjective + "!";
    }

}
