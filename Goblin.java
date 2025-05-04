import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Goblin character that moves back and forth while animating its walking.
 */
public class Goblin extends Actor
{
    GreenfootImage image1;
    GreenfootImage image2;
    GreenfootImage image3;
    GreenfootImage image4;
    
    private boolean movingRight = true;
    private int stepsTaken = 0;
    private int maxSteps = 90; 
    private int stepSize = 1; 

    private int animationDelay = 0;
    
    private int health = 50;
    private int damage = 10;

    public Goblin()
    {
        image1 = new GreenfootImage("goblinwalk1.png");
        image2 = new GreenfootImage("goblinwalk2.png");
        image3 = new GreenfootImage("goblinwalk3.png");
        image4 = new GreenfootImage("goblinattack3.png");

        setImage(image1);
        getImage().scale(100, 120);
        
        setImage(image4);
        getImage().scale(100, 120);
        
    }

    public void act()
    {
        moveGoblin();
        animateGoblin();
        
        if(isTouching(Elora.class)){
            Elora elora = (Elora) getOneIntersectingObject(Elora.class);
            if (elora != null) {
                setImage(image4);
                elora.takeDamage(damage, this);
            }
        }
    }

    private void moveGoblin()
    {
        if (movingRight) {
            setLocation(getX() + stepSize, getY());
            stepsTaken++;
            if (stepsTaken >= maxSteps) {
                movingRight = false; 
            }
        } else {
            setLocation(getX() - stepSize, getY());
            stepsTaken--;
            if (stepsTaken <= 0) {
                movingRight = true;
            }
        }
    }

    private void animateGoblin()
    {
        animationDelay++;
        if (animationDelay >= 10) 
        {
            if (getImage() == image1) {
                setImage(image2);
            } else if (getImage() == image2) {
                setImage(image3);
            } else {
                setImage(image1);
            }

            getImage().scale(100, 120); 
            animationDelay = 0;
        }
    }
    
    private void dropHeal(){
        ExtraLife extralife = new ExtraLife();
        getWorld().addObject(extralife, getX(), getY());
    }
    
    public void takeDamage(int amount){
        health -= amount;
        if (health <= 0) {
            dropHeal();
            getWorld().removeObject(this);
            
        }
    }


}
