import java.util.Scanner;
public class Ps_01_02_Convert_Marks_into_Percentege {

    public static void main(String args[]){
        // This is for marks out of 100 per subjects(5)
        
       
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of 1st subject :");
        float a = sc.nextFloat();

        System.out.println("Enter the marks of 2nd subject :");
        float b = sc.nextFloat();

        System.out.println("Enter the marks of 3rd subject :");
        float c = sc.nextFloat();
        
        System.out.println("Enter the marks of 4th subject :");
        float d = sc.nextFloat();

        System.out.println("Enter the marks of 5th subject : ");
        float e = sc.nextFloat();

        float TotalNumber = (a+b+c+d+e);
        float Percentage = (TotalNumber)/5;
        System.out.print("Your Percentage is : ");
        System.out.print(Percentage);
        System.out.print("%");


        sc.close();
    }
}
