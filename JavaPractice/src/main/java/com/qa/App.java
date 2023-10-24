package com.qa;

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
    }
}
