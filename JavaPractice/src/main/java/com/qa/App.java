package com.qa;

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
        sakura.setContinentOfOrigin("Asia");
        System.out.println(sakura.toString());
    }
}
