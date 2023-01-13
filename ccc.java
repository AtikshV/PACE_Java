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


    }
}
