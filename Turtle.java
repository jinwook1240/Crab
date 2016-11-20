import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turtle extends Lobster implements Freezable
{
    int counter=0;
    int j = 0;
    public Turtle(){
        super();
        super.enemy=false;
    }
    /**
     * Act - do whatever the Turtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
        freeze(30,120);
        removeTouching(Lobster.class);
    }
    public void freeze(int stoptime, int movetime){
     counter++;
     if(counter<movetime){
         super.act();
        }else if(counter<stoptime+movetime){
            return;
        }else{
            counter =0;
        }
    }
}

