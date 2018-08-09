import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.


        Color[] colors = {Color.blue, Color.yellow, Color.red, Color.green, Color.cyan, Color.magenta, Color.pink};
        int z = 320;

        for (int i = 0; i < 7; i++) {
            rainbow(graphics, z, colors[i]);
            z = z - 40;

        }


    }

    private static void rainbow(Graphics graphics, int z, Color color) {

        graphics.fillRect(WIDTH/2 - z/2, HEIGHT/2 - z/2, z, z);
        graphics.setColor(color);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}