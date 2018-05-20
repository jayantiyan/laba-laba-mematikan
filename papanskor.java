import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Papanskor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Papanskor extends Actor
{
    /**
     * Act - do whatever the Papanskor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static final float besarhuruf = 48.0f;
    public static final int lebar = 500;
    public static int tinggi = 300;
    
    public Papanskor(int skor) 
    {
        // Add your action code here.
        bikinGambar("Game Over","Skor Akhir : ", skor);
    }    
    
    private void bikinGambar(String judul, String depan, int skor)
    {
        GreenfootImage gambar = new GreenfootImage(lebar,tinggi);
        gambar.setColor (new Color (25, 5, 74, 160));
        gambar.fillRect(0,0, lebar-10, tinggi -10);
        Font font = gambar.getFont();
        gambar.setColor(Color.GREEN);
        gambar.drawString(judul,60, 100);
        gambar.drawString(depan+skor,60,200);
        setImage(gambar);
    }
    
    public void act() 
    {
        // Add your action code here.
    }   
}
