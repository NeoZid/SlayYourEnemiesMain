import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HeartAnimated here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HeartAnimated extends Actor
{   
    GreenfootImage heart4; 

    public HeartAnimated()
    {
        heart4 = new GreenfootImage("heart4.png");
        setImage(heart4);
        
    }
    
    /**
     * Act - do whatever the HeartAnimated wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        turn(8);
    }
}
