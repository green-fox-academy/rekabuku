import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void mainDraw(Graphics graphics) {
        int x = 10;
        int y = 200;
        int num = 10;
        graphics.drawLine(x, y, x + num, y - 2*num);
        graphics.drawLine(x + num, y - 2*num, x + 3*num, y - 2*num);
        graphics.drawLine(x + 3*num, y - 2*num, x + 4*num, y);
        graphics.drawLine(x, y, x + num, y + 2*num);
        graphics.drawLine(x + num, y + 2*num, x + 3*num, y + 2*num);
        graphics.drawLine(x + 3*num, y + 2*num, x + 4*num, y);


        // drawHexagon(graphics, 10, 200);
    }

    public static void drawHexagon(Graphics graphics, int x, int y) {
        graphics.drawLine(x, y, x + 5, y - 10);
        graphics.drawLine(x + 5, y - 10, x + 15, y - 10);
        graphics.drawLine(x + 15, y - 10, x + 20, y);
        graphics.drawLine(x, y, x + 5, y + 10);
        graphics.drawLine(x + 5, y + 10, x + 15, y + 10);
        graphics.drawLine(x - 15, y + 10, x + 20, y);
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