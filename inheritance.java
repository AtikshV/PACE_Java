

class Person {
    public String name; 
    private int age; 

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int a) {
        age = a; 
    }

    public int getAge() {
        return this.age;
    }
    

}

class Student12 extends Person {
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + getAge());
    }

}


public class inheritance {
    public static void main(String[] args) {
        Student12 s = new Student12(); 
        s.setName("hello");
        s.setAge(10);
        s.display();
    }
}
