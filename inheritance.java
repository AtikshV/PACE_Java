class Person {
    public String name; 
    int age; 

    public void setName(String n ) {
        name = n;
    }

     void setAge(int a) {
        age = a; 
    }

}

public class inheritance {
    public static void main(String[] args) {
        Person P = new Person(); 
        P.setName("Niknok"); 
        P.setAge(0);
        System.out.println("Name: " + P.name);
        System.out.println("Age: " + P.age);
        // System.out.println("Birthday: " + bday); 

        

    }
}
