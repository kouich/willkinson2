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

    int count=0;
    
    Random rnd = new Random();
    int i = 0;
    int xValue = 0;
    int yValue = 0;

    
  //  oishi mimizu = new oishi();
    // public int count=0;
    public int Counter(int score){
        showText("score  "+ String.valueOf(score),400,10);
        return score;
    }
   
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 


        Actor esa = new esa();
        addObject( new oishi(), 500, 200 );
        addObject( new oishi2(), 100, 200 );
        
        addObject( esa, 500, 300 );
        esa.getImage().scale( 50, 50);
               
        int score = 100;
        
        for(i = 0;i < 10;i++)
        {
            xValue = rnd.nextInt(600);
            yValue = rnd.nextInt(400);
            addObject( new esa(), xValue, yValue );
        }
        
        showText("score  "+ String.valueOf(score),400,10);

        //int score = 0;
        //showText("score  "+ String.valueOf(score),400,10);


    }
    
}



