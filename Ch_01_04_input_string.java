
import java.util.Scanner;
public class Ch_01_04_input_string {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name :");
        // String str = sc.next(); ----> input only a word
        // If you want to take full line as a input then use (sc.nextLine();) 
        String str = sc.nextLine();
        System.out.print("Your name is ");
        System.out.println(str);

        
        sc.close();

    }
}
