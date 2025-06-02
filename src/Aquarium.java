import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * An aquarium that can add, review, and observe fish.
 * @author Yubin Kim
 * @version 1.0.0
 */
public class Aquarium {
    //Arraylist to list all fish
    ArrayList<Fish> fishList = new ArrayList<Fish>();
//    private int sizeX = 200;
//    private int sizeY = 100;

    /**
     * Main program for user input
     * @param args
     */
    public void main(String[] args) {

        System.out.println("Welcome to Aquarium!");
        //addBasicFishes();
        //Asking what user wants to do
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Would you like to add or observe the fish? (A/O) - E to Exit");
            String action = input.nextLine();

            //Adding a fish
            if (action.equals("A")) {
                System.out.println("Would you like to add a regular or pink fish? (REG/PINK)");
                String type = input.nextLine();

                //Fish adding... (REG/PINK)
                if (type.equals("REG")) {
                    System.out.println("Enter name of fish: ");
                    String name = input.nextLine();
                    addRegFish(name);
                    System.out.println("Fish " + name + " has been added.");
                    System.out.println("Current Fishes in Aquarium: " + Arrays.toString(getFishNames()));
                }
                else if (type.equals("PINK")) {
                    System.out.println("Enter name of fish: ");
                    String name = input.nextLine();
                    addPinkFish(name);
                    System.out.println("Pink Fish " + name + " has been added.");
                    System.out.println("Current Fishes in Aquarium: " + Arrays.toString(getFishNames()));
                }
                else {
                    System.out.println("Invalid input!");
                }

            //Observing fish tank
            } else if (action.equals("O")) {
                for (Fish f : fishList) {
                    f.move();
                }
                printTank();
                try {
                    new AquariumImage(fishList);
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            //Exiting the program
            } else if (action.equals("E")) {
                System.out.println("Thank you for visiting!");
                break;
            }
            else {
                System.out.println("Invalid input!");
            }
        }
    }

    /**
     * Creates testing fishes
     */
    private void addBasicFishes() {
        addRegFish("Jae");
        addPinkFish("Jaime");
        addRegFish("Shane");
        addPinkFish("Yubin");
    }

    /**
     * Prints the coordinates of each fish
     */
    public void printTank() {
        for (Fish f : fishList) {
            System.out.println(f.getName() + ": (" + f.getLocX() + ", " + f.getLocY() + ")");
        }
    }

    /**
     * Returns a list of all fish names
     * @return fish names
     */
    public String[] getFishNames() {
        String[] fishNames = new String[fishList.size()];
        for (int i = 0; i < fishList.size(); i++) {
            fishNames[i] = fishList.get(i).getName();
        }
        return fishNames;
    }

    /**
     * Adding a Fish to the fishList
     * @param name
     */
    public void addRegFish(String name) {
        fishList.add(new Fish(name));
    }

    /**
     * Adding a Pink Fish to the fishList
     * @param name
     */
    public void addPinkFish(String name) {
        fishList.add(new PinkFish(name));
    }

}