import java.util.ArrayList;
import java.util.Scanner;

class Student{
    String Name;
    int Score;
    
    Student(String name, int score) {  // Constructor for assigning initial values to Student object
        this.Name = name;
        this.Score = score;
    }
}

public class h {
    public static void main(String[] args) {

        String[] NameArray = new String[5];
        int[] ScoreArray = new int[5];
        
        System.out.println("Test print to check the inital values of the array elements after being created");
        for (int i=0; i<NameArray.length;i++)
            System.out.println("Name: " + NameArray[i] + " Score: " + ScoreArray[i]);     
        
    // Assign values to each element of the array 
        NameArray[0] = "Luke";
        NameArray[1] = "Leia";
        NameArray[2] = "Han";
        NameArray[3] = "Kylo";
        NameArray[4] = "Rey";
    
    // Assign values to each element of the array 
        ScoreArray[0] = 88;
        ScoreArray[1] = 90;
        ScoreArray[2] = 99;
        ScoreArray[3] = 98;
        ScoreArray[4] = 96;
        
    //Print the elements of arrays NameArray and ScoreArray
        System.out.println("Test print the elements of arrays NameArray and ScoreArray");
        for (int i=0; i<NameArray.length;i++)
            System.out.println("Name: " + NameArray[i] + " Score: " + ScoreArray[i]);    
                    
    // StudentArray is declared as an array of Student objects and instantiated 
    // created to have 5 elements
        Student [] StudentArray = new Student[5];
      
    // Each Student object element is instantiated and the values from the
    // two previously created arrays, NameArray and ScoreArray, are used to initialize the
    // member fields of each Student object
        for (int i=0;i<StudentArray.length;i++)
            StudentArray[i] = new Student(NameArray[i],ScoreArray[i]);    
      
    //Print the fields of each Student Object in StudentArray
        System.out.println("Test print the values of each element of StudentArray");
        for (int i=0; i<StudentArray.length;i++)
            System.out.println("Name: " + StudentArray[i].Name 
                    + " Score: " + StudentArray[i].Score);
      
        
        System.out.println("-------------------------------------------------------------------");   
        System.out.println();
    // ArrayList sample codes below     
        System.out.println("ArrayList sample codes below: ");       
        
    // Declare and create StudentArrayList as an ArrayList of Student objects
        ArrayList <Student> StudentArrayList = new ArrayList<Student>();
      
    // The two previously created arrays, NameArray and ScoreArray, are also used to initialize the
    // member fields of each Student object and is added as element of StudentArrayList
        for (int i=0;i<StudentArray.length;i++)
            StudentArrayList.add(new Student(NameArray[i],ScoreArray[i]));  
        
    //Print the fields of each Student Object in StudentArrayList
        System.out.println("Test print the elements of StudentArrayList");
        for (int i=0; i<StudentArrayList.size();i++){
            System.out.print("Name: " + StudentArrayList.get(i).Name);
            System.out.println(" Score: " + StudentArrayList.get(i).Score);
        }      
       
    //This loop prints the address representation of each Student object element 
    // of StudentArrayList    
        System.out.println("Prints the address representation of each Student object element of StudentArrayList"); 
        for (int i=0; i<StudentArrayList.size();i++){
            System.out.println("Address of  " + StudentArrayList.get(i));        
        }
       
     
        System.out.println("-------------------------------------------------------------------");   
        System.out.println(); 
        
    // Another sample ArrayList but only containing String values
      System.out.println("Another sample ArrayList but only containing String values"); 
        ArrayList<String> NameList = new ArrayList<String>();
        NameList.add("Luke");
        NameList.add("Leia");
        NameList.add("Han");     
        NameList.add("Rey");
  
     
      
    // This displays all the elements of NameList using a regular for loop    
        for (int i = 0; i < NameList.size();i++)
            System.out.println(NameList.get(i));     

          
    // This will display all the elements of the ArrayList (NameList) in one line enclosed 
    // within a pair of square brackets
        System.out.println(NameList);
     
    // This adds a new element to the ArrayList (NameList)
        NameList.add("Kylo");          
        NameList.add("Yoda");
        System.out.println(NameList); 
       
    // This removes the element "Luke" from the ArrayList (NameList)
        NameList.remove("Luke");
        System.out.println(NameList);
    // This removes the element "Leia" now the 0th element from the ArrayList (NameList)    
        NameList.remove(0);
        System.out.println(NameList);
    //This replaces the 4th element with "Obi-Wan"
        NameList.set(3,"Obi-Wan");
        System.out.println(NameList);
    //  This displays all the elements of Name using a for-each loop 
        for (String str : NameList) 
            System.out.println(str);   
    }
}
       
   
