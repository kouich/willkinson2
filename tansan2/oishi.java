
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class oishi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class oishi extends Actor
{
    /**
     * Act - do whatever the oishi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public int a = 0;
    public int score_add = 0;

  
    
    public void act() 
    {   


        int x = getX();
        int y = getY();
        Actor actor = getOneObjectAtOffset(0, 0, esa.class );

       
        //Actor actor = getOneIntersectingObject( esa.class );

        if( actor != null ){
           score_add = score_add + 1;
           getWorld().removeObject( actor );
        }   
         
        
        if( Greenfoot.isKeyDown( "left" ) ){
          setLocation( x-10,y );
         }
        if( Greenfoot.isKeyDown( "right" ) ){
         setLocation( x+10,y );
        }
        if( Greenfoot.isKeyDown( "down" ) ){
          setLocation( x,y+10 );
         }
        if( Greenfoot.isKeyDown( "up" ) ){
         setLocation( x,y-10 );
        }
        if (Greenfoot.isKeyDown( "M" ) ){
             a+=30;
             setRotation(a);
        }

    }    
    
    public int ReturnScore()
    {
        return score_add;
    }

}
        
