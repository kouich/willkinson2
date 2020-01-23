import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class esa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class esa extends Actor
{
    int count = 0;
    
    /**
     * Act - do whatever the esa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {   
        getWorld().showText("Score = "+String.valueOf(count),400,10);
        
        
        Actor actor = getOneObjectAtOffset( 0, 0, oishi.class );
          Actor actor2 = getOneObjectAtOffset( 0, 0, oishi2.class );


        if( actor != null || actor2 != null )
        {
            getWorld().removeObject( this ); // getWorld() は World オブジェクトの getter                
        }
        
   
        
        

    }    
}
