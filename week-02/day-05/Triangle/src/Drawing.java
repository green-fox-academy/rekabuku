import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void mainDraw(Graphics graphics) {

        drawTriangleLines(graphics, 10, 200, 10, 20);

    }
        public static void drawTriangleLines (Graphics g, int x, int y, int num, int size){
        for (int i = 0; i < 10; i++) {
            drawTriangleRow(g, x, y, size, num);
            num--;
            x += (size / 2);
            y -= size;
        }

    }

    public static void drawTriangle(Graphics g, int x, int y, int size) {
        g.drawLine(x, y, x + size, y);
        g.drawLine(x, y, x + (size / 2), y - size);
        g.drawLine(x + (size / 2), y - size, x + size, y);
    }

    public static void drawTriangleRow(Graphics g, int x, int y, int size, int num) {
        for (int i = 0; i < num; i++) {
            drawTriangle(g, x, y, size);
            x += size;
        }

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