package com.tree;

public class Tree {

    private static String kingdom = "Plantae";

    private String name;
    private String genus;
    private String continent;

    public Tree(){
        this("Sakura", "Prunus", "Asia");
    }

    public Tree (String name, String genus, String continent){
        this.name = name;
        this.genus = genus;
        this.continent = continent;
    }

    public static String getKingdom() {
        return kingdom;
    }

    public static void setKingdom(String kingdom) {
        Tree.kingdom = kingdom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    @Override
    public String toString(){

        return new StringBuilder("Tree name: ")
                .append(getName())
                .append(", Tree genus: ")
                .append(getGenus())
                .append(", tree originated from continent: ")
                .append(getContinent()).toString();
    }

    public static String photosynthesis(String intake){
        if (intake.contains("sun") && intake.contains("CO2") && intake.contains("water"))
            return "oxygen and sugar";
        else
            return "photNOsynthesis";
    }
}
