class num1 {
    int memField = 0;

    public void memMethod() {

    }
}

public class testWritten {
    public static void main(String[] args) {
        // int ifVar=2;
        // if (ifVar > 1)
        // {
        // System.out.println("2>1");
        // }
        // else
        // {
        // System.out.println("2<1");
        // }
        // Book b = new Book ();

        // int x = 1;
        // while (x <= 10) {
        // System.out.println(x*x);
        // x++;

        // }

        // for (int i=1; i <= 10; i++)
        // {
        // System.out.println(i*i);
        // }

        // int sum1 = 0;
        // int j1 = 1;
        // do {
        // sum1 = sum1+ j1;
        // j1++;

        // }while (j1<=5);

        // System.out.println(sum1);
        // System.out.println(j1);

        for (int j = 1, sum = 0; j <= 5; j++) {
            sum = sum + j;

            // }

            // int response = 5;
            // if (response == 1)
            // System.out.println("Excellent");
            // else if (response == 2)
            // System.out.println("Good");
            // else if (response == 3)
            // System.out.println("Fair");
            // else if (response == 4)
            // System.out.println("Poor");

            int response = 1;
            switch (response) {
                case 1:
                    System.out.println("Excellent");
                    break;
                case 2:
                    System.out.println("Good");
                    break;
                case 3:
                    System.out.println("Fair");
                    break;
                case 4:
                    System.out.println("Poor");
                    break;
                default:
                    break;
            }

        }
    }
}