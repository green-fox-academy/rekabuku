import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {

    public static void mainDraw(Graphics graphics) {
        // draw four different size and color rectangles.
        // avoid code duplication.
        int x = 0;
        int y = 0;
        int c = 0;
        int z = 0;
        for (int i = 0; i < 5; i++) {
            colorSet(graphics, c);
            c = c + 40;
            createRects(graphics, x, y, z);
            x = 30 * i;
            y = 30 * i;
            z = z + 1;

        }
    }

    private static void createRects(Graphics graphics, int x, int y, int z) {

        graphics.fillRect(x, y, 10 * z, 10 * z);
    }

    private static void colorSet(Graphics graphics, int c) {

        graphics.setColor(new Color(c, c + 20, c + 40));
    }

    //    Don't touch the code below
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