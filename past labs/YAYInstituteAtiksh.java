
import java.util.Scanner;// correct this code

class Applicant {
    
    int EntranceTestScore;// declare variable for Entrance Test Score
    double GWA9, GWA10, GWA11, GWA12;// declare variables for 4 GWAS
    double GPA; // declare variable for GPA
    double TotalScore; // give the data type for TotalScore
    
    public void getScores(){
        Scanner sc = new Scanner(System.in); // correct this code
        System.out.println("Enter Entrance Test Score: ");
        EntranceTestScore = sc.nextInt(); // correct this line
        System.out.println("Enter Grade 9 General Weighed Average: ");
        GWA9 = sc.nextDouble();
        System.out.println("Enter Grade 10 General Weighed Average: ");    
        GWA10 = sc.nextDouble();
        System.out.println("Enter Grade 11 General Weighed Average: ");     
        GWA11 = sc.nextDouble();
        System.out.println("Enter Grade 12 General Weighed Average: ");    
        GWA12 = sc.nextDouble();
        sc.close();
    }
    
    public boolean isStudentAccepted(){   
        GPA = (GWA9+GWA10+GWA11+GWA12)/4; // compute for the average of the four GWAs                
        TotalScore = ((EntranceTestScore*60) + (GPA*40))/100; //compute the TotalScore   
        return TotalScore >= 90;        
    }
}         


public class YAYInstituteAtiksh {

    public static void main(String[] args) {
        Applicant A = new Applicant();
        
        A.getScores(); //call the method to get inputs
        if (A.isStudentAccepted())
            System.out.println("Accepted");
        else
            System.out.println("Not Accepted");
    }    
}
