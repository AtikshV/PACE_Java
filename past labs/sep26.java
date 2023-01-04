class Student {
    String IDNum;
    String Name;
    int age;

    public void showStudentData() {
        System.out.println("ID Number: " + IDNum);
        System.out.println("Name: " + Name);
        System.out.println("Age: " + age);
    }
}

class class1 {
    int hello1; 
    int hello2; 
    String hello3; 

    public void helloM() {
        System.out.println("1st: " + hello1);
        System.out.println("2nd: " + hello2);
        System.out.println("3rd: " + hello3);

    }
}
public class sep26{

    public static void main(String[] args) {
        
        Student S1 = new Student();

        S1.IDNum = "1A";
        S1.Name = "Yuujiro";
        S1.age = 16;

        S1.showStudentData();
        
        Student S2 = new Student();

        S2.IDNum = "9B";
        S2.Name = "Jim";
        S2.age = 57;

        S2.showStudentData();



        class1 h = new class1(); 
        h.hello1 = 5; 
        h.hello2 = 9; 
        h.hello3 = "hello";

        h.helloM();
    }
}