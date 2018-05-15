import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class spider here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class spider extends benda
{
    /**
     * Act - do whatever the spider wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         setLocation(getX(), getY()+5);
       meledak();
    }public void meledak() //method meledak
    {
         if (canSee(spider.class)) //bila melihat kelas kereta
         {
             ((counter)getWorld().getObjects(counter.class).get(0)).counting(-1); //kelas Count dikurangi sebanyak 1 poin
             Greenfoot.playSound("bomb.wav"); //Mainkan sound boom.wav
         }
         
         if (atWorldEdge())  //bila objek berada di bawah world
         {
             getWorld().removeObject(this); //remove object
         }
    }
}