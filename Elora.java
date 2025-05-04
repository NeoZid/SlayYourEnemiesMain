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
    private GreenfootSound oofSfx =  new  GreenfootSound("damage.wav");
    
    private int velocityY = 0;
    private int gravity = 1;
    private int jumpStrength = -15;
    private boolean onGround = false;
    private boolean spaceKeyDown;
    private boolean facingRight = true;
    private int damage = 0;
    
    private HealthBar healthBar;
    private int currentStability = 60;
    private int shootTimer = 0;
    private int shootDelay = 20;
    
    
    private int pushBackStrength = 50;
    private boolean isBeingPushed = false;
    private int pushbackCounter = 0;
    private int pushbackDuration = 10;
    
    GreenfootImage eloraAfk = new GreenfootImage("EloraPngAI.png");
    GreenfootImage eloraJump = new GreenfootImage("EloraJumpPngAI.png");
    
    public Elora(HealthBar bar){
        this.healthBar = bar;
    }
    
    public void act()
    {
        move();
        applyGravity();
        checkGround();
        heal();
        if (shootTimer > 0) {
            shootTimer--;
        }
        if (isBeingPushed) {
            applyPushback();
            
        }
        
        if(spaceKeyDown != Greenfoot.isKeyDown("space")) {
            spaceKeyDown = !spaceKeyDown;
            if (spaceKeyDown) {
                shoot();
            }
        }
        
        
    }

    public void move()
    {
        if(Greenfoot.isKeyDown("a")) {
            setLocation(getX()-4, getY());
            if (facingRight) {
                flipImage();
                facingRight = false;
            }
        }
        if(Greenfoot.isKeyDown("d")) {
            setLocation(getX()+4, getY());
            if (!facingRight) {
                flipImage();
                facingRight = true;
            }
        }
        if (Greenfoot.isKeyDown("w")) {
            jump();
        } 
        
    }
    
    public void takeDamage(int amount, Actor source){
        currentStability -= amount;
        currentStability = Math.max(0, currentStability);
        healthBar.setStability(currentStability);
        
        if (oofSfx != null && !oofSfx.isPlaying()) {
            oofSfx.play();
        }
        
        pushBack(source);
    }
    
    public void pushBack(Actor source){
        if (!isBeingPushed) {
            isBeingPushed = true;
            pushbackCounter = pushbackDuration;
            
            int directionToSource = getX() - source.getX();
            
            if (directionToSource > 0){
                setLocation(getX() + pushBackStrength, getY());
            } else if (directionToSource < 0) {
                setLocation(getX() - pushBackStrength, getY());
            }
        }
    }
    
    public void applyPushback(){
        if (pushbackCounter > 0) {
            pushbackCounter--;
        }
        if (pushbackCounter == 0){
            isBeingPushed = false;
        }
    }
    
    private void flipImage()
    {
        GreenfootImage image = getImage();
        image.mirrorHorizontally();
        setImage(image);
    }
    
    public void jump()
    {
        velocityY = jumpStrength;
        onGround = false;
    }

    public void applyGravity(){
        setLocation(getX(), getY() + velocityY);
        velocityY += gravity;
    }
    
    public void checkGround()
    {
       Actor ground = getOneObjectAtOffset(0, getImage().getHeight()/2, Ground.class);
       
       if (ground != null && velocityY >= 0) {
           setLocation(getX(), ground.getY() - ground.getImage().getHeight()/2 - getImage().getHeight()/2);
           velocityY = 0;
           onGround = true;
        } else if (getY() >= getWorld().getHeight()- getImage().getHeight()/2) {
            velocityY = 0;
            onGround = true;
        } else {
            onGround = false;
        }
    }
    
    public void shoot()
    {
        if (shootTimer == 0) {
            int arrowSpeed = facingRight ? 10 : -10;
            int spawnOffset = facingRight ? 20 : -20;
        
        
            Arrow arrow = new Arrow(arrowSpeed);
            getWorld().addObject(arrow, getX() + spawnOffset, getY());
        
            shootTimer = shootDelay;
        }
    }
    
    private void heal(){
        ExtraLife extralife = (ExtraLife) getOneIntersectingObject(ExtraLife.class);
        if (extralife != null) {
            currentStability += extralife.getHealAmount();
            currentStability = Math.max(60, currentStability);
            healthBar.setStability(currentStability);
            getWorld().removeObject(extralife);
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

