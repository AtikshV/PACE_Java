import java.util.Scanner;
public class lab4 {
    static class NumberChecker {

        public String posNeg(int num) {
            if (num > 0) 
            { 
                return ("Positive");
            } 

            else if (num > 0) 
            {
                return ("Negative"); 
            } 

            else 
            {
                return("Zero"); 
            }

        }

        public String oddEven(int num) {
            if (num % 2 == 0) 
            {
                return ("Even"); 
            }
            else 
            {
                return ("Odd"); 
            }
            
        }

        public String isPrime(int num) {
            for (int i = 2; i < num; i++) 
            {
                if (num % i == 0)
                {
                    i = num; 
                    return ("Not Prime");
                }
                else if (num == 0) 
                {
                    return ("Hum Haw"); 
                }

            }
            return ("Prime"); 
            
        }

        public String day(int day) {
            switch (day) {
                case 1:
                    return("Monday");
                case 2: 
                    return("Tuesday");
                case 3: 
                    return("Wednesday "); 
                case 4: 
                    return("Thursday"); 
                case 5: 
                    return("Friday"); 
                case 6: 
                    return("Saturday"); 
                case 7: 
                    return("Sunday");
                default:
                    return("Hum Haw");
            }
            
        }




    }
    public static void main(String[] args) {

        NumberChecker numChk = new NumberChecker(); 
        Scanner sc = new Scanner(System.in); 


        System.out.println("Enter your number");
        int num = sc.nextInt();
        System.out.println("Enter your day of the week number");
        int day = sc.nextInt();

        sc.close();

        System.out.println("\n" + numChk.posNeg(num)); 
        System.out.println(numChk.oddEven(num));
        System.out.println(numChk.isPrime(num));
        System.out.println(numChk.day(day));

        
        
    }
}
