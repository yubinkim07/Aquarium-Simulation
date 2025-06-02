import java.util.Random;

/**
 * Fish class for user to add and observe in tank
 * @author Yubin Kim
 * @version 1.0.0
 */
public class Fish {
    private String name;
    private int locX;
    private int locY;

    /**
     * Constructor to create a new Fish object
     * @param name the fish's name
     * @param locX the X-coordinate
     * @param locY the Y-coordinate
     */
    public Fish(String name) {
        this.name = name;
        move();
    }

    /**
     * Returns name of Fish
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name of Fish
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Moves the location of fish
     */
    public void move() {
        int max = 10;
        int min = -10;
        locX += (int) (Math.random() * (max - min + 1) + min);
        locY += (int) (Math.random() * (max - min + 1) + min);

        if (locX > 10) {
            locX = 10;
        }
        else if (locX < -10) {
            locX = -10;
        }
        if (locY > 10) {
            locY = 10;
        }
        else if (locY < -10) {
            locY = -10;
        }
    }

    /**
     * Returns the X-coordinate of Fish
     * @return locX
     */
    public int getLocX() {
        return locX;
    }

    /**
     * Returns the Y-coordinate of Fish
     * @return locY
     */
    public int getLocY() {
        return locY;
    }
}