<<<<<<< HEAD
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bayi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bayi extends benda
{
    /**
     * Act - do whatever the bayi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       {
        moveBayi(); //method moveBayi
        objectDisappear(); //method objectDisappear
    }
}

public void objectDisappear() //method objectDisappear
{
    if (canSee(bread.class)) //bila melihat kelas objek bread
    {
        eat(bread.class); //eat kelas objek bread
        ((counter)getWorld().getObjects(counter.class).get(0)).counting(10); // kelas counter ditambah sebanyak 10 poin
        Greenfoot.playSound("score.wav"); //mainkan sound score.wav
    }
}

public void moveBayi() //method moveBayi
{
    if (Greenfoot.isKeyDown("left")) // //bila arah panah ke kiri ditekan
    {
        move(-7); //bergerak ke -7
    }
    if (Greenfoot.isKeyDown("right")) //bila arah panah ke kanan ditekan
    {
        move(7); //bergerak ke 7
    }
 }
}
=======
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
>>>>>>> 12c46465580a784905a0c32258745412599af511
