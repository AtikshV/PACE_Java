import java.util.Scanner;


public class calc {

    public static void main(String[] args) {
        System.out.println("This is a calculator");
        float a; 
        float b; 
        String op; 
        float ans = 1; 
        Scanner in = new Scanner(System.in); 
        System.out.println("Enter your first float: ");
        a = in.nextFloat(); 
        System.out.println("Enter your operation(+, -, *, /): ");
        op = in.next();
        System.out.println("Enter your second float: ");
        b = in.nextFloat(); 
        System.out.println("-" + op + "-");

        if (op.equals("+")) {
            System.out.println("Calculating " + a + " + " + b);
            ans = a + b; 
        } else if (op.equals("-")) {
            System.out.println("Calculating " + a + " - " + b);
            ans = a-b; 
        } else if (op.equals("*")) {
            System.out.println("Calculating " + a + " * " + b); 
            ans = a*b; 
        } else if (op.equals("/")) {
            System.out.println("Calculating " + a + " / " + b);
            ans = a/b; 

        } else {
            System.out.println("Try again.");
            System.exit(1);
        }

        System.out.println("Your answer is: " + ans);
        in.close();

    }
}
