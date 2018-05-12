import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int jeda=100;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    
    
    public void act(){
        if(jeda==0){
            addObject(new spider(), getWidth()/2,getHeight()/8);
            jeda=400;
}
else {
    jeda--;
}
if(jeda==0){
    addObject(new bread(), getWidth()/3,getHeight()/5);
    jeda=200;
}
else {
    jeda--;
}
}
}
