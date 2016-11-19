import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int i=0;
    int speed = 1;
    public void act() 
    {
        move(speed);
        i++;
        if(isAtEdge())turn(Greenfoot.getRandomNumber(360));
        if(i>80){
            turn((Greenfoot.getRandomNumber(360)-180)/2);
            i=0;
        }
        
        // Add your action code here.
    }    
}
