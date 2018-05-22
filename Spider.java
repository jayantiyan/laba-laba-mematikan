import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spider here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spider extends Actor
{
    /**
     * Act - do whatever the Spider wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        int x = getX();
        int y = getY();
        setLocation (x, y + 1);
        
        if (getY() ==499)
        {
            setLocation(getX(),0);
        }
        
        
        Baby b= (Baby)getOneIntersectingObject(Baby.class);
        if (b!=null)
        {
            setImage ("skull.png");
            Greenfoot.playSound("buzz.wav");
            getWorld().removeObject(b);
            return;
        }
    }    
}
