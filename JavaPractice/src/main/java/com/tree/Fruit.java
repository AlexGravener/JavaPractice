package com.tree;

public class Fruit extends Plant{
//    constructors
    public Fruit (String name, String genus, String continent){
        super(name, genus, continent);
    }

    public Fruit (String name, String genus, String continent, int tastinessScore) {
        super(name, genus, continent);
        this.setTastinessScore(tastinessScore);
    }

    //    data
    private int tastinessScore;

//    behaviour

    public int getTastinessScore() {
        return tastinessScore;
    }

    public void setTastinessScore(int tastinessScore) {
        this.tastinessScore = tastinessScore;
    }

    @Override
    public String abstractMethod(String adjective){
        return "I think fruit is " + adjective + ", especially a " + this.getName();
    }
}
