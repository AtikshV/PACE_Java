import java.awt.*;
import javax.swing.*;

public class CanvasOutput extends JFrame {

  public CanvasOutput() {
    setSize(400, 400);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Canvas Output Example");
    setVisible(true);
  }

  public static void main(String[] args) {
    CanvasOutput canvasOutput = new CanvasOutput();
    canvasOutput.getContentPane().add(new MyCanvas());
  }

  static class MyCanvas extends Canvas {
    public void paint(Graphics g) {
      g.drawString("This is the output from the canvas", 100, 100);
    }
  }
}
