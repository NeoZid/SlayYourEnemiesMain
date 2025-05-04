import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arrow extends Actor
{
    private int speed;
    private int damage = 10;
    private boolean shouldBeRemoved = false;
    public Arrow(int speed)
    {
        this.speed = speed;
        
        GreenfootImage image = new GreenfootImage("arrow.png");
        
        image.scale(image.getWidth() *2, image.getHeight() *2);
        
        if (speed < 0){
            image.mirrorHorizontally();
        }
        
        setImage(image);
    }
    
    /**
     * Act - do whatever the Arrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(speed);
        
        if (shouldBeRemoved) {
            getWorld().removeObject(this);
            return;
        }
        
        if(isTouching(Goblin.class)){
            Goblin goblin = (Goblin) getOneIntersectingObject(Goblin.class);
            if (goblin != null) {
                goblin.takeDamage(damage);
                shouldBeRemoved = true;;
            }
        }
        
        if(isTouching(Sharruth1.class)){
            Sharruth1 sharruth1 = (Sharruth1) getOneIntersectingObject(Sharruth1.class);
            if (sharruth1 != null) {
                sharruth1.takeDamage(damage);
                shouldBeRemoved = true;;
            }
        }
        
        if(isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
}
