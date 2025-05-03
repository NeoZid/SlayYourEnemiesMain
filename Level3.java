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
        super(800, 500, 1); 
        gameMusic = new GreenfootSound("boss_battle_#2.WAV"); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Sharruth1 sharruth1 = new Sharruth1();
        addObject(sharruth1,640,284);
        Elora elora = new Elora();
        addObject(elora,75,594);
        Rhiannon rhiannon = new Rhiannon();
        addObject(rhiannon,768,597);
        HealthBar healthBar = new HealthBar();
        addObject(healthBar,51,40);
        RockPlatform rockPlatform = new RockPlatform();
        addObject(rockPlatform,324,478);
        rockPlatform.setLocation(41,459);
        RockPlatform rockPlatform2 = new RockPlatform();
        addObject(rockPlatform2,376,475);
        RockPlatform rockPlatform3 = new RockPlatform();
        addObject(rockPlatform3,526,472);
        RockPlatform rockPlatform4 = new RockPlatform();
        addObject(rockPlatform4,604,472);
        RockPlatform rockPlatform5 = new RockPlatform();
        addObject(rockPlatform5,743,474);
        rhiannon.setLocation(764,396);
        rockPlatform.setLocation(104,472);
        elora.setLocation(65,408);
        rockPlatform4.setLocation(592,475);
        rockPlatform3.setLocation(257,473);
        rockPlatform2.setLocation(423,479);
        sharruth1.setLocation(483,252);
    }
    
    public void started(){
        gameMusic.playLoop();
    }
    
    public void stopped(){
        gameMusic.stop();
    }
}
