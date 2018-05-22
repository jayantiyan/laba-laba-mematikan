import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Roti here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Roti extends Actor
{
    /**
     * Act - do whatever the Roti wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        int x = getX();
        int y = getY();
        setLocation(x, y + 1);
        
        if (getY() ==499)
        {
            setLocation(getX(),0);
        }
        
        setLocation(getX(),getY() +1);
        if (getY() == 450){
            ((Latar) getWorld()).selesai();
            Greenfoot.playSound("buzz.wav");
        }
    }    
}
