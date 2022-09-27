public class Ch_05_04_break {
    public static void main(String [] args){
        // Break in loops
        System.out.println("**** for loop ****");
        for(int i = 0; i < 5; i++){
            System.out.println(i);
            System.out.println("loop is running");
            if(i==3){
            System.out.println("Breaking the loop\n\n");
            break;

            } 
        }
        System.out.println("**** while loop ****");
        int a = 0;
        while(a<5){
            System.out.println(a);
            System.out.println("loop is running");
            if(a==3){
            System.out.println("Breaking the loop\n\n");
            break;
                    }
            a++;
            
        } 
        System.out.println("**** do-while loop ****");
        int b = 0;
        do{
            System.out.println(b);
            System.out.println("loop is running");
            if(b==3){
            System.out.println("Breaking the loop");
            break;
                    }
            b++;
            
        }while(b<5);


        System.out.println("Loop ends here ");
        

    }
}
