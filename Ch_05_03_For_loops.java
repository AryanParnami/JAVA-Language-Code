import java.util.Scanner;
public class Ch_05_03_For_loops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // for(int i=1; i<=10; i++){
        //     System.out.println(i);
        // }
        /***********************Quick Quiz********************/
        // first n odd numbers
        System.out.println("Please enetr limit of odd numbers you want to print : ");
        int n = sc.nextInt();
        System.out.println("****************");
        for(int a=0; a<n; a++ ){
            System.out.println(2*a + 1);
        }
        sc.close();
    }
    
}
