import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void mainDraw(Graphics graphics) {
        // Draw a box that has different colored lines on each edge.
        graphics.setColor(Color.red);
        graphics.drawLine(60, 70, 120, 70);
        graphics.setColor(Color.CYAN);
        graphics.drawLine(120,70 ,120 ,130 );
        graphics.setColor(Color.blue);
        graphics.drawLine(60, 130, 120, 130);
        graphics.setColor(Color.black);
        graphics.drawLine(60, 130, 60, 70);


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