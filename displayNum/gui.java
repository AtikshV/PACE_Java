package displayNum;

import javax.swing.*;
import com.formdev.flatlaf.FlatLightLaf;

import java.awt.Color;
import java.awt.event.*;

public class gui {

    JFrame f; 
    public static void main(String[] args) {
        new gui();
    }
    gui() {
        f = new JFrame(); 
        f.getContentPane().setBackground(Color.black);

        f.setTitle("Test");
        

        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize theme. Using fallback." );
        }





    }
}