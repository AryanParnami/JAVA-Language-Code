import java.util.Scanner;
public class Ch_04_01_conditionals {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age");
        
        int age = sc.nextInt();
        // boolean cond = (age>18);
        // if(cond){
            if(age>18){
            System.out.println("You can drive");
        }
        else{
            System.out.println("You cann't drive");


            sc.close();
        }
    }

}