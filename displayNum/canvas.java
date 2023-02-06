package displayNum;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container; 
import java.awt.Image;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import javax.imageio.ImageIO;
import java.lang.Object;
import java.awt.Component;
import java.awt.event.ActionListener;

import javax.swing.*;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JPanel;




import javax.swing.*;
import javax.swing.JFrame;


import java.awt.event.*;
import java.awt.Graphics; 




class myFrame extends JFrame implements MouseListener, MouseMotionListener{ 

    //create canvas 
    Canvas c; 
    JFrame f; 

    JPanel p;
    Graphics g;
    BufferedImage image;
    Graphics g2;





    //constructor 
    myFrame() {
        super("canvas"); 

        
        image = new BufferedImage(400, 300, BufferedImage.TYPE_INT_RGB);

        g2 = image.createGraphics();

        //empty canvas 
        c = new Canvas();
        //c.paint(g2);
        // {
        //     public void paint(Graphics g2) 
        //     {
        //         g=g2;
        //         // g.setColor(Color.RED);
        //         // g.fillOval(20, 20, 50, 50);
        //         // super.paint(g);

        //         // g.drawString("atiksh", EXIT_ON_CLOSE, DISPOSE_ON_CLOSE);
        //     }
        // }; 

        //set background 
        c.setBackground(Color.black);

        //adding mouse listener 
        c.addMouseListener(this);
        c.addMouseMotionListener(this);

        c.setSize(getPreferredSize());

        

        add(c); 
        setSize(400, 300);
        // show();  
        // setVisible(true);
        
        // f = new JFrame(); 

        JButton submit = new JButton("Save"); 
        submit.setBounds(50, 100, 120, 40);

        JButton clear = new JButton("clear"); 
        



        p = new JPanel(); 
        p.setLayout(new BorderLayout());
        p.add(c, BorderLayout.CENTER);
        p.add(submit, BorderLayout.SOUTH);

        add(p);
        pack();
        setSize(400, 300);
        setVisible(true); 
    


        
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("JHey");

                

                //c.paint(g2);
                //g2.dispose();

                try {
                    ImageIO.write(image, "png", new File("output.png"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

        
            }
        }); 

        //TODO: Add clear button to repaint




    }
    public void mouseClicked(MouseEvent e) {

    
        Graphics g = c.getGraphics();
 
        g.setColor(Color.magenta);
        g2.setColor(Color.magenta);
 
        // get X and y position
        int x, y;
        x = e.getX();
        y = e.getY();
 
        // draw a Oval at the point
        // where mouse is moved
        g.fillOval(x, y, 5, 5);
        g2.fillOval(x, y, 5, 5);

        // c.paint(g);


    }

    public void mouseMoved(MouseEvent e) {

    }

    public void mouseDragged(MouseEvent e) {
    
        Graphics g = c.getGraphics();
 
        g.setColor(Color.magenta);
        g2.setColor(Color.magenta);

 
        // get X and y position
        int x, y;
        x = e.getX();
        y = e.getY();
 
        // draw a Oval at the point where mouse is moved
        g.fillOval(x, y, 7, 7);
        g2.fillOval(x, y, 7, 7);

        // c.paint(g);





    }

    public void mouseExited(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {
        
    }

    public void mouseReleased(MouseEvent e) {
        
    }

    public void mousePressed(MouseEvent e) {
        
    }

    public static void main(String[] args) {
        myFrame c = new myFrame(); 

    }


    


}
