import java.util.Scanner;
public class Ps_01_01_sum_of_three_numbers {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three numbers :");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float sum = a + b + c;
        System.out.println(sum);



        sc.close();
    }
    
}
