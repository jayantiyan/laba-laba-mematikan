import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class latar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class latar extends MyWorld
{

    /**
     * Constructor for objects of class latar.
     * 
     */
    public latar()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        setPaintOrder(counter.class,bayi.class,bread.class);
        
        addObject(new bayi(),200,250);
        addObject(new bread(),700,30);
        addObject(new spider(),500,30);
        
    
    if(Greenfoot.getRandomNumber(100) < 2){         // untuk bread dapat random/ acak
        addObject(new bread(),
    Greenfoot.getRandomNumber(700),10);
    }
}
}
