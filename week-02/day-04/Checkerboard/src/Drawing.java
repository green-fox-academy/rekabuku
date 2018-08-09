import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.

        int x = 0;
        int y = 0;
        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 8; j++) {
                if (j % 2 == 0 && i % 2 == 0){
                    graphics.setColor(Color.black);
                    drawSquare(graphics, x, y);

                }else if (j % 2 != 0 && i % 2 != 0) {
                    graphics.setColor(Color.black);
                    drawSquare(graphics, x, y);
                }
                else {
                    graphics.setColor(Color.white);
                    drawSquare(graphics, x, y);
                }
                x = x + 40;

            }
            x = 0;
            y = y + 40;

        }

    }

    private static void drawSquare(Graphics graphics, int x, int y) {
        graphics.fillRect(x, y, 40, 40);
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