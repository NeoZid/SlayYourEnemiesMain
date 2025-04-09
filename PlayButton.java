import greenfoot.*;
/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayButton extends Actor
{
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public PlayButton()
    {
        GreenfootImage image= getImage();
        image.scale(image.getWidth() *2, image.getHeight() *2);
        setImage(image);
    }
    
    public void act()
    {
       if(Greenfoot.mouseClicked(this)) {
          transitionLevel1();     
    }
    }
    
    public void transitionLevel1()
    {
        World level1 = new Level1();
        Greenfoot.setWorld(level1);
    }
}

