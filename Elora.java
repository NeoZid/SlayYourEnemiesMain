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
    private int stability = 60;
    private int vSpeed = 0;
    private int jumpStrength = -15;
    private int gravity = 1;
    private boolean spaceKeyDown;
    private int damage= 0;
    private int triggerX1= 36;
    private int triggerY1= 96;
    
    GreenfootImage eloraAfk;
    GreenfootImage eloraJump;
    /**
     * Act - do whatever the Knight wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        fireballHit();
        vSpeed += gravity;
        setLocation(getX(), getY() + vSpeed);
        
        jump();
        checkGround();
        turning();
        if(spaceKeyDown != Greenfoot.isKeyDown("space")) {
            spaceKeyDown = !spaceKeyDown;
            if (spaceKeyDown) {
                shoot();
            }
        }
        
        levelUp1();
        
        if(getWorld() instanceof Level2) {
           levelUp2(); 
        }
        
        eloraAfk = new GreenfootImage("EloraPngAI.png");
        eloraJump = new GreenfootImage("EloraJumpPngAI.png");
        
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
            setImage(eloraJump);
            vSpeed = jumpStrength;
        } else {
            setImage(eloraAfk);
        }
        
    }
    
    public void falling()
    {
        if(vSpeed > 0) {
            setImage(eloraJump);
            setLocation(getX(), getY() + vSpeed);
        } 
    }
    
    public void checkGround()
    {
       if(isTouching(Ground.class) && vSpeed > 0) {
           setLocation(getX(), getY() - 1);
           vSpeed = 0;
       }
        else {    
            falling();
       }
    }
    
    public void turning() {
        boolean facingRight = true;
        int margin = 5;
        World world = getWorld();
         if (getX() <= margin && facingRight) {
            getImage().mirrorHorizontally();
            facingRight = false;
        } 
        else if (getX() >= world.getWidth() - margin && !facingRight) {
            getImage().mirrorHorizontally();
            facingRight = true;
        }
    }
    
    public void shoot()
    {
        Arrow arrow = new Arrow(5);
        getWorld().addObject(arrow, getX(), getY());
        arrow.setRotation(getRotation());
    }
    
    public void goblinHit()
    {
        if(isTouching(Goblin.class)) {
            damage = damage + 1;
            if(damage >= 5) {
                stability = 50;
            }
        }
        
        if(stability <= 0) {
            transitionToGameOver();
        }
    }
    
    public void fireballHit(){ // this method gives the fireball damage when Elora is touching the fireball, same code could be used for goblinHit maybe?
        if (isTouching(Fireball.class)) {
            removeTouching(Fireball.class);
            damage = 10;
            stability = stability - damage;
            if (stability <= 0) 
            {
               transitionToGameOver(); 
            }
        }
    }
    
    public int getStability()
    {
        return this.stability;
    }
    
    public boolean isAtDoor() 
    {
        Actor door = getOneIntersectingObject(Door.class);
        if(door != null){
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean levelDone() 
    {
        if (getWorld().getObjects(Goblin.class).isEmpty()) {
            return true; 
        } else {
            return false;
        }
    }
    
    public void levelUp1() {
        if(isAtDoor() == true && levelDone() == true) {
            getWorld().stopped();
            World level2 =  new Level2();
            level2.started();
            Greenfoot.setWorld(level2);
        }
    }
    
    public void levelUp2()
    {
        if(isAtDoor() == true && levelDone() == true) {
            getWorld().stopped();
            World level3 =  new Level3();
            level3.started();
            Greenfoot.setWorld(level3);
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

