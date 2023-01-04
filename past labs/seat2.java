public class seat2 {
    public static void main(String[] args) {
        System.out.println("by using the equals() method");
        String s1="Aneko";
        String s2="Aneko";
        String s3=new String("Aneko");
        String s4="Anika";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));

        System.out.println("--------------");

        System.out.println("by using the == operator"); 
        s1="Aneko";
        s2="ANEKO";
        System.out.println(s1.equals(s2)); 
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println("---------------------");

        System.out.println("by using the compareTo() method"); 
        s1="Aneko";
        s2= "Aneko";
        s3 = new String("Aneko");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        s3 = new String("Aaron");   
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s3);
        System.out.println(s3.compareTo(s1));
 }
}
