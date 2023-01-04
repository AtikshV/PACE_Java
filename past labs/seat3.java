import java.util.Scanner;
class Password {
    String passwd = ("test123"); 

    public boolean comparePWD(String pass) {
        if (pass.equals(passwd)) 
        {
            return true; 
        }
        else 
        {
            return false; 
        }
    }
}
public class seat3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Password comp = new Password();
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter your password: ");
            String pss = sc.nextLine(); 
            boolean yn = comp.comparePWD(pss); 
            if(yn)
            {
                System.out.println("You got the password in " + i + " tries");
            }
        }
        
        sc.close();
       


    }
    
}
