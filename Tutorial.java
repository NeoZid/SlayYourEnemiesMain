import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Tutorial screen to show players the controls needed to play the game
 * 
 * @author Maria Gabriela Salagean
 * @version 04/10/2025
 */
public class Tutorial extends World
{
    private GreenfootSound gameMusic;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Tutorial()
    {    
        super(800, 700, 1); 
        gameMusic =  new  GreenfootSound("Tutorial.wav");
        prepare();
    }
    
     public void started()
    {
        gameMusic.playLoop();
    }
    
     public void stopped()
    {
        gameMusic.stop();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Platform platform = new Platform();
        addObject(platform,634,410);
        Platform platform2 = new Platform();
        addObject(platform2,218,263);
        platform2.setLocation(192,276);
        Elora elora = new Elora();
        addObject(elora,73,585);
        Goblin goblin = new Goblin();
        addObject(goblin,84,337);
        elora.setLocation(83,602);
        Goblin goblin2 = new Goblin();
        addObject(goblin2,484,431);
        platform.setLocation(521,520);
        goblin2.setLocation(395,464);
        platform2.setLocation(251,378);
        goblin.setLocation(131,312);
        Platform platform3 = new Platform();
        addObject(platform3,132,680);
        Platform platform4 = new Platform();
        addObject(platform4,398,683);
        platform3.setLocation(116,679);
        Platform platform5 = new Platform();
        addObject(platform5,643,676);
        platform5.setLocation(723,677);
        Platform platform6 = new Platform();
        addObject(platform6,723,677);
        platform5.setLocation(511,670);
        platform4.setLocation(480,676);
        goblin2.setLocation(396,458);
        platform5.setLocation(667,678);
        platform3.setLocation(136,678);
        platform4.setLocation(394,677);
        Controls controls = new Controls();
        addObject(controls,597,209);
        PlayButton playButton = new PlayButton();
        addObject(playButton,108,96);
        MenuButton menuButton = new MenuButton();
        addObject(menuButton,118,180);
    }
}
