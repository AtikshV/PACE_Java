import java.text.ParseException;
import java.util.Arrays;

class arr {
    String[] nameArray = {"Jan", "Jen", "Jin", "Jon", "Jun" }; 
    int[] scoreArray = {90, 96, 91, 97, 99}; 
    public void display() {
        for (int i = 0; i < scoreArray.length; i++) {
            System.out.println(nameArray[i] + " " + scoreArray[i]);
        }

        int max; 
        if(scoreArray[0] > scoreArray[1]) {
            max = 0;
        }
        else {
            max = 1; 
        }
        

        for (int i = 0; i < scoreArray.length; i++) {
            if(scoreArray[max] > scoreArray[i]) {

            }
            else if (scoreArray[max] < scoreArray[i]) {
                max = i; 
            }
        }
        System.out.println("The max score is "  + nameArray[max] + " " + scoreArray[max]);
    }

    public Integer linearSearch(String arg) {
        for (int i = 0; i < nameArray.length; i++) {
            if(nameArray[i].equals(arg)) {
                return i; 
            }
        }
        return null; 
    }

    public int[] bubbleSort(int[] data) {
        int temp; 
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length-1; j++) {
                if(data[j] > data[j+1]) {
                    temp=data[j]; 
                    data[j] = data[j+1]; 
                    data[j+1] = temp; 
                }
            }
        }   
        return data; 
    }
}

public class lab12 {
    public static void main(String[] args) {
        arr arr = new arr(); 
        arr.display();
        Integer lSort = arr.linearSearch("Jon"); 
        System.out.println(lSort);

        
        

    }
}
