import java.util.Scanner;
public class Ps_01_03_Enter_name_and_greet_them {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your name : ");
        String name = sc.nextLine();
        System.out.printf("Hello " + name +" have a good day!");
      



        sc.close();

    }
    
}
