package bankapp;
import java.util.Scanner;
public class bankApp {
    public static void main(String[] args) {
        new swingGUI(); 

        bankAccount account; 

        account = new bankAccount(); 


        System.out.println("Input amount to deposit: ");
        Scanner sc = new Scanner(System.in); 
        int amount = sc.nextInt();         
        account.deposit(amount); 
        System.out.println("Balance is: " + account.getBalance());

        System.out.println("Input amount to withdraw: ");
        int depAmount = sc.nextInt(); 


        account.withdraw(depAmount); 


        System.out.println("Balance is: " + account.getBalance());

        sc.close();

        int a = 150000; 
        int b = a; 
        a += 300000; 
        int c = b;
        bankAccount x = new bankAccount(); 
        x.deposit(150000);
        bankAccount y = x; 
        x.deposit(300000);
        long z = y.getBalance();
        System.out.println(c);
        System.out.println(z);


    }
    
}
