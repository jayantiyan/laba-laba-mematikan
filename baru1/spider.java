import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class spider here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class spider extends Actor
{
    /**
     * Act - do whatever the spider wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int x = getX();
        int y = getY();
        setLocation (x,y + 1);
        
        if (getY() ==499)    //untuk spider dapat turun kebawah
        {
            setLocation(getX(),0);
        }
    }    
}
