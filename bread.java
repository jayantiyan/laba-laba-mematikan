import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bread here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bread extends Actor
{
    /**
     * Act - do whatever the bread wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(),getY()+1);
    }    
}