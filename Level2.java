import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{
    private GreenfootSound gfs_level2;
    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2()
    {    
        super(800, 700, 1); 
        gfs_level2 = new GreenfootSound("Level3.wav");
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        RockyPlatform rockyPlatform = new RockyPlatform();
        addObject(rockyPlatform,373,447);
        RockyPlatform rockyPlatform2 = new RockyPlatform();
        addObject(rockyPlatform2,628,334);
        RockyPlatform rockyPlatform3 = new RockyPlatform();
        addObject(rockyPlatform3,588,155);
        RockyPlatform rockyPlatform4 = new RockyPlatform();
        addObject(rockyPlatform4,550,54);
        Door door = new Door();
        addObject(door,555,51);
        door.setLocation(491,70);
        rockyPlatform4.setLocation(552,136);
        rockyPlatform3.setLocation(768,274);
        rockyPlatform2.setLocation(474,373);
        Goblin goblin = new Goblin();
        addObject(goblin,536,334);
        goblin.setLocation(488,316);
        Goblin goblin2 = new Goblin();
        addObject(goblin2,321,602);
        goblin2.setLocation(336,607);
        Goblin goblin3 = new Goblin();
        addObject(goblin3,608,100);
        goblin3.setLocation(616,86);
        Goblin goblin4 = new Goblin();
        addObject(goblin4,656,609);
        goblin4.setLocation(668,614);
        Elora elora = new Elora();
        addObject(elora,59,601);
        elora.setLocation(58,602);
        rockyPlatform.setLocation(232,467);
    }
    
     public void started()
    {
        gfs_level2.playLoop();
    }
    
     public void stopped()
    {
        gfs_level2.stop();
    }
}
