import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class a here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class a extends Actor
{
    /**
     * Act - do whatever the a wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if( Greenfoot.isKeyDown( "right" ) ){
        setRotation(0);
        move(1);
        }
// Add your action code here.
    }    
}
