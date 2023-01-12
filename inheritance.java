class Person {
    public String name; 
    int age; 

    // public void setName(String n ) {
    //     name = n;
    // }

    // public void setAge(int a) {
    //     age = a; 
    // }

    public Person () {

    }

    public Person(String n) {
        this.name = n;
    }

    public Person(int a) {
        this.age = a; 
    }

    public void show() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        // System.out.println("Birthday: " + bday); 

    }


}

class Student {
    String name; 
    int age; 
    int IDnum; 

    public void setIDnum(int i) {
     IDnum = i;    
    }
}

public class inheritance {
    public static void main(String[] args) {
        Person P = new Person();
        P.show(); 
        // System.out.println("Name: " + P.name);
        // System.out.println("Age: " + P.age);
        // System.out.println("Birthday: " + bday); 

        

    }
}
