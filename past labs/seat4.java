class coin {
    public boolean flip() {
        int toss = (int)(Math.random()*2)+1; 

        if(toss == 1)
        {
            return true; 
        }
        else 
        {
            return false; 
        }
    }
}
public class seat4 {
    public static void main(String[] args) {
        int heads = 0; 
        int tails = 0; 
        coin c = new coin();  

        for (int i = 0; i < 6; i++) {
            boolean flip = c.flip();
            if (flip)
            {
                heads++; 
            }
            else
            {
                tails++; 
            }
        }

        if(heads>tails)
        {
            System.out.println("You won!");
        }
        else if (heads<tails )
        {
            System.out.println("You lose!");
        }
        else
        {
            System.out.println("Tie!");
        }
        System.out.println("You got heads " + heads + " times!");
        System.out.println("You got tails " + tails + " times!");




    }
    
}
