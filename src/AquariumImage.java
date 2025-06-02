import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Pop-up image of the tank with fish
 * @author Yubin Kim
 * @version 1.0.0
 */
public class AquariumImage extends JFrame{

    private final int FRAME_SIZE_X = 800;
    private final int FRAME_SIZE_Y = 600;

//    private JFrame f = new JFrame(); //creates jframe f
    public AquariumImage(ArrayList<Fish> fishList) throws IOException {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(FRAME_SIZE_X, FRAME_SIZE_Y);

        JLayeredPane layeredPane = new JLayeredPane();
        setContentPane(layeredPane);

        // Load images
        ImageIcon backgroundImageIcon = new ImageIcon(Objects.requireNonNull(AquariumImage.class.getResource("/underwater.jpeg")));
        // Create image labels
        JLabel backgroundLabel = new JLabel(backgroundImageIcon);
        // Set bounds
        backgroundLabel.setBounds(0, 0, 800, 600); // Adjust as needed
        // Add to layered pane
        layeredPane.add(backgroundLabel, JLayeredPane.DEFAULT_LAYER);

        //Creates image for each fish in fishList
        for (Fish f : fishList) {

            ImageIcon fishIcon = new ImageIcon(Objects.requireNonNull(AquariumImage.class.getResource("/fish.png")));
            //checking if fish in fishList is pink
            if (f instanceof PinkFish) {
                fishIcon = new ImageIcon(Objects.requireNonNull(AquariumImage.class.getResource("/pinkfish.png")));
            }

            Image fishImage = fishIcon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH); // Resize
            ImageIcon fishImageIcon = new ImageIcon(fishImage);
            JLabel fishImageLabel = new JLabel(fishImageIcon);

            //Create -10 to 10 box for coordinates and make bigger range
            //Add -25 to make sure fish does not go out of bounds
            int actualX = (f.getLocX()+10) * (FRAME_SIZE_X / 20) - 25;
            int actualY = (f.getLocY()+10) * (FRAME_SIZE_Y / 20) - 25;

            fishImageLabel.setBounds(actualX, actualY, 50, 50); // Adjust as needed

            layeredPane.add(fishImageLabel, JLayeredPane.PALETTE_LAYER);
        }
        setVisible(true);
    }
}