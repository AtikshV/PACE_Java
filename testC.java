import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class testC {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Canvas with Button Example");
        JButton submitButton = new JButton("Submit");
        CustomCanvas canvas = new CustomCanvas();

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Submit button pressed.");
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(canvas, BorderLayout.CENTER);
        panel.add(submitButton, BorderLayout.SOUTH);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    static class CustomCanvas extends Canvas {
        @Override
        public void paint(Graphics g) {
            
        }
    }
}
