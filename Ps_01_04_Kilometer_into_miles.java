import java.util.Scanner;
public class Ps_01_04_Kilometer_into_miles {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length in Kilometers :");
        double kilo = sc.nextDouble();
        double miles = kilo/1.609;
        System.out.print("The length in miles is ");
        System.out.println(miles);



        
        sc.close();

    }
}
