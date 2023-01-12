class Person {
    public String name; 
    protected int age; 

    public void setName(String n ) {
        name = n;
    }

    public void setAge(int a) {
        age = a; 
    }
}

class Student extends Person {
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


public class inheritance {
    public static void main(String[] args) {
        Student s = new Student(); 
        s.display();

    }
}
