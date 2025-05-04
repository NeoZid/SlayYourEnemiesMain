import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBar extends Actor
{
    GreenfootImage image1 = new GreenfootImage("1.png");
    GreenfootImage image2 = new GreenfootImage("2.png");
    GreenfootImage image3 = new GreenfootImage("3.png");
    GreenfootImage image4 = new GreenfootImage("4.png");
    GreenfootImage image5 = new GreenfootImage("5.png");
    GreenfootImage image6 = new GreenfootImage("6.png");;
    
    private int stability = 60;
    
    public HealthBar(){
        updateImage();
    }
    
    public void setStability(int value) {
        stability = Math.max(0, value);
        updateImage();
    }
    
    public int getStability(){
        return stability;
    }
    
    public void updateImage()
    {
        if (stability >= 60) {
            setImage(image6);
        }
        else if(stability >= 50) {
           setImage(image5);
        }
        else if(stability  >= 40) {
            setImage(image4);
        }
        else if(stability  >= 30) {
            setImage(image3);
        }
        else if(stability  >= 20) {
            setImage(image2);
        }
        else if(stability  >= 10) {
            setImage(image1);
        }
        
        else if (stability == 0) {
            transitionToGameOver();
        }
    }
    
    public void transitionToGameOver()
    {
        getWorld().stopped();
        World gameOver =  new  GameOver();
        gameOver.started();
        Greenfoot.setWorld(gameOver);
    }
}
