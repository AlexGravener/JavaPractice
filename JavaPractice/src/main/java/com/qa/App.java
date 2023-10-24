package com.qa;

import com.tree.Tree;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Tree sakura = new Tree();
        sakura.setGenus("Prunus");
        sakura.setName("Sakura");
        sakura.setContinent("Asia");
        System.out.println(sakura);

        Tree willow = new Tree();
        willow.setName("Willow");
        willow.setGenus("Salix");
        willow.setContinent("Europe");
        System.out.println(willow);

        Tree oak = new Tree("Oak", "Quercus", "Europe");
        System.out.println(oak);

        System.out.println(Tree.photosynthesis("CO2, water, sun"));

        Tree.setKingdom("Animalia");
        if (Tree.getKingdom().equals("Animalia"))
            System.out.println("I am an ent");
    }
}
