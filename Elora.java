import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elora extends Actor
{
    /**
     * Act - do whatever the Elora wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        
    }
    
    public void move(){
        
        if(Greenfoot.isKeyDown("a")) {
            move(-5);
        }
        if(Greenfoot.isKeyDown("d")) {
            move(5);
        }
    }
    
    
}
