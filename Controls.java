import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Controls here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Controls extends Actor
{
    public Controls()
    {
        GreenfootImage image= getImage();
        image.scale(image.getWidth() /2, image.getHeight() /2);
        setImage(image);
    }
    /**
     * Act - do whatever the Controls wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
