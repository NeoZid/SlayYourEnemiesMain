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
        
        if (isGameLost() == true) {
            transitionToGameOver();        
        }
        
        if (isSharruthDown() == true) {
            transitionToWin();
        } 
        
        takeHit();
    }
    
    public void shoot(){
        Fireball fireball = new Fireball();
        getWorld().addObject(fireball, getX(), getY());
        fireball.setRotation(getRotation());
        
    }
    
    public void moveAround(){
        move(-3);
        if(Greenfoot.getRandomNumber(10)==1) {
            turn(Greenfoot.getRandomNumber(90)-45); }
        if( isAtEdge()) {
            turn (70); }
        if(isTouching(Ground.class)) {
            turn (180);
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
    
    public boolean isSharruthDown(){
        World world = getWorld();
        if (world.getObjects(Sharruth1.class).isEmpty()) {
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
    
    public void transitionToWin(){
        getWorld().stopped();
        World gameWin =  new  Win();
        gameWin.started();
        Greenfoot.setWorld(gameWin);
    }
}
