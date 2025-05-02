import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sharruth1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sharruth1 extends Actor
{
    private int shootTimer = 0;
    private int damage = 0;
    
    /**
     * Act - do whatever the Sharruth1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        shootTimer++;
        if (shootTimer >= 60) {
            shoot();
            shootTimer = 0;
        }
        slayMc();
        if (isGameLost()) {
            transitionToGameOver();        
        }
        
        takeHit();
    }
    
    public void shoot(){
        Fireball fireball = new Fireball();
        getWorld().addObject(fireball, getX(), getY());
        fireball.setRotation(getRotation());
        
    }
    
    public void moveAround(){
        move(-5);
        if(Greenfoot.getRandomNumber(10)==1) {
            turn(Greenfoot.getRandomNumber(90)-45); }
        if( isAtEdge()) {
            turn (70); }
        if(isTouching(Ground.class)) {
            turn (180);
        }
    }
    
    public void slayMc(){
        Actor elora = getOneIntersectingObject(Elora.class);
        if (elora != null) 
        {
            World world = getWorld();
            world.removeObject(elora);
        }
    }
    
    public boolean isGameLost(){
        World world = getWorld();
        if (world.getObjects(Elora.class).isEmpty()) {
            return true; 
        } else {
            return false;
        }
    }
    
    public void takeHit()
    {
        if(isTouching(Arrow.class)) {
            removeTouching(Arrow.class);
            damage = damage + 1;
            if(damage >= 10) {
                getWorld().removeObject(this);
            }
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
