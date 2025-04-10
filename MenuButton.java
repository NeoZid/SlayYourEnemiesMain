import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuButton extends Actor
{
    public MenuButton()
    {
        GreenfootImage image= getImage();
        image.scale(image.getWidth() *2, image.getHeight() *2);
        setImage(image);
    }
    /**
     * Act - do whatever the MenuButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this)) {
            transitionIntro();
        }
    }
    
    public void transitionIntro()
    {
        getWorld().stopped();
        World introduction = new Introduction();
        introduction.started();
        Greenfoot.setWorld(introduction);
    }
}
