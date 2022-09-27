
import java.util.Scanner;

public class Ch_01_03_Input {
    public static void main(String args[]) {
        System.out.println("Taking input from user");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
       // int a = sc.nextInt();
        float a = sc.nextFloat();
        System.out.println("Enter number 2");
       // int b = sc.nextInt();
       float b = sc.nextFloat();
        // int sum = a + b;
        // int sub = a - b;
        float sum = a + b;
        float sub = a - b;

        System.out.print("The sum of these number is : ");
        System.out.println(sum);
        System.out.print("The substraction of the number is :");
        System.out.println(sub);
 /******************************************************************************************************/

        boolean b1 = sc.hasNextInt();
        System.out.println(b1);

        sc.close();
        
    }

}
