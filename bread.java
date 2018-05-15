import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bread here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bread extends benda
{
    /**
     * Act - do whatever the bread wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer=0;
    public void act() 
    {
        setLocation(getX(), getY()+6); //posisi objek bread, kecepatan bread = +6
        waw(); //lakukan method waw
    } 
    
    public void  waw() //method breadwaw
     {
         if (atWorldEdge()) //jika objek bread berada di bawah world
         {
             getWorld().removeObject(this); // remove objek bread
             Greenfoot.playSound("waw.wav"); // mainkan sound waw.wav
         }
     }
}    
