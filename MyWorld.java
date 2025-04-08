import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private GreenfootSound gameMusic;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 700, 1); 
        getBackground().setColor(new Color(70, 0, 255));
        getBackground().fill();
        gameMusic = new GreenfootSound("boss_battle_#2.WAV");
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Platform platform = new Platform();
        addObject(platform,141,674);
        Platform platform2 = new Platform();
        addObject(platform2,427,674);
        Platform platform3 = new Platform();
        addObject(platform3,716,674);

        Sharruth1 sharruth1 = new Sharruth1();
        addObject(sharruth1,640,284);
        sharruth1.setLocation(585,379);
        Elora elora = new Elora();
        addObject(elora,75,594);
        Rhiannon rhiannon = new Rhiannon();
        addObject(rhiannon,768,597);
    }
    
    public void started(){
        gameMusic.playLoop();
    }
    
    public void stopped(){
        gameMusic.stop();
    }
}
