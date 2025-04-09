import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HeartAnimated here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HeartAnimated extends Actor
{
    GreenfootImage heart1;
    GreenfootImage heart2;
    GreenfootImage heart3;
    GreenfootImage heart4;
    
    public HeartAnimated()
    {
        heart1 = new GreenfootImage("heart1.png");
        heart2 = new GreenfootImage("heart2.png");
        heart3 = new GreenfootImage("heart3.png");
        heart4 = new GreenfootImage("heart4.png");
        setImage(heart1);
    }
    
    /**
     * Act - do whatever the HeartAnimated wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
<<<<<<< HEAD
            if (getImage() == heart1) 
            {
                setImage(heart2);
            }
            else if (getImage() == heart2) 
            {
                setImage(heart3);
            }
            else if (getImage() == heart3) 
            {
                setImage(heart4);
            }
            else if (getImage() == heart4) 
            {
                setImage(heart1);
            }
=======
    
>>>>>>> d4d9b6ae1ed8a5fdd5ae2bd5a84e0b72253bad15
    }
}
