// import java.util.Scanner;
public class Ch_04_02_logical_op {
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
    //     System.out.println("For logical AND......");
    //     boolean a = true;
    //     boolean b = true;
    //     if(a && b){ // for && to be ture all should be ture
    //         System.out.println("Y");
    //     }
    //     else{
    //         System.out.println("N");
    //     }
    // }

    System.out.println("For logical OR......");
    boolean c = true;
    boolean d = false;
    if(c || d){ // for || to be ture atleast one should be ture
        System.out.println("Y");
    }
    else{
        System.out.println("N");
    }

    System.out.println("For Logical NOT.....");
    // make true --> false or vice versa
    System.out.print("Not(c) is ");
    System.out.println(!c);
    System.out.print("Not(d) is ");
    System.out.println(!d);


}
}
