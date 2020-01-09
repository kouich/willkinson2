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
    public int count = 0;


    public void act() 
    {   
        
        Actor actor = getOneObjectAtOffset( 0, 0, esa.class );
        if( actor != null ){

                    count++;
                   // MyWorld.Counter(count);

        }   
       
        int x = getX();
        int y = getY();
        
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
        if (Greenfoot.isKeyDown( "space" ) ){
             a+=30;
             setRotation(a);
        }

    }    
   
    }    


