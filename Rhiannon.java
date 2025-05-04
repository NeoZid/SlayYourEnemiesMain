import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rhiannon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rhiannon extends Actor
{
    /**
     * Act - do whatever the Rhiannon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        
        if (isSharruthDown()){
            isTouchingElora();
        }
    }
    
    public void move(){
        if(Greenfoot.getRandomNumber(10)==1) {
            move(-5);
        }
        if(Greenfoot.getRandomNumber(10)==1) {
            move(5); }
    }
    
    public void isTouchingElora(){
        if (isTouching(Elora.class)){
            transitionToWin();
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
    
    public void transitionToWin(){
        getWorld().stopped();
        World gameWin =  new  Win();
        gameWin.started();
        Greenfoot.setWorld(gameWin);
    }
}
