import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *
 */
public class Introduction extends World
{
    GreenfootSound gfs_Intro;
    /**
     * Constructor for objects of class Introduction.
     * 
     */
    public Introduction()
    {    
        super(800, 700, 1);
        gfs_Intro = new GreenfootSound("introscreenmusicv2.wav");
        prepare();
    }

    public void started()
    {
        gfs_Intro.playLoop();
    }

    public void stopped()
    {
        gfs_Intro.stop();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        PlayButton playButton = new PlayButton();
        addObject(playButton,644,461);
        TutorialButton tutorialButton = new TutorialButton();
        addObject(tutorialButton,619,565);
        tutorialButton.setLocation(621,532);
        playButton.setLocation(619,479);
    }
}