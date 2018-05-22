import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Latar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Latar extends World
{

    /**
     * Constructor for objects of class Latar.
     * 
     */
    Counter skor = new Counter ("Skor : ");
    public void tambahNilai()
    {
        skor.tambah(1);
    }
    
    
    public void selesai()
    {
        addObject(new Papanskor(skor.nilaiAkhir()), 450,250);
        Greenfoot.stop();
    }
    
    public void menang()
    {
        addObject (new Papanskor(skor.nilaiAkhir()),152,100);
    }
    
    public Latar()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 500, 1); 
        setPaintOrder(Counter.class, Baby.class, Roti.class);
          
        addObject(new Baby(), 200,250);
        addObject(new Roti(),700,30);
        addObject(new Spider(),500,30);
        addObject(skor,80,400);
    }
    
    public void act()
    
    {
        
        if(Greenfoot.getRandomNumber(100) < 2) {
            addObject(new Roti(), Greenfoot.getRandomNumber(700), 10); 
        }
        if(Greenfoot.getRandomNumber(700) < 1) {
            addObject(new Spider(), Greenfoot.getRandomNumber(500), 10);
        }
          
    }
}
