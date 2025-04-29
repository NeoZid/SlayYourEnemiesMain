import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SplashScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SplashScreen extends World
{
    double timeEndScreenCreation = System.currentTimeMillis();

    /**
     * Constructor for objects of class SplashScreen.
     * 
     */
    public SplashScreen()
    {    
        super(800, 700, 1);
        GreenfootImage background = getBackground();
        background.setColor(Color.WHITE);
        background.fill();
        showText("Game Programming 1", 400, 200);
        showText("Chloe Castrataro, Gabriela Salagean, Neo De Guzman", 400, 300);
        prepare();
    }

    public void act()
    {
        if(System.currentTimeMillis() >= (timeEndScreenCreation + 3000))
        {
            transitionIntro();
        }
    }

    public void transitionIntro()
    {
        World introduction = new Introduction();
        introduction.started();
        Greenfoot.setWorld(introduction);
    }   
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Vanier vanier = new Vanier();
        addObject(vanier,594,182);
        vanier.setLocation(601,302);
    }
}
