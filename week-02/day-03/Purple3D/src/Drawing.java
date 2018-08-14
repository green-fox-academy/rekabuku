import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {

    public static void mainDraw(Graphics graphics) {
        int x = 0;
        int y = 0;
        int z = 10;
        graphics.setColor(new Color(148, 0, 211));
        for (int i = 0; i <= 6; i++) {
            drawRects(graphics, x, y, z);
            x = x + z;
            y = y + z;
            z = z + 10;
        }

    }

    private static void drawRects(Graphics graphics, int x, int y, int z) {
        graphics.fillRect(x, y, z, z);
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