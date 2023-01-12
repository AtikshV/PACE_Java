
import java.awt.*;
import javax.swing.*;

public class Foodams extends JFrame {
    //Foodams extends JFrame which makes it a subclass of JFrame
    
    Foodams(){ //constructor 
        
        setTitle("Food Delivery"); 
        
        JLabel LName = new JLabel("Name");
        JLabel LPhone = new JLabel("Phone");
        JLabel LAddress = new JLabel ("Address");
        
        JTextField TName = new JTextField (30);
        JTextField TPhone = new JTextField (30);
        JTextField TAddress = new JTextField (30);
        
        JLabel LSize = new JLabel ("Size");
        JRadioButton RBSmall = new JRadioButton("Small");
        JRadioButton RBMedium = new JRadioButton("Medium");
        JRadioButton RBLarge = new JRadioButton("Large");
        
        JLabel LStyle = new JLabel ("Style");
        JRadioButton RBThin = new JRadioButton("Thin");
        JRadioButton RBThick = new JRadioButton("Thick");
   
        JLabel LTopppings = new JLabel ("Toppings");
        JCheckBox CPepperoni = new JCheckBox("Pepperoni");
        JCheckBox CMushrooms = new JCheckBox("Mushrooms");
        JCheckBox CBacon = new JCheckBox("Bacon");
            
        JButton JBOk = new JButton ("OK");
        JButton JBClear = new JButton ("Clear");
        
        
        // to add a menu bar, add the menu items to the menu then 
        // add the menu to the menubar the set the menu bar for the frame
        // using the setJMenuBar method
        
        JMenu menu = new JMenu("Menu");
        JMenuBar mb = new JMenuBar();
        JMenuItem ItemPizza, ItemBurger, ItemFries;
        ItemPizza = new JMenuItem("Pizza");
        ItemBurger = new JMenuItem("Burger");
        ItemFries = new JMenuItem("Fries");
        menu.add(ItemPizza);
        menu.add(ItemBurger);
        menu.add(ItemFries);
        setJMenuBar(mb);
        
        
        // Panels are also containers that can be used to group components
        // and to design their layout on the frame
        
        JPanel JPTop = new JPanel();
        JPanel JPCenter = new JPanel();
        
        setLocationRelativeTo(null); // this will make the frame appear on the center of the screen
        setSize(600,500);  // set the size of the frame

        setLayout(new BorderLayout());  // you can also try other layouts that will work for your design 
                                                  
        LName.setBounds(100, 20, 100, 30);
        TName.setBounds(200, 20, 300, 30);
        LPhone.setBounds(100, 60, 100, 30);
        TPhone.setBounds(200, 60, 300, 30);
        LAddress.setBounds(100, 100, 100, 30);
        TAddress.setBounds(200, 100, 300, 30);       
      
        // these three labels and three textfields are added to the JPTop Panel
        JPTop.setLayout(null);
        JPTop.setBounds(20, 10, 500, 150);
        JPTop.add(LName);
        JPTop.add(TName);
        JPTop.add(LPhone);
        JPTop.add(TPhone);
        JPTop.add(LAddress);
        JPTop.add(TAddress);
        
        add(JPTop); // add the JPTOP panel to the frame
                     
        // set up the center panel
        // the radio buttons, checkboxes, and buttons can be added to theJPCenter panel
        JPCenter.setLayout(null);
        JPCenter.setBounds(50, 200, 500, 200);
 
        LSize.setBounds(60,210,100,30);
        JPCenter.add(LSize);

        LStyle.setBounds(195,210,100,30);
        JPCenter.add(LStyle);

        LTopppings.setBounds(350,210,100,30);
        JPCenter.add(LTopppings);
        CPepperoni.setBounds(350, 250, 100, 30);
        CMushrooms.setBounds(350, 280, 100, 30);
        CBacon.setBounds(350, 310, 100, 30);
        JPCenter.add(CPepperoni);
        JPCenter.add(CMushrooms);
        JPCenter.add(CBacon);

        JBOk.setBounds(195, 350, 100, 30);
        JBClear.setBounds(300, 350, 100, 30);
        JPCenter.add(JBOk); 
        JPCenter.add(JBClear); 



        
        ButtonGroup bg = new ButtonGroup(); // Radio buttons need to belong 
                        // to a Button Group to implement single selection
        
        RBSmall.setBounds(65, 250, 100, 30);
        RBMedium.setBounds(65, 280, 100, 30);
        RBLarge.setBounds(65, 310, 100, 30);
        bg.add(RBSmall); bg.add(RBMedium); bg.add(RBLarge);
       
        JPCenter.add(RBSmall);
        JPCenter.add(RBMedium);
        JPCenter.add(RBLarge);
        
        ButtonGroup bg2 = new ButtonGroup(); // Radio buttons need to belong 
                        // to a Button Group to implement single selection
        
        RBThin.setBounds(195, 250, 100, 30);
        RBThick.setBounds(195, 280, 100, 30);
        bg2.add(RBThin); bg2.add(RBThick); 
       
        JPCenter.add(RBThick);
        JPCenter.add(RBThin);
        
        add(JPCenter); // add the JPCenter panel the frame
        
        setVisible(true);//making the frame visible
    }    
    
    
    public static void main(String[] args) {
        Foodams FD = new Foodams();
    }

}
