import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RockyPlatform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RockPlatform extends Ground
{
    public RockPlatform()
    {
        GreenfootImage image= getImage();
        image.scale(image.getWidth() /3, image.getHeight() /3);
        setImage(image);
    }
    /**
     * Act - do whatever the RockyPlatform wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
