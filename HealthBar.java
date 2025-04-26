import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBar extends Elora
{
    GreenfootImage image1;
    GreenfootImage image2;
    GreenfootImage image3;
    GreenfootImage image4;
    GreenfootImage image5;
    GreenfootImage image6;
    
    /**
     * Act - do whatever the HealthBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       image6 = new GreenfootImage("6.png");
       image5 = new GreenfootImage("5.png");
       image4 = new GreenfootImage("4.png");
       image3 = new GreenfootImage("3.png");
       image2 = new GreenfootImage("2.png");
       image1 = new GreenfootImage("1.png"); 
       
       damage();
    }
    
    public void damage()
    {
        setImage(image6);
        
        if(getStability() == 50) {
           setImage(image5);
        }
        else if(getStability() == 40) {
            setImage(image4);
        }
        else if(getStability() == 30) {
            setImage(image3);
        }
        else if(getStability() == 20) {
            setImage(image2);
        }
        else if(getStability() == 10) {
            setImage(image1);
        }
    }
}
