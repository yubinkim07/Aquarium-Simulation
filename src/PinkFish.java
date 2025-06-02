/**
 * Pink Fish inherited from Fish class
 * @author Yubin Kim
 * @version 1.0.0
 */
public class PinkFish extends Fish {;
    /**
     * Constructor to create a new Fish object
     * @param name the fish's name
     * @param locX the X-coordinate
     * @param locY the Y-coordinate
     */
    public PinkFish(String name) {
        super(name);
    }

    /**
     * Returns the label "Pink" with name of Pink Fish
     * @return "Pink" + name
     */
    @Override
    public String getName() {
        return "Pink " + super.getName();
    }
}