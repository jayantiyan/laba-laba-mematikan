import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class counter extends Actor
{
    /**
     * Act - do whatever the counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   private int totalCount = 0; // Counter default awal = 0
    public void act() 
    {
       gameOver(); //method gameOver
    }
    
    public counter() //kelas counter
    {
         setImage(new GreenfootImage("0", 30, Color.WHITE, Color.BLACK)); //membuat tampilan counter dengan ukuran awal 30, tulisan warna putih, backgroun hitam
    }
    public void counting (int hitung) // method counting
    {
         totalCount += hitung;
         setImage(new GreenfootImage("" + totalCount, 30, Color.WHITE, Color.BLACK)); //membuat tampilan perubahan counter dengan ukuran awal 30, tulisan warna putih, backgroun hitam
    }
    public void gameOver() //method gameOver
    {
         if (totalCount >= 100) //bila totalcount >= 50
         {
             Greenfoot.stop();  // stop permainan
             Greenfoot.playSound("hore.wav"); //mainkan sound hore.wav
             System.out.println("CONGRATULATION WON! Click RESET to play again"); //tampilkan tulisan ini
         }
    }
}
