import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bayi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bayi extends Actor
{
    int a=1;//percepatan
    int v=1;//kecepatan
    /**
     * Act - do whatever the bayi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
     //add your action code here.
     setLocation(getX()+1,getY() );
     v+=a;//v=v+a
     
     if(Greenfoot.isKeyDown("right")){
         v=-5;
    }
}
}
