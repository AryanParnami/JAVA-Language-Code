import java.util.Scanner;
public class Ps_04_04_switch_weekdays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number between 1 to 7 :");
        int day = sc.nextInt();
        switch (day) {
            case 1 -> System.out.print("Monday");
            case 2 -> System.out.print("Tuesday");
            case 3 -> System.out.print("Wednesday");
            case 4 -> System.out.print("Thursday");
            case 5 -> System.out.print("Friday");
            case 6 -> System.out.print("Saturday");
            case 7 -> System.out.print("Sunday");
              
        }
        sc.close();

    }
    
}
