import java.util.Scanner;
public class Ps_06_02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number : ");
        int num = sc.nextInt();

        int [] marks = {34,56,7,67,78};
        boolean isAnArray = false;
        for (int element : marks) {
            if(num==element){
                isAnArray = true;
                break;
            }
        }
     if(isAnArray){
        System.out.println("This number is present in an array");
    }
    else{
        System.out.println("This number is not present in an array");

    }
    sc.close();
 }
}
