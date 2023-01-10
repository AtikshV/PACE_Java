package bankapp;
import javax.swing.*;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.event.*;




public class swingGUI {
    public static void main(String[] args) {
        new swingGUI(); 
    }
    JFrame f; 
    String temp; 
    JButton b; 
    JTextField t1; 
    JButton c; 
    JButton w; 
    JButton d; 
    String accountName; 

    swingGUI() {
        //:TODO the ability to create multiple accounts and select one of them with a dropdown 
        f = new JFrame(); 
        bankAccount account = new bankAccount(); 


        f.setTitle("JBA Online Banking");

        JLabel l = new JLabel("Welconme to JBA Online Banking");
        l.setBounds(50, 50, 300, 40); 

        JButton n = new JButton("New Account"); 
        n.setBounds(50, 100, 120, 40);
        d = new JButton("Deposit"); 
        d.setBounds(50, 150, 120, 40);
        c = new JButton("Check Balance"); 
        c.setBounds(180, 100, 120, 40);
        w = new JButton("Withdraw");
        w.setBounds(180, 150, 120, 40);

        JLabel label = new JLabel();
        label.setBounds(50, 400, 300, 40);

        t1 = new JTextField(""); 
        t1.setBounds(130, 300, 100, 40);
        b = new JButton("Submit"); 
        b.setBounds(130, 350, 100, 40);

        JComboBox<String> jBox = new JComboBox<String>();
        jBox.setBounds(300, 50, 010, 010);;
        
       
        f.add(n);
        f.add(d);
        f.add(w);
        f.add(c);
        f.add(label); 
        f.add(l); 
        f.add(b); 
        f.add(t1); 
        f.add(jBox); 
        
        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);

        b.setVisible(false);
        t1.setVisible(false);
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize theme. Using fallback." );
        }

        //new account
        d.setVisible(false);
        c.setVisible(false);
        w.setVisible(false);

        n.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Please enter a name for your account. ");
                b.setVisible(true);
                t1.setVisible(true);
                temp = "new"; 
        
            }
        }); 

        //deposit 

        d.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Enter an amount to deposit in \"" + accountName + "\".");
                temp = "d"; 
                b.setVisible(true);
                t1.setVisible(true);
            }
        });

        //withdraw
        w.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Enter an amount to withdraw from \"" + accountName + "\".");
                temp = "w"; 
                b.setVisible(true);
                t1.setVisible(true);
            }
        });

        //check balance
        c.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                account.getBalance();
                label.setText("Your balance in \" " + accountName + " \" is: $" + account.getBalance());
                
            }
        });

        //submit button 
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {

                    if(temp.equals("d")) {
                        account.deposit(Integer.parseInt(t1.getText()));
                    } else if(temp.equals("w")) {
                        account.withdraw(Integer.parseInt(t1.getText()));
                    } else if(temp.equals("new")) {
                        d.setVisible(true);
                        c.setVisible(true);
                        w.setVisible(true);
                        accountName = t1.getText(); 
                    }
                    b.setVisible(false);
                    t1.setVisible(false);                        
                } catch (Exception ex) {
                    label.setText("Error");
                    // TODO: handle exception
                }
                t1.setText(null);
            }
        });

    }

    
}
