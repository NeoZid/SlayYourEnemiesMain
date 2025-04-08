import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SharruthWon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SharruthWon extends Actor
{
    /**
     * Act - do whatever the SharruthWon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
    }
    
    public void moveAround(){
        move(-5);
        if(Greenfoot.getRandomNumber(10)==1) {
            turn(Greenfoot.getRandomNumber(90)-45); }
        if( isAtEdge()) {
            turn (90); }
        if(isTouching(Ground.class)) {
            turn (180);
        }
    }
}
