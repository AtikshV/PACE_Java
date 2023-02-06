
import java.lang.Object;
import java.awt.Component;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container; 
import java.awt.Image; 
import java.awt.image.BufferedImage; 
import java.awt.Graphics2D; 

import javax.swing.*;


import java.awt.event.*;
import java.awt.Graphics; 




class canvas extends JFrame implements MouseListener, MouseMotionListener{ 

    //create canvas 
    JPanel c; 
    JFrame frame; 
  



    //constructor 
    canvas() {
        super("canvas"); 

        //empty canvas 
        c = new JPanel() {
            public void paint(Graphics g) {

            }
        }; 


        //set background 
        c.setBackground(Color.black);

        //adding mouse listener 
        c.addMouseListener(this);
        c.addMouseMotionListener(this);

        add(c); 
        setSize(400, 300);
        // show();  
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e) {

    
        Graphics g = c.getGraphics();
 
        g.setColor(Color.BLACK);
 
        // get X and y position
        int x, y;
        x = e.getX();
        y = e.getY();
 
        // draw a Oval at the point
        // where mouse is moved
        g.fillOval(x, y, 5, 5);
    }

    public void mouseMoved(MouseEvent e) {

    }

    public void mouseDragged(MouseEvent e) {
    
        Graphics g = c.getGraphics();
 
        g.setColor(Color.BLACK);
 
        // get X and y position
        int x, y;
        x = e.getX();
        y = e.getY();
 
        // draw a Oval at the point where mouse is moved
        g.fillOval(x, y, 10, 10);
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
        canvas c = new canvas(); 
        

    }


    


}
