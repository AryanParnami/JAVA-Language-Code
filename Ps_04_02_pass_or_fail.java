import java.util.Scanner;
public class Ps_04_02_pass_or_fail {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Maths marks : ");
        float a = sc.nextFloat();
        System.out.println("Enter your Physics marks : ");
        float b = sc.nextFloat();
        System.out.println("Enter your Chemistry marks : ");
        float c = sc.nextFloat();

        float TotalMarks = (float)(a + b + c)/3;
        if (TotalMarks >= 40 && a >= 33 &&  b >= 33 && c >= 33) {

            System.out.println("Your are Pass!! ");
        }
        else{
            System.out.println("Your are Fail!! ");

        }
       

        sc.close();
    }
    
}
