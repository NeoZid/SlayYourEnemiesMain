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
<<<<<<< HEAD
        elora.setLocation(51,600);
        door.setLocation(35,96);
        goblin.setLocation(284,600);
        goblin4.setLocation(450,196);
        goblin3.setLocation(205,99);
        goblin2.setLocation(736,451);
=======
        door.setLocation(50,300);
        elora.setLocation(20,640);
        goblin4.setLocation(523,565);
        goblin2.setLocation(661,477);
        goblin3.setLocation(231,315);
        goblin.setLocation(222,641);
>>>>>>> d4d9b6ae1ed8a5fdd5ae2bd5a84e0b72253bad15
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

