import java.util.Scanner;
public class Ps_04_05_leep_year {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the year : ");
        int year = sc.nextInt();
        if(year%4 == 0 && year%100!=0 || year%400 == 0){
            System.out.print("Given year is Leep Year!");

        }
        else{
            System.out.print("Given year is not a Leep Year!");

        }
        sc.close();
    }    
}
