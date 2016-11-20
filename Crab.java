import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Crab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crab extends Actor
{
    public int score=0;
    private int speed=4;
    GreenfootImage background;
    public int lobstercount = 0;
    public void addedToWorld(World world){
        background = world.getBackground();
    }

    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("up")){
            move(5);
        }
        if(Greenfoot.isKeyDown("down")){
            move(-4);
        }
        if(Greenfoot.isKeyDown("left")){
            turn(-5);
        }
        if(Greenfoot.isKeyDown("right")){
            turn(5);
        }
        if(isTouching(Worm.class)){
            removeTouching(Worm.class);
            score += 10;
            GreenfootImage scoreadd = new GreenfootImage(background);
            scoreadd.setColor(Color.black);
            scoreadd.drawString("점수 : "+score,20,20);
            getWorld().setBackground(scoreadd);
            if(score != lobstercount&&score%100==0){
                lobstercount = score;
                ((MyWorld)getWorld()).addLobster();
                for(int i=0;i<score/500;i++)((MyWorld)getWorld()).addLobster();
            }
    }
    if(isAtEdge())turn(Greenfoot.getRandomNumber(100)+130);
}
}
