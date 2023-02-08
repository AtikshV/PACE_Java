import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LightUpGrid extends JPanel {
    private static int width = 100;
    private static int height = 100;
    private int[][] imagePixels = new int[height][width];

    public LightUpGrid() {
        // fill the grid with a default color
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                imagePixels[row][col] = Color.WHITE.getRGB();
            }
        }

        // light up some pixels
        imagePixels[50][50] = Color.RED.getRGB();
        imagePixels[51][51] = Color.RED.getRGB();
        imagePixels[52][52] = Color.RED.getRGB();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // draw the grid of pixels
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                g.setColor(new Color(imagePixels[row][col]));
                g.fillRect(col, row, 1, 1);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new LightUpGrid());
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
