import java.util.ArrayList;
import java.util.Scanner;
class Student {
    String Sname; 
    int Snum; 
    Student(String name, int num)
    {
        Sname = name; 
        Snum = num; 
    }
    public String toString() {
        return this.Sname + " " + this.Snum; 
    }
}
public class seatw2 {
    public static void main(String[] args) {
        ArrayList<Student> StudentArrayList = new ArrayList<Student>(); 
        StudentArrayList.add(new Student("Jan", 90)); 
        // StudentArrayList.add(new Student("Jen", 96)); 
        // StudentArrayList.add(new Student("Jin", 91)); 
        // StudentArrayList.add(new Student("Jon", 97)); 
        // StudentArrayList.add(new Student("Jun", 99)); 

        System.out.println(StudentArrayList);
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a name");
        String name = sc.nextLine();
        System.out.println("Enter a number");
        String score = sc.nextLine(); 
        StudentArrayList.add(new Student(name, Integer.parseInt(score))); 
        System.out.println(StudentArrayList);
        sc.close();



    }
    
}
