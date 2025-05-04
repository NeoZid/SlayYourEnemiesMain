import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Level 1 of Slay Your Enemies game. Starting at the bottom of the castle 
 * tower
 * 
 * @author Chloe Castrataro
 * @version 04/04/2025
 */
public class Level1 extends World
{
    
    Door door = new Door();
    
    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level1()
    {    
        super(800, 700, 1);
        door.setLocation(36,96);
        prepare();
    }
    
    public void started(){
        MusicManager.play("level1.wav");
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
        HealthBar bar = new HealthBar();
        Elora elora = new Elora(bar);
        addObject(bar,56,594);
        addObject(elora,56,594);
        
        
        Goblin goblin = new Goblin();
        addObject(goblin,259,650);
        Goblin goblin2 = new Goblin();
        addObject(goblin2,609,398);
        Goblin goblin3 = new Goblin();
        addObject(goblin3,220,353);
        Goblin goblin4 = new Goblin();
        addObject(goblin4,453,346);
        goblin3.setLocation(217,104);

        goblin4.setLocation(298,413);
        goblin2.setLocation(718,455);
        goblin.setLocation(310,604);
        CastlePlatform castlePlatform2 = new CastlePlatform();
        addObject(castlePlatform2,615,423);
        CastlePlatform castlePlatform3 = new CastlePlatform();
        addObject(castlePlatform3,722,521);
        CastlePlatform castlePlatform4 = new CastlePlatform();
        addObject(castlePlatform4,74,680);
        CastlePlatform castlePlatform5 = new CastlePlatform();
        addObject(castlePlatform5,231,678);
        CastlePlatform castlePlatform6 = new CastlePlatform();
        addObject(castlePlatform6,358,676);
        CastlePlatform castlePlatform7 = new CastlePlatform();
        addObject(castlePlatform7,79,182);
        CastlePlatform castlePlatform8 = new CastlePlatform();
        addObject(castlePlatform8,235,181);
        castlePlatform2.setLocation(587,423);
        CastlePlatform castlePlatform9 = new CastlePlatform();
        addObject(castlePlatform9,80,481);
        CastlePlatform castlePlatform10 = new CastlePlatform();
        addObject(castlePlatform10,236,480);
        CastlePlatform castlePlatform11 = new CastlePlatform();
        addObject(castlePlatform11,317,480);
        Door door = new Door();
        addObject(door,36,96);
        door.setLocation(36,96);
        castlePlatform4.setLocation(62,671);
        castlePlatform5.setLocation(192,668);
        castlePlatform7.setLocation(64,165);
        castlePlatform8.setLocation(222,164);
        goblin2.setLocation(717,450);
        castlePlatform3.setLocation(722,513);
        goblin3.setLocation(218,101);
        castlePlatform9.setLocation(44,463);
        castlePlatform11.setLocation(331,466);
        goblin4.setLocation(245,404);
        castlePlatform6.setLocation(348,669);
        castlePlatform10.setLocation(188,464);
        castlePlatform2.setLocation(557,259);
        bar.setLocation(50,28);
    }
    
}

