package com.tree;

import com.growable.IGrowable;

public abstract class Plant implements IGrowable {
//    constructors
    public Plant (String name, String genus, String continent) {
        this.name = name;
        this.genus = genus;
        this.continent = continent;
    }
//    data
    private static String kingdom = "Plantae";
    private String name;
    private String genus;
    private String continent;

//    behaviour
    public static String getKingdom() {
    return kingdom;
    }
    public static void setKingdom(String kingdom) {
        Plant.kingdom = kingdom;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGenus() {
        return this.genus;
    }
    public void setGenus(String genus) {
        this.genus = genus;
    }
    public String getContinent() {
        return this.continent;
    }
    public void setContinent(String continent) {
        this.continent = continent;
    }
    public static String photosynthesis(String intake){
        if (intake.contains("sun") && intake.contains("CO2") && intake.contains("water"))
            return "oxygen and sugar";
        else
            return "photNOsynthesis";
    }

    @Override
    public String directionGrown() {
        return "All plants grow uppydownyleftyrighty (roots)";
    }

    public abstract String abstractMethod(String adjective);
}
