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
    GreenfootSound gfs_Level1;
    Door door = new Door();
    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level1()
    {    
        super(800, 700, 1);
        door.setLocation(36,96);
        gfs_Level1= new GreenfootSound("level1.wav");
        prepare();
        levelDone();
        levelUp();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elora elora = new Elora();
        addObject(elora,88,648);
        Goblin goblin = new Goblin();
        addObject(goblin,259,650);
        Goblin goblin2 = new Goblin();
        addObject(goblin2,609,398);
        Goblin goblin3 = new Goblin();
        addObject(goblin3,220,353);
        Goblin goblin4 = new Goblin();
        addObject(goblin4,453,346);
        goblin3.setLocation(217,104);
        elora.setLocation(48,602);
        goblin4.setLocation(298,413);
        goblin2.setLocation(718,455);
        goblin.setLocation(310,604);
        CastlePlatform castlePlatform = new CastlePlatform();
        addObject(castlePlatform,452,267);
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
        CastlePlatform castlePlatform12 = new CastlePlatform();
        addObject(castlePlatform12,591,670);
        CastlePlatform castlePlatform13 = new CastlePlatform();
        addObject(castlePlatform13,648,620);
        castlePlatform13.setLocation(631,624);
        HealthBar healthBar = new HealthBar();
        addObject(healthBar,636,90);
        Door door = new Door();
        addObject(door,36,96);
        door.setLocation(36,96);
    }
    
     public void started()
    {
        gfs_Level1.playLoop();
    }
    
    public void stopped()
    {
        gfs_Level1.stop();
    }
    
    public boolean levelDone(){
        if (getObjects(Goblin.class).isEmpty()) {
            return true; 
        } else {
            return false;
        }
    }
    
    public void levelUp()
    {
        if(levelDone() && door.eloraAtDoor()) {
            stopped();
            World level2 =  new Level2();
            level2.started();
            Greenfoot.setWorld(level2);
        }
    }
}

