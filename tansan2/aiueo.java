import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class aiueo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class aiueo extends Actor
{
    /**
     * Act - do whatever the aiueo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
            if( Greenfoot.isKeyDown( "left" ) ){
            setRotation(0);
            move(-1);
}// Add your action code here.
    }    
}
