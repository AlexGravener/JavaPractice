package com.qa;

import com.tree.Fruit;
import com.tree.Tree;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Tree sakura = new Tree();

        Tree willow = new Tree();
        willow.setName("Willow");
        willow.setGenus("Salix");
        willow.setContinent("Europe");

        Tree oak = new Tree("Oak", "Quercus", "Europe");

        System.out.println(Tree.photosynthesis("CO2, water, sun"));

        Tree.setKingdom("Animalia");
        if (Tree.getKingdom().equals("Animalia"))
            System.out.println("I am an ent");

        Tree readyMadeTrees [] = new Tree[3];
        readyMadeTrees[0] = sakura;
        readyMadeTrees[1] = oak;
        readyMadeTrees[2] = willow;


        Tree[] newTrees = {new Tree("Palm", "Arecaceae",
                "S America"), new Tree("Birch", "Betula",
                "N America, N Europe and N Asia")};

        ArrayList<Tree> coolTrees = new ArrayList<Tree>();
        coolTrees.add(sakura);
        coolTrees.add(willow);
        coolTrees.add(oak);
        coolTrees.add(newTrees[0]);
        coolTrees.add(newTrees[1]);

        for(Tree tree: coolTrees) {
            System.out.println(tree.getName());
        }

        Fruit strawberry = new Fruit("Strawberry", "Fragaria", "South America", 8);
        System.out.println(strawberry);
        System.out.println(strawberry.abstractMethod("delicious"));
    }
}
