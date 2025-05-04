import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fireball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fireball extends Actor
{
    private int damage = 10;
    private boolean shouldBeRemoved = false;
    
    /**
     * Act - do whatever the Fireball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Fireball(){
        setImage("fireball_50.png");
    }
    
    public void act()
    {
        if (shouldBeRemoved) {
            getWorld().removeObject(this);
            return;
        }
        
        move(3);
        
        if(isTouching(Elora.class)){
            Elora elora = (Elora) getOneIntersectingObject(Elora.class);
            if (elora != null) {
                elora.takeDamage(damage, this);
                shouldBeRemoved = true;
            }
        }
        
        if(isAtEdge()) {
            getWorld().removeObject(this); } //removes fireball at edge
    }
    
    
    
    public void transitionToGameOver()
    {
        getWorld().stopped();
        World gameOver =  new  GameOver();
        gameOver.started();
        Greenfoot.setWorld(gameOver);
    }
}

