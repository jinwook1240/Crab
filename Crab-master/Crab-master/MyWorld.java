import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new Crab(), 30, 30);
        addObject(new Worm(), 155, 288);
        addObject(new Worm(), 160, 50);
        addObject(new Worm(), 550, 73);
        addObject(new Worm(), 430, 300);
        addObject(new Worm(), 220, 234);
    }
}
