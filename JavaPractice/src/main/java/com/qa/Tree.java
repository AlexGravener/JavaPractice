package com.qa;

public class Tree {

    private String Name;
    private String Genus;
    private String ContinentOfOrigin;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getGenus() {
        return Genus;
    }

    public void setGenus(String genus) {
        this.Genus = genus;
    }

    public String getContinentOfOrigin() {
        return ContinentOfOrigin;
    }

    public void setContinentOfOrigin(String countryOfOrigin) {
        this.ContinentOfOrigin = countryOfOrigin;
    }

    @Override
    public String toString(){

        return new StringBuilder("Tree name: ")
                .append(getName())
                .append(", Tree genus: ")
                .append(getGenus())
                .append(", tree originated from continent: ")
                .append(getContinentOfOrigin()).toString();
    }
}
