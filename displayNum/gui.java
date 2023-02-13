package displayNum;

import javax.swing.*;
import com.formdev.flatlaf.FlatLightLaf;

import java.awt.Color;
import java.awt.event.*;
import java.awt.Graphics;




public class gui {

    JFrame f; 
    public static void main(String[] args) {
        new gui();
    }
    gui() {
        f = new JFrame(); 
        f.getContentPane().setBackground(Color.black);

        f.setTitle("Test");
        // int row = 4; 
        int col = 2;


        
        Boolean grid[][] = {{true, true, true},
                            {true, false, true},                      
                            {true, false, true}, 
                            {true, false, true}, 
                            {true, true, true,}};
       
                            
                            
        
        
        
        // if(imgPxl[0][0] == true) {

        // }

        for (Boolean[] row : grid) {
            for (Boolean pixel : row) {
                if (pixel) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        

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