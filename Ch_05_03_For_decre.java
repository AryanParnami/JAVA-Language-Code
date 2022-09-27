import java.util.Scanner;
public class Ch_05_03_For_decre {
    public static void main(String[] args){
        /*****Program to print n natural number in reverse order********/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit of natural nubmer you want to print : ");
        int n = sc.nextInt();
        System.out.println("***************************");

        for(int i = n; i > 0; i--){
            System.out.println(i);
     
        }
        sc.close();
    }
    
}
