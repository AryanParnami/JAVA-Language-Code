import java.util.Scanner;
public class Ch_05_02_Do_while_loops {
    public static void main(String[]args){
        // int i = 1;
        // do {
        //     System.out.println(i);
        //     i++;
        // } while (i<=10);
        /*****************Quick Quiz************************/
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the limit of natural number you want to print : ");
        int n = sc.nextInt();
        int a = 1;
        do {
            System.out.println(a);
            a++;
        } while (a<=n);



        sc.close();
    }
}
