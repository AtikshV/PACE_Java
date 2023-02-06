import java.util.ArrayList;

public class seat5 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Character>> calc = new ArrayList<ArrayList<Character>>(); 
        calc.add(new ArrayList<Character>()); 
        calc.get(0).add('7'); 
        calc.get(0).add('8'); 
        calc.get(0).add('9'); 
        calc.get(0).add('/'); 
        calc.get(1).add('4'); 
        calc.get(1).add('5'); 
        calc.get(1).add('6'); 
        calc.get(1).add('*'); 
        calc.get(2).add('1'); 
        calc.get(2).add('2'); 
        calc.get(2).add('3'); 
        calc.get(2).add('-'); 
        calc.get(3).add('0'); 
        calc.get(3).add('.'); 
        calc.get(3).add('='); 
        calc.get(3).add('+'); 


        Character[][] tictac = new Character[3][3]; 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(tictac[i][j]);
                
            }
        }

        int[][] scores = new int[12][5]; 
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 5; j++) {
                
                
            }
            
        }
        System.out.println(scores);
// hello there





    }
}
