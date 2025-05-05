import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lightning here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lightning extends Actor
{
    private int speed; 
    private int damage = 20;
    private boolean shouldBeRemoved = false;
    
    public Lightning(int speed)
    {
        this.speed = speed;
        GreenfootImage image = new GreenfootImage("lightning.png");
        image.scale(image.getWidth() *4, image.getHeight() *4);
        setImage(image);
    }
    
    /**
     * Act - do whatever the Lightning wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(speed);
        
        if(isTouching(Sharruth1.class)){
            Sharruth1 sharruth1 = (Sharruth1) getOneIntersectingObject(Sharruth1.class);
            if (sharruth1 != null) {
                sharruth1.takeDamage(damage);
                shouldBeRemoved = true;
            }
        }
        
        if (shouldBeRemoved == true) {
            getWorld().removeObject(this);
            return;
        }
        
        if(isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
}
