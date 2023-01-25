package displayNum;

public class app {
    public static void main(String[] args) {
        int input = 1;
        Boolean[] grid = {true}; 
        grid[0] = true; 
        System.out.println(grid[0]);
    }

}



/*
 canvas.java
    has canvas on gui 
    user draws number 
    number is saved as an image 
    image is sent to python 
    python figures out the number 
    python sends back the number as an int 
    sends int to app.java
app.java 
    gets input as int 
    depending on the numnber, knows what pixels to light up 
    sends data to gui as parameters 
gui.java 
    gets input of what pixels to light up 
    lights up pixels   
 */
