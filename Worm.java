import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Worm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Worm extends Actor
{
    /**
     * Act - do whatever the Worm wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int counter = 0;
    int lifetime = Greenfoot.getRandomNumber(100)+250;
    public void act() 
    {
        counter++;
        if(counter>lifetime){
            getWorld().removeObject(this);
        }
    }
    
    public void ifNear(int num){
        MyWorld w = (MyWorld)getWorld();
        if(!isTouching(Crab.class)){
            return;
        }else{
            w.removeObject(w.worm[num]);
            w.worm[num] = new Worm();
            w.addObject(w.worm[num],Greenfoot.getRandomNumber(w.getWidth()-10)+5,Greenfoot.getRandomNumber(w.getHeight()-10)+5);
            w.worm[num].ifNear(num);
        }
    }
}
