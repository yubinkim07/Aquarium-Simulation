import static org.junit.jupiter.api.Assertions.*;

/**
 * Testing the Aquarium with test fishes
 * @author Yubin Kim
 * @version 1.0.0
 */
class AquariumTest {
    @org.junit.jupiter.api.Test

    /**
     * Creates test fishes and printing tank
     */
    public void createAquarium() {
        Aquarium aquarium = new Aquarium();

        aquarium.addRegFish("A");
        aquarium.addPinkFish("B");
        aquarium.addRegFish("C");
        aquarium.addPinkFish("D");

        aquarium.printTank();
    }

    /**
     * Adding a Fish
     */
    @org.junit.jupiter.api.Test
    void addRegFish() {
    }

    /**
     * Adding a Pink Fish
     */
    @org.junit.jupiter.api.Test
    void addPinkFish() {
    }
}