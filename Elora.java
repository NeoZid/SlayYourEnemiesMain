import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Player character for Slay Your Enemies game. She must climb the tower to 
 * save the princess from the evil dragon. Player controls her movements and
 * guides her to the top
 * 
 * @author Chloe Castrataro
 * @version 04/04/2025
 */
public class Elora extends Actor
{   
    private int shootTimer = 0;
    private int stability = 50;
    
    /**
     * Act - do whatever the Knight wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
    }

    public void move()
    {
        if(Greenfoot.isKeyDown("a")) {
            move(-6);
        }
        if(Greenfoot.isKeyDown("d")) {
            move(6);
        }
    }
    
    public void shoot()
    {
        Arrow arrow = new Arrow();
        getWorld().addObject(arrow, getX(), getY());
    }
    
    public void hit(int damage)
    {
        stability = stability - damage;
        if(stability <=0) {
            transitionToGameOver();
        }
    }
    
    public void transitionToGameOver()
    {
        getWorld().stopped();
        World gameOver =  new  GameOver();
        gameOver.started();
        Greenfoot.setWorld(gameOver);
    }
}
