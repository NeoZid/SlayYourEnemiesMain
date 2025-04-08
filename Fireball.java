import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fireball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fireball extends Actor
{
    /**
     * Act - do whatever the Fireball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Fireball(){
        setImage("fireball_50.png");
        
    }
    
    public void act()
    {
        move(5);
        checkCollision();
        if(isAtEdge()) {
            getWorld().removeObject(this); } //removes fireball at edge
    }
    
    public void checkCollision(){
        Actor elora = getOneIntersectingObject(Elora.class);
        if (elora != null) {
            getWorld().removeObject(elora);
            
        }
    }
    
    
}

