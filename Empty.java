import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Empty here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Empty extends Actor
{
    /**
     * Act - do whatever the Empty wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(this.getNeighbours(1, true, Cell.class).size() == 3) {
            MyWorld w;
            w = (MyWorld) getWorld();
            w.future[this.getX()][this.getY()] = 1;
        }
    }
}
