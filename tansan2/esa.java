import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class esa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class esa extends Actor
{
    /**
     * Act - do whatever the esa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Actor actor = getOneObjectAtOffset( 0, 0, oishi.class );
                if( actor != null )
                {
                    getWorld().removeObject( this ); // getWorld() は World オブジェクトの getter                
                }
    }    
}
