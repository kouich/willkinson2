import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int count=0;
   
  
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject( new oishi(), 300, 200 );
         
        //int score = 100;
        //showText("score = "+ score,300,10);
           addObject( new oishi(), 300, 200 );
         
           addObject( new esa(), 550, 200 );
           addObject( new esa(), 50, 200 );
           addObject( new esa(), 330, 550 );
           addObject( new esa(), 300, 25 );
           addObject( new esa(), 200, 100 );
        

    }
    
}



