import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class win here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Win extends World
{
    private GreenfootSound gfs_GameOverWorld;
    /**
     * Constructor for objects of class win.
     * 
     */
    public Win()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 700, 1); 
        showTextWithBigBlackFont("You Win!", 180, 200);
        gfs_GameOverWorld =  new  GreenfootSound("");
    }
    
    public void showTextWithBigBlackFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(50);
        bg.setFont(font);
        bg.setColor(Color.WHITE);
        bg.drawString(message, x, y);
    }
    
     public void started()
    {
        gfs_GameOverWorld.playLoop();
    }

    /**
     * 
     */
    public void stopped()
    {
        gfs_GameOverWorld.stop();
    }
}