import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arrow extends Actor
{
    private int damage = 10;
    private int life = 1;
    
    /**
     * Act - do whatever the Arrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(life <=0) {
            getWorld().removeObject(this);
        }
        else {
            move(6);
            Goblin goblin = (Goblin) getOneIntersectingObject(Goblin.class);
            if(goblin != null) {
                getWorld().removeObject(this);
                goblin.hit(damage);
            }
            else {
                life--;
            }
        }
    }
    
    
}
