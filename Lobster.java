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
    boolean enemy=true;
    public void act()
    {
        if(isTouching(Crab.class)&&enemy){
            System.out.println("touched Lobster");
            Greenfoot.stop();
            if(MyWorld.nocheat)System.exit(1);
        }
        move(speed);
        i++;
        if(isAtEdge())turn(Greenfoot.getRandomNumber(360));
        if(i>80){
            turn((Greenfoot.getRandomNumber(360)-180)/2);
            i=0;
        }
        
        // Add your action code here.
    }    
    public void ifNear(){
        MyWorld w = (MyWorld)getWorld();
        if(!isTouching(Crab.class)){
            return;
        }else{
            w.removeObject(this);
            w.lobster = new Lobster();
            w.addObject(w.lobster,Greenfoot.getRandomNumber(w.getWidth()-10)+5,Greenfoot.getRandomNumber(w.getHeight()-10)+5);
            w.lobster.ifNear();
        }
    }
}
