
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class oishi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class oishi2 extends Actor
{
    public int b = 0;
    /**
     * Act - do whatever the oishi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {   
        
        Actor actor = getOneObjectAtOffset( 0, 0, esa.class );
        if( actor != null ){
        //count++;
        }   
       
        int x = getX();
        int y = getY();
        if( Greenfoot.isKeyDown( "a" ) ){
          setLocation( x-10,y );
         }
        if( Greenfoot.isKeyDown( "d" ) ){
         setLocation( x+10,y );
        }
        if( Greenfoot.isKeyDown( "s" ) ){
          setLocation( x,y+10 );
         }
        if( Greenfoot.isKeyDown( "w" ) ){
         setLocation( x,y-10 );
        }
        if (Greenfoot.isKeyDown( "Z" ) ){
            b+=30;
            setRotation(b);
        }

    }    
}

