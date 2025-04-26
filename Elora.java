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
    private int stability = 60;
    private int vSpeed = 0;
    private int jumpStrength = -15;
    private int gravity = 1;
    
    /**
     * Act - do whatever the Knight wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        
        vSpeed += gravity;
        setLocation(getX(), getY() + vSpeed);
        
        jump();
        checkGround();
        
        if(Greenfoot.isKeyDown("space")) {
            shoot();
        }
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
    
    public void jump()
    {
        if(Greenfoot.isKeyDown("w")) {
            vSpeed = jumpStrength;
        }
    }
    
    public void falling()
    {
        if(vSpeed > 0) {
            setLocation(getX(), getY() + vSpeed);
        }
    }
    
    public void checkGround()
    {
       if(isTouching(Ground.class) && vSpeed >0) {
           setLocation(getX(), getY() - 1);
           vSpeed = 0;
       }
       else {
           falling();
       }
    }
    
    public void shoot()
    {
        Arrow arrow = new Arrow();
        getWorld().addObject(arrow, getX(), getY());
        arrow.setRotation(getRotation());
    }
    
    public void hit(int damage)
    {
        stability = stability - damage;
        if(stability <=0) {
            transitionToGameOver();
        }
    }
    
    public int getStability()
    {
        return this.stability;
    }
    
    public void transitionToGameOver()
    {
        getWorld().stopped();
        World gameOver =  new  GameOver();
        gameOver.started();
        Greenfoot.setWorld(gameOver);
    }
}
