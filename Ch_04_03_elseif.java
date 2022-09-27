import java.util.Scanner;
public class Ch_04_03_elseif {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         System.out.println("Please enter your age");
        int age = sc.nextInt();
        if(age>56){
            System.out.println("You are experienced!");
        }
        else if(age>46){
            System.out.println("You are semi experienced!");
        }
        else if(age>36){
            System.out.println("You are semi semi experienced!");
        }
        else{
            System.out.println("You are not experienced!");
        }





        sc.close();
    }
    
}
