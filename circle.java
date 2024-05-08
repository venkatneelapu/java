import javax.swing.*;
import java.awt.*;

public class CircleDrawing extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Set the color of the circle
        g.setColor(Color.RED);
        // Draw the circle
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        int radius = 50; // Change the radius as needed
        g.fillOval(centerX - radius, centerY - radius, 2 * radius, 2 * radius);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Circle Drawing");
        CircleDrawing circleDrawing = new CircleDrawing();
        frame.add(circleDrawing);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
