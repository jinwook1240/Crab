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
    public Lobster lobster;
    public Worm[] worm = new Worm[8];
    Crab crab = new Crab();
    public MyWorld()
    {    
        super(800, 600, 1); 
        addObject(new Lobster(),200,200);
        addObject(new Turtle(),400,400);
        addObject(crab, getWidth()/2,getHeight()/2);
        for(int i=0;i<worm.length;i++){
            worm[i] = new Worm();
        }
        addWorm();
    }
    public void act(){
        addWorm();
    }
    public void addLobster(){
        lobster = new Lobster();
        addObject(lobster,Greenfoot.getRandomNumber(getWidth()-10)+5,Greenfoot.getRandomNumber(getHeight()-10)+5);
        lobster.ifNear();
    }
    public void addWorm(){
        for(int i=0;i<worm.length;i++){
            if(worm[i].getWorld()!=this){
                worm[i] = new Worm();
                addObject(worm[i],Greenfoot.getRandomNumber(getWidth()-10)+5,Greenfoot.getRandomNumber(getHeight()-10)+5);
                worm[i].ifNear(i);
            }
        }
    }
    
}
