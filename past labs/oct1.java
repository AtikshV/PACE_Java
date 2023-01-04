// package oct1;  // you need to modify this to ICS3UGLabEx3<yourname>
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import javax.swing.JOptionPane;
 
public class oct1 {    // you need to modify this to ICS3UGLabEx3<yourname>
 
 
   public static void main(String[] args) {
       
       System.out.println("Getting User Input using Scanner class");
       int a;
       float b;
       String s;
       Scanner in = new Scanner(System.in);
       System.out.println ("Enter a string: ");
       s = in.nextLine();
       System.out.println("You entered string "+s);
       System.out.println("Enter an integer: ");
       a = in.nextInt();
       System.out.println("You entered integer "+a);
       System.out.println("Enter a float: ");
       b = in.nextFloat();
       System.out.println("You entered float "+b); 
       in.close(); 
       
       System.out.println("Getting User Input using BufferedReader class");
       String Name;      
       InputStreamReader ir = new InputStreamReader(System.in);  
       BufferedReader br = new BufferedReader(ir);
       System.out.println (" Enter your name ");
       try{
           Name = br.readLine();
           System.out.println(" Hi " + Name);
   
       } catch(IOException e){}  
       
        Name = "";
        Name = JOptionPane.showInputDialog("this is box"); 
        String msg = "Hello " + Name + "!"; 
        JOptionPane.showMessageDialog(null, msg); 
 
   }  
}
 
 

