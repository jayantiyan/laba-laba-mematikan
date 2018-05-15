import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class taman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class taman extends World
{

    /**
     * Constructor for objects of class taman.
     * 
     */
    public taman()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        breadjatuh();
        siap();
        spiderjatuh();
        prepare();
    }
    
    public void act() //method act
    {
        if (getObjects(spider.class).isEmpty()) breadjatuh();
        if (getObjects(spider.class).isEmpty()) spiderjatuh();
    }
    
    private void siap() //method prepare untuk menentukan posisi dari kelas objek masing-masing
    {
        bayi bayi = new bayi();
        addObject(bayi, 648, 403);
        counter counter = new counter();
        addObject(counter, 57, 69);
        nilai nilai = new nilai();
        addObject(nilai, 64, 44);
        nilai.setLocation(59, 44);
        bayi.setLocation(373, 403);
    }
    
    public void breadjatuh()
    {
        if(Greenfoot.getRandomNumber(2) < 50)
        {
            addObject(new bread(), Greenfoot.getRandomNumber(519),20);
        }
    }
    
    public void spiderjatuh()
    {
        if(Greenfoot.getRandomNumber(2) < 50)
        {
            addObject(new spider(), Greenfoot.getRandomNumber(519),21);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}