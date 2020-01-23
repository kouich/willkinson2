import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class MyWorld extends World
{
    oishi o1;
    oishi2 o2;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        o1 = new oishi();
        o2 = new oishi2();
        addObject( o1, 500, 200 );
        addObject( o2, 100, 200 );
        
        Random rnd = new Random();
        for( int i = 0;i < 10;i++)
        {
            int xValue = rnd.nextInt(600);
            int yValue = rnd.nextInt(400);
            Actor e = new esa();
            e.getImage().scale( 50, 50);
            addObject( e, xValue, yValue );
        }
    }
    
    public void act()
    {
        int score = o1.ReturnScore();
           int score2 = o2.ReturnScore2();
        showText("score  "+ String.valueOf(score),400,10);
          showText("score  "+ String.valueOf(score2),200,10);
    }
    
}



