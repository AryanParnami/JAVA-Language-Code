public class Ch_02_02_Op_Pre {
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        int a = 6*5-34/2;
        /*
          = 30-34/2
          = 30-17
          = 13
         */
        int b = 60/5-34*2;
        /* 
        Highest precedence goes to * and /. 
        They are then evaluated on the basis of left to right associativity
          = 12 - 34*2
          = 12 - 68
          = -56
        */
        System.out.println(a);
        System.out.println(b);

        // Precedence & Associativity

        // Associativity is from LEFT TO RIGHT


    } 
    
}
