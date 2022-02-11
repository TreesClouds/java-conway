import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    private static int worldWidth = 100;
    private static int worldHeight = 100;
    
    public static int[][] future;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(worldWidth,worldHeight, 5); 
        this.addObject(new Cell(), 1, 5);
        this.addObject(new Cell(), 1, 6);
        this.addObject(new Cell(), 2, 5);
        this.addObject(new Cell(), 2, 6);
        this.addObject(new Cell(), 11, 5);
        this.addObject(new Cell(), 11, 6);
        this.addObject(new Cell(), 11, 7);
        this.addObject(new Cell(), 12, 4);
        this.addObject(new Cell(), 12, 8);
        this.addObject(new Cell(), 13, 3);
        this.addObject(new Cell(), 13, 9);
        this.addObject(new Cell(), 14, 3);
        this.addObject(new Cell(), 14, 9);
        this.addObject(new Cell(), 15, 6);
        this.addObject(new Cell(), 16, 4);
        this.addObject(new Cell(), 16, 8);
        this.addObject(new Cell(), 17, 5);
        this.addObject(new Cell(), 17, 6);
        this.addObject(new Cell(), 17, 7);
        this.addObject(new Cell(), 18, 6);
        this.addObject(new Cell(), 21, 3);
        this.addObject(new Cell(), 21, 4);
        this.addObject(new Cell(), 21, 5);
        this.addObject(new Cell(), 22, 3);
        this.addObject(new Cell(), 22, 4);
        this.addObject(new Cell(), 22, 5);
        this.addObject(new Cell(), 23, 2);
        this.addObject(new Cell(), 23, 6);
        this.addObject(new Cell(), 25, 1);
        this.addObject(new Cell(), 25, 2);
        this.addObject(new Cell(), 25, 6);
        this.addObject(new Cell(), 25, 7);
        this.addObject(new Cell(), 35, 3);
        this.addObject(new Cell(), 35, 4);
        this.addObject(new Cell(), 36, 3);
        this.addObject(new Cell(), 36, 4);
        
        this.randomize();
        
        future = new int[worldWidth][worldHeight];
        for (int x = 0; x < this.getWidth(); x++) {
            for (int y = 0; y < this.getHeight(); y++) {
                if (this.getObjectsAt(x, y, Cell.class).isEmpty()) {
                    this.addObject(new Empty(), x, y);
                    future[x][y] = 0;
                } else {
                    future[x][y] = 1;
                }
            }
        }
    }
    
    public void act() {
        removeObjects(getObjects(null));
        for (int x = 0; x < this.getWidth(); x++) {
            for (int y = 0; y < this.getHeight(); y++) {
                if (future[x][y] == 0) {
                    addObject(new Empty(), x, y);
                } else {
                    addObject(new Cell(), x, y);
                }
            }
        }
    }
    
    public void randomize() {
        removeObjects(getObjects(null));
        for (int x = 0; x < this.getWidth(); x++) {
            for (int y = 0; y < this.getHeight(); y++) {
                double rn = Math.random();
                if (rn > 0.5) {
                    addObject(new Empty(), x, y);
                } else {
                    addObject(new Cell(), x, y);
                }
            }
        }
    }
}
