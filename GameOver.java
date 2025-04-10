import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    private GreenfootSound gameLost;
    
    
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 700, 1); 
        showTextWithBigBlackFont("Game Over", 400, 350);
        gameLost = new GreenfootSound("Steeps _of_Destiny.mp3");
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        SharruthWon sharruthWon = new SharruthWon();
        addObject(sharruthWon,429,461);
        MenuButton menuButton = new MenuButton();
        addObject(menuButton,117,507);
        menuButton.setLocation(119,64);
    }
    
    public void showTextWithBigBlackFont(String message,int centerX, int centerY)
    {
        
        GreenfootImage bg = getBackground();
        Font font =  new Font(50);
        bg.setFont(font);
        bg.setColor(Color.RED);
        
        // Measure text size
        GreenfootImage temp = new GreenfootImage(message, 50, Color.RED, null);
        int textWidth = temp.getWidth();
        int textHeight = temp.getHeight();

        // Calculate top-left position to center it
        int drawX = centerX - textWidth / 2;
        int drawY = centerY - textHeight / 2;

        bg.drawString(message, drawX, drawY);
    }
    
    public void started(){
        gameLost.playLoop();
    }
    
    public void stopped(){
        gameLost.stop();
    }
}
