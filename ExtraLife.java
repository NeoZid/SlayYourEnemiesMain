import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ExtraLife here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExtraLife extends Goblin
{
    private int healAmount = 10;
    private GreenfootImage image;
    private boolean hasHealed = false;
    public ExtraLife(){
        image = new GreenfootImage("heart1.png");
        setImage(image);
    }
    
    public int getHealAmount(){
        return healAmount;
    }
    
    public void act()
    {
        
    }
    
}
