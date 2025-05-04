import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door extends Actor
{
    public Door()
    {
        GreenfootImage image= getImage();
        image.scale(image.getWidth() /3, image.getHeight() /3);
        setImage(image);
    }
    
    
    private boolean isOpen = false;

    public void act()
    {
        if (!isOpen && allGoblinsGone()) {
            openDoor();
        }
        
        if (isOpen && playerTouchesDoor()) {
            goToNextLevel();
        }
    }

    private boolean allGoblinsGone() {
        return getWorld().getObjects(Goblin.class).isEmpty();
    }

    private void openDoor() {
        isOpen = true;
    }
    
    private boolean playerTouchesDoor(){
        return isTouching(Elora.class);
    }

    private void goToNextLevel() {
        World current = getWorld();
        
        if (current instanceof Level1) {
            Greenfoot.setWorld(new Level2());
        } else if (current instanceof Level2) {
            Greenfoot.setWorld(new Level3());
        } else if (current instanceof Level3) {
            Greenfoot.setWorld(new Win());
        }
    }
}
