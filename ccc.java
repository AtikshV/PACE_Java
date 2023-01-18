import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


import java.io.FileNotFoundException;
public class ccc {
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<String>();  
        try {
            File f = new File("datafile.txt"); 
            Scanner sc = new Scanner(f); 
            while(sc.hasNextLine()) {
                data.add(sc.nextLine());
            }
            sc.close(); 
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR");
            ex.printStackTrace();
        }
        System.out.println(data.get(0));

        ArrayList<ArrayList<String>> grid = new ArrayList<ArrayList<String>>(); 

        for (int i = 0; i < Integer.parseInt(data.get(0)); i++) {
            ArrayList<String> temp = new ArrayList<String>(); 
            grid.add(temp); 
            for (int j = 0; j < Integer.parseInt(data.get(1)); j++) {
                temp.add("B"); 
            }

        }
        
        System.out.println(grid);
        int choices = Integer.parseInt(data.get(2)); 
        System.out.println(choices);

        for (int i = 3; i <= choices+2; i++) {
            String choice = Character.toString(data.get(i).charAt(0));
            System.out.println(choice);
            if(choice.equals("R")) {

                changeRow(Integer.parseInt(data.get(i).substring(1).trim()), grid); 
            } else {
                changeCol(Integer.parseInt(data.get(i).substring(1).trim()), grid); 

            }

        }
        System.out.println(grid);
        int count = 0; 
        for (int i = 0; i < grid.size(); i++) {
            for (int j = 0; j < grid.get(0).size(); j++) {
                if(grid.get(i).get(j).equals("G")) {
                    count++; 
                }
            }
        }
        System.out.println(count);


    }

     public static void changeRow(int rowNum, ArrayList<ArrayList<String>> grid) {
        System.out.println("This is row num: " + rowNum);
        for (int j = 0; j < grid.get(0).size(); j++) {
            String bg = grid.get(rowNum-1).get(j);
            if(bg.equals("B")) {
                grid.get(rowNum-1).set(j, "G");
            } else {
                grid.get(rowNum-1).set(j, "B");
            }
        }

     }

     public static void changeCol(int colNum, ArrayList<ArrayList<String>> grid) {
        System.out.println("This is colNum: " + colNum);
        for (int i = 0; i < grid.size(); i++) {
            String bg = grid.get(i).get(colNum-1); 

            if(bg.equals("B")) {
                grid.get(i).set(colNum-1, "G"); 
            } else {
                grid.get(i).set(colNum-1, "B"); 

            }
        }
        
     }

}
