package bankapp; 
import javax.swing.*;
public class bankAccount {
    private int balance; 

    public bankAccount (int dep) {
        balance=dep; 
        
    }

    public bankAccount() {

    }

    public int getBalance() {
        return balance; 
    }

    public void deposit(int amount) {
        balance += amount; 
    }

    public void withdraw(int amount) {
        balance -= amount;  
    }
    
}




