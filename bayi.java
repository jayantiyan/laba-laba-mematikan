import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Baby here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Baby extends Actor
{
    /**
     * Act - do whatever the Baby wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseMoved(null)) {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            setLocation(mouse.getX(), mouse.getY());
        }
        
        // Pop
        if(Greenfoot.mouseClicked(null)) {
            int x = -getImage().getWidth()/2;
            int y = getImage().getHeight()/2;
            Roti Roti = (Roti) getOneObjectAtOffset(x , y, Roti.class);
            if(Roti != null) {
            ((Latar) getWorld()).tambahNilai();
            Greenfoot.playSound("pop.wav");
            getWorld().removeObject(Roti);
            return;
            }
        }
       
        Roti a= (Roti)getOneIntersectingObject(Roti.class);
        if (a!=null)
        {
            ((Latar) getWorld()).tambahNilai();
            Greenfoot.playSound("pop.wav");
            getWorld().removeObject(a);
            return;
        }     
        
        Spider Spider=(Spider)getOneIntersectingObject(Spider.class);
        if(Spider !=null)
        {

            setImage("skull.png");
            setRotation(0);
            Greenfoot.playSound("buzz.wav");
            getWorld().removeObject(Spider);
            Greenfoot.stop();
            ((Latar) getWorld()).selesai();
        }
       
    }    
}
