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
    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level1()
    {    
        super(800, 700, 1);
        gfs_Level1= new GreenfootSound("level1.wav");
        prepare();
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
        Door door = new Door();
        addObject(door,50,325);
        door.setLocation(25,98);
        goblin3.setLocation(217,104);
        elora.setLocation(48,602);
        goblin4.setLocation(298,413);
        goblin2.setLocation(718,455);
        door.setLocation(33,94);
        goblin.setLocation(310,604);
    }
    
     public void started()
    {
        gfs_Level1.playLoop();
    }
    
    public void stopped()
    {
        gfs_Level1.stop();
    }
}

