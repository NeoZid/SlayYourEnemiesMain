import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Lst level in the game, boss battle with Sharruth the dragon to save 
 * princess Rhiannon
 * 
 * @author Gabriela
 * @version 04/10/2025
 */
public class Level3 extends World
{
    
    
    /**
     * 
     */
    public Level3()
    {    
        super(800, 500, 1); 
        started();
        prepare();
        
    }
    
    public void started(){
        MusicManager.play("boss_battle_#2.WAV");
    }
    
    public void stopped(){
        MusicManager.stop();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Sharruth1 sharruth1 = new Sharruth1();
        addObject(sharruth1,640,284);
        HealthBar bar = new HealthBar();
        Elora elora = new Elora(bar);
        addObject(bar,75,594);
        addObject(elora,75,594);
        Rhiannon rhiannon = new Rhiannon();
        addObject(rhiannon,768,597);
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
        rockPlatform4.setLocation(592,475);
        rockPlatform3.setLocation(257,473);
        rockPlatform2.setLocation(423,479);
        sharruth1.setLocation(483,252);
        elora.setLocation(85,459);
        elora.setLocation(115,384);
        elora.setLocation(255,294);
        rockPlatform.setLocation(80,474);
        elora.setLocation(91,389);
        elora.setLocation(102,474);
        rockPlatform.setLocation(93,474);
        elora.setLocation(155,352);
        elora.setLocation(347,351);
        rockPlatform.setLocation(80,482);
        rockPlatform.setLocation(74,478);
        elora.setLocation(44,411);
        bar.setLocation(50,28);
        elora.setLocation(68,390);
        elora.setLocation(54,405);
    }
    
   
}
