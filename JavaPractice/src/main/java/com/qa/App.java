package com.qa;

import com.tree.Tree;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Tree willow = new Tree();
        willow.setName("Willow");
        willow.setGenus("Salix");
        willow.setContinent("Europe");
        System.out.println(willow);

        Tree sakura = new Tree();
        System.out.println(sakura);
        Tree oak = new Tree("Oak", "Quercus", "Europe");
        System.out.println(oak);

        System.out.println(Tree.photosynthesis("CO2, water, sun"));

        Tree.setKingdom("Animalia");
        if (Tree.getKingdom().equals("Animalia"))
            System.out.println("I am an ent");

        Tree readyMadeTrees [] = new Tree[3];
        readyMadeTrees[0] = sakura;
        readyMadeTrees[1] = oak;
        readyMadeTrees[2] = willow;

        System.out.println(Arrays.deepToString(readyMadeTrees));

        Tree[] newTrees = {new Tree("Palm", "Arecaceae",
                "S America"), new Tree("Birch", "Betula",
                "N America, N Europe and N Asia")};

        System.out.println(Arrays.deepToString(newTrees));

        ArrayList<Tree> coolTrees = new ArrayList<Tree>();
        coolTrees.add(sakura);
        coolTrees.add(willow);
        coolTrees.add(oak);
        coolTrees.add(new Tree("Palm", "Arecaceae",
                "S America"));
        coolTrees.add(new Tree("Birch", "Betula",
                "N America, N Europe and N Asia"));

        System.out.println(coolTrees.toString());

        for(Tree tree: coolTrees) {
            System.out.println(tree.getName());
        }



    }
}
