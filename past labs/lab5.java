import java.util.Scanner;

class primeNumbers {
    public void displayAllPrime(String num) {
        System.out.println("");//for a space
        boolean flag = true;

        for (int i = 1; i <= Integer.parseInt(num); i++) {
            for (int j = 2; j < i; j++) {
                if(i % j == 0 && flag == true) {
                    flag = false; 
                }
            }
            if (flag) {
                System.out.println(i);
            }
            flag = true; 
        }

    }
}

class squareDesign {
    public void printSquare(String dim) {

        System.out.println("");//for a space

        for (int i = 0; i < Integer.parseInt(dim); i++) {
            for (int j = 0; j < Integer.parseInt(dim); j++) {
                System.out.print("@ ");
            }
            System.out.println("");//each line of square
        }
        System.out.println(" ");
    }
}

class triangleDesign {
    public void printTriangle(String trDim) {


        for (int i = 1; i <= Integer.parseInt(trDim); i++) {
            for (int j = 1; j <= Integer.parseInt(trDim)-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("@ ");
            }
            System.out.println("");
        }
    }
}

public class lab5 {
    public static void main(String[] args) {
        primeNumbers pn = new primeNumbers(); 
        squareDesign sd = new squareDesign();
        triangleDesign td = new triangleDesign(); 
        Scanner sc = new Scanner(System.in); 
        System.out.println("This program lists all the prime numbers from 1 to N. Please enter the value of N. ");
        String num = sc.nextLine(); 
        System.out.println("Please enter the dimensions for your square. ");
        String dim = sc.nextLine(); 
        System.out.println("Please enter the dimensions for your triangle. ");
        String trDim = sc.nextLine();
        sc.close(); 
        pn.displayAllPrime(num); 
        sd.printSquare(dim);
        td.printTriangle(trDim);
    }
}