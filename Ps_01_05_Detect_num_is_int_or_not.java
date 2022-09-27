import java.util.Scanner;
public class Ps_01_05_Detect_num_is_int_or_not {
    public static void main(String args[]){
        System.out.println("Enter any number : ");
        Scanner sc = new Scanner(System.in);
        // boolean b1 = sc.hasNextInt();
        // System.out.println(b1);
        System.out.println(sc.hasNextInt());  //Without Declaration 

        sc.close();
        
    }    
}
