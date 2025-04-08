import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TutorialButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TutorialButton extends Actor
{
    public TutorialButton()
    {
        GreenfootImage image= getImage();
        image.scale(image.getWidth()* 2, image.getHeight()* 2);
        setImage(image);
    }
        
    /**
     * Act - do whatever the TutorialButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       if(Greenfoot.mouseClicked(this)) {
          transitionTutorial();     
    }
    }
    
    public void transitionTutorial()
    {
        World tutorial = new Tutorial();
        Greenfoot.setWorld(tutorial);
    }
}