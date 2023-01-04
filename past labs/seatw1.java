import java.util.jar.Attributes.Name;
import java.util.Arrays;

class Student {
    String Sname;
    int Sscore; 


    Student(String name, int score)
    {
        this.Sname = name; 
        this.Sscore = score; 

    }
    public String toString()
    {
        return this.Sname + " " + this.Sscore; 
    }

}
public class seatw1 {
    public static void main(String[] args) {
        String[] NameArray = {"Jan", "Jen", "Jin", "Jon", "Jun"}; 
        int[] ScoreArray = {90, 96, 91, 97, 99};
        Student[] StudentArray =  new Student[5]; 

        for (int i = 0; i < 5; i++) {
            StudentArray[i] = new Student(NameArray[i],ScoreArray[i]); 
            System.out.println(StudentArray[i]);
        }
        System.out.println(Arrays.toString(StudentArray));


    }
}