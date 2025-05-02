import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arrow extends Actor
{
    public Arrow(int shootTimer)
    {
        GreenfootImage image= getImage();
        image.scale(image.getWidth() *2, image.getHeight() *2);
        setImage(image);
    }
    
    /**
     * Act - do whatever the Arrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(20);
        if(isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
}
