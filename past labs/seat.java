class test {
    
    int a = 1;
    int b = 2; 
    public String method1() {
        return "this is method1 "; 
    }
    
    public String method2() {
        return "this is method2"; 
    }
}
public class seat {
    public static void main(String[] args) {
        
        test test = new test(); 
        String method1 = test.method1(); 
        String method2 = test.method2(); 

        System.out.println(method1);
        System.out.println(method2);
        System.out.println(test.a);
        System.out.println(test.b);




    
    }
    
}


