
import java.util.Scanner;

public class Ch_02_01_operators {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any four numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        // int c = sc.nextInt();
        // int d = sc.nextInt();
        // int e = sc.nextInt();

        /************************************************************************************** */
      //  Arithmetic operator
        int c = a + b;
        int d = a - b;
        int e = a % b; // Modulo operator OR remainder operators
        int f = a / b;
        int g = a * b;
        System.out.println("The value of c is " + c + " :");
        System.out.println("The value of d is " + d + " :");
        System.out.println("The value of e is " + e + " :");
        System.out.println("The value of f is " + f + " :");
        System.out.println("The value of g is " + g + " :");


        /*************************************************************************************** */
        // Assignment Operators

        // a += 2; // it will add 2 in value of a
        // b -= 3; // it will subs 3 in value of b
        // c *= 4; // it will multiply 4 in value of c
        // d /= 5; // it will divide the value of d by 5
        // e %= 7; // it wil divide the value of e by 7 and gives the remainder if there
        // is
        // System.out.println("The value of is " + a );
        // System.out.println("The value of b is " + b );
        // System.out.println("The value of c is " + c );
        // System.out.println("The value of d is " + d );
        // System.out.println("The value of e is " + e );

        /***************************************************************************************************/
        // Comparision Operators

        // System.out.print(6==6); // == sign is used to compare LHS with RHS
        // System.out.println(64<65);

        /***************************************************************************************************/

        // // Logical operators
        // // we are using && or || or ! etc that are logical operator

        // // THIS IS " AND OPERATOR"
        // System.out.println(64<65 && 64<44); // if both the condisions are true then
        // //it will print true else flase

        // // THIS IS "OR OPERATOR"
        // System.out.println(64<65 || 64<44);// Any one condition need to be true
        /***************************************************************************************************/
        // // BITWISE OPERATORS
        
        // System.out.println(2&3);
        // /* 
        //    10
        //    11
        // --------
        //    10
        
        // */
        sc.close();
    }

}
