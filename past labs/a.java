import java.util.ArrayList;
public class a {
    public static void main(String[] args) {
        ArrayList<String> NameList = new ArrayList<String>(); 
        NameList.add("Luke"); 
        NameList.add("Leia"); 
        NameList.add("Han"); 
        NameList.add("Rey"); 


        for(int i=0; i < NameList.size(); i++) {
            System.out.println(NameList.get(i));
        }

        System.out.println(NameList);

        NameList.add("Kylo"); 
        NameList.add("Yoda"); 

        System.out.println(NameList);

        NameList.remove("Luke"); 
        System.out.println(NameList);

        NameList.remove(0); 
        System.out.println(NameList);

        NameList.set(3, "Obi-Wan"); 
        System.out.println(NameList);

        for (String str : NameList) {
            System.out.println(str);
        }

    }
}