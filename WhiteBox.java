import java.awt.Color;
import java.awt.Graphics;
import java.text.CollationElementIterator;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.AttributeSet.ColorAttribute;

public class WhiteBox {
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setBackground(Color.black);
    frame.setSize(300, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panel = new JPanel() {
      @Override
      protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.white);
        g.fillRect(50, 50, 30, 30);
      }
    };
    panel.setBackground(Color.black);

    frame.add(panel);
    frame.setVisible(true);
  }
}
