import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Lst level in the game, boss battle with Sharruth the dragon to save 
 * princess Rhiannon
 * 
 * @author Neo De Guzman 
 * @version 04/10/2025
 */
public class Level3 extends World
{
    private GreenfootSound gameMusic;
    
    /**
     * 
     */
    public Level3()
    {    
        super(900, 700, 1); 
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
        HealthBar healthBar = new HealthBar();
        addObject(healthBar,51,40);
    }
    
    public void started(){
        gameMusic.playLoop();
    }
    
    public void stopped(){
        gameMusic.stop();
    }
}
