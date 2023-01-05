package bankapp;
import javax.swing.*;
import javax.swing.LookAndFeel;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.event.*;




public class swingGUI {
    JFrame f; 

    swingGUI() {
        f = new JFrame(); 
        FlatLightLaf.setup(); 


        f.setTitle("JBA Online Banking");

        JLabel l = new JLabel("Welconme to JBA Online Banking");
        l.setBounds(50, 50, 300, 40); 
        f.add(l); 

        JButton n = new JButton("New Account"); 
        n.setBounds(50, 100, 120, 40);
        JButton d = new JButton("Deposit"); 
        d.setBounds(50, 150, 120, 40);
        JButton w = new JButton("Withdraw"); 
        w.setBounds(180, 100, 120, 40);
        JButton c = new JButton("Check Balance");
        c.setBounds(180, 150, 120, 40);

        f.add(n);
        f.add(d);
        f.add(w);
        f.add(c);


        JTextField t1 = new JTextField("Enter amount"); 
        t1.setBounds(130, 300, 100, 40);
        JButton b = new JButton("Submit"); 
        b.setBounds(130, 350, 100, 40);
        
       

        b.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
                t1.setText("Amount accepted");
            } 
          } );
        
        f.add(t1); 
        f.add(b);

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
