import java.util.Arrays;
import java.util.Scanner;


/*ICS3UG 2022 Term 1 CODING Assignment 
Name: Atiksh 
Set: A
*/
class flight {
    public String[] input() {

        String retDate = null;
        Scanner sc = new Scanner(System.in); 

        System.out.println("What is your trip's destination");
        String dest = sc.nextLine(); 

        int way = 4; 

        while (way != 2 && way != 1)
        {
            System.out.println("Is your flight a one-way(1) or two-way(2) flight? ");
            try {
                way = Integer.parseInt(sc.nextLine());     
            } catch (Exception e) {
                // TODO: handle exception
                way = 4; 
            }
        }

        System.out.println("What is your departure date?");
        String depDate = sc.nextLine(); 

        if (way == 2)
        {
            System.out.println("What is your return date?");
            retDate = sc.nextLine(); 
        }


        int line = 9; 
        while (line > 5 || line < 1)
        {
            System.out.println("What airline would you like to take? Air Canada(1), ANA Airlines(2), Qatar Airways(3), Singapore Airlines(4), or Emirates(5)? ");
            try {
                line = Integer.parseInt(sc.nextLine());     
            } catch (Exception e) {
                // TODO: handle exception
                line = 9; 
            }

        }

        

        
        sc.close();

        String[] arr = {dest, Integer.toString(way), depDate, retDate, Integer.toString(line)};
        return arr; 



        


    }

    public void msg(String dest, int way, String depDate, String retDate, int line) {
        String airline = ""; 
        switch (line) {
            case 1:
                airline = "Air Canada"; 
                break;
            case 2: 
                airline = "ANA Airlines"; 
                break; 
            case 3: 
                airline = "Qatar Airways"; 
                break; 
            case 4: 
                airline = "Singapore Airlines"; 
                break; 
            case 5: 
                airline = "Emirates"; 
                break; 
        }
        System.out.println("");
        System.out.println("You have chosen " + airline + " to travel to " + dest + ". Your departure date is on " + depDate + ". "); 
        if (way == 2)
        {
            System.out.print("Your return date is on " + retDate + ". ");
        }
        System.out.print("Click the next button to see the flight options and price details. ");

        
    }
}

class Triangle {
    public void printTr() {
        int n=5; 
        System.out.println("");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
}


public class test {
    public static void main(String[] args) {

        flight fl = new flight(); 
        Triangle tr = new Triangle();

        String data[] = fl.input();
        System.out.println("");

        fl.msg(data[0], Integer.parseInt(data[1]), data[2], data[3], Integer.parseInt(data[4]));
        
        tr.printTr();







    }
}
