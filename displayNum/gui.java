package displayNum;

import javax.swing.*;
import com.formdev.flatlaf.FlatLightLaf;

import java.awt.Color;
import java.awt.event.*;

public class gui {

    JFrame f; 
    public static void main(String[] args) {
    }
    gui(int num) {

        f = new JFrame(); 

        String data0[][] = {
            {"", "-----", ""}, 
            {"       |", "", "|"},
            {"       |", "", "|"},
            {"", "", ""},
            {"       |", "", "|"},
            {"       |", "", "|"},
            {"", "-----", ""}
        };

        String data1[][] = {
            {"", "", "|"}, 
            {"", "", "|"},
            {"", "", "|"},
            {"", "", ""},
            {"", "", "|"},
            {"", "", "|"},
            {"", "", "|"}
        };

        String data2[][] = {
            {"", "-----", ""}, 
            {"       ", "", "|"},
            {"       ", "", "|"},
            {"", "-----", ""},
            {"       |", "", ""},
            {"       |", "", ""},
            {"", "-----", ""}
        };

        String data3[][] = {
            {"", "-----", ""}, 
            {"       ", "", "|"},
            {"       ", "", "|"},
            {"", "-----", ""},
            {"       ", "", "|"},
            {"       ", "", "|"},
            {"", "-----", ""}
        };
        String data4[][] = {
            {"", "", ""}, 
            {"       |", "", "|"},
            {"       |", "", "|"},
            {"", "-----", ""},
            {"       ", "", "|"},
            {"       ", "", "|"},
            {"", "", ""}
        };

        String data5[][] = {
            {"", "-----", ""}, 
            {"       |", "", ""},
            {"       |", "", ""},
            {"", "-----", ""},
            {"       ", "", "|"},
            {"       ", "", "|"},
            {"", "-----", ""}
        };

        String data6[][] = {
            {"", "-----", ""}, 
            {"       |", "", ""},
            {"       |", "", ""},
            {"", "-----", ""},
            {"       |", "", "|"},
            {"       |", "", "|"},
            {"", "-----", ""}
        };

        String data7[][] = {
            {"", "-----", ""}, 
            {"       ", "", "|"},
            {"       ", "", "|"},
            {"", "", ""},
            {"       ", "", "|"},
            {"       ", "", "|"},
            {"", "", ""}
        };

        String data8[][] = {
            {"", "-----", ""}, 
            {"       |", "", "|"},
            {"       |", "", "|"},
            {"", "-----", ""},
            {"       |", "", "|"},
            {"       |", "", "|"},
            {"", "-----", ""}
        };

        String data9[][] = {
            {"", "-----", ""}, 
            {"       |", "", "|"},
            {"       |", "", "|"},
            {"", "-----", ""},
            {"       ", "", "|"},
            {"       ", "", "|"},
            {"", "-----", ""}
        };

        String[][] data; 

        switch (num) {
            case 1:
                data = data1; 
                break;
            case 2:
                data = data2; 
                break;               
           case 3:
                data = data3; 
                break;
           case 4:
                data = data4; 
                break;
           case 5:
                data = data5; 
                break;
           case 6:
                data = data6; 
                break;
           case 7:
                data = data7; 
                break;
           case 8:
                data = data8; 
                break;
           case 9:
                data = data9; 
                break;
            case 0:
                data = data0; 
                break;
            default:
                data = data1; 
                break;
        }
        

        
        String[] columnNames = { "Name", "Roll Number", "Department" };


        JTable j = new JTable(data, columnNames);
        j.setBounds(30, 40, 30, 300);
        f.add(j); 

        f.setSize(120, 200); 
        f.setVisible(true);
    
        // f = new JFrame(); 
        // f.getContentPane().setBackground(Color.black);

        // f.setTitle("Test");
        // int row = 100; 
        // int col = 100;


        // int imgPxl[][] = new int[row][col]; 


        

        // f.setSize(400, 500);
        // f.setLayout(null);
        // f.setVisible(true);
        // try {
        //     UIManager.setLookAndFeel(new FlatLightLaf());
        // } catch( Exception ex ) {
        //     System.err.println( "Failed to initialize theme. Using fallback." );
        // }





    }
}