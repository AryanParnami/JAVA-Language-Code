import java.util.Scanner;
public class Ch_04_04_switch_case {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your age : ");
        int age = sc.nextInt();   
        
        switch (age) {
            case 18:
                System.out.println("You are going to become Adult!");
                break;
            case 23:
                System.out.println("You are going to join a Job!");
                break;
            case 60:
                System.out.println("You are going to Retired!");
                break;
            default:
            System.out.println("Enjoy your life! ");

        }
        // Inhance Switch we don't need break in this 
        String var = "aman";

        switch (var){
            case "Ram" ->       System.out.println("You are going to join a Job!");
                
            case "himanshu" ->  System.out.println("You are going to join a Job!");
            
            case "aman" ->      System.out.println("You are going to Retired!");
            default ->          System.out.println("Enjoy your life! ");
    
        }
        sc.close();
    }
    
}
