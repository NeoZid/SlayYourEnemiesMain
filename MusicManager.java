import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MusicManager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MusicManager extends Actor
{
    private static GreenfootSound currentTrack = null;
    public static void play(String filename) {
        // Stop current music if any
        if (currentTrack != null) {
            currentTrack.stop();
        }

        // Start new music
        currentTrack = new GreenfootSound(filename);
        currentTrack.playLoop();
    }

    public static void stop() {
        if (currentTrack != null) {
            currentTrack.stop();
        }
    }
}
