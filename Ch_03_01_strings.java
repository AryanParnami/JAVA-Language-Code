import java.util.Scanner;
public class Ch_03_01_strings {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
      //String name = new String("Aryan");// There are 2 methods to declare string
        String name = "Aryan"; 
        System.out.println(name);

        int a =3;
        float b = 32.34524154f;
        System.out.printf("The value of a is %d and value of b is %.2f \n",a,b);// helpfull for them who have done c language
        System.out.format("The value of a is %d and value of b is %f \n",a,b);

        String st = sc.nextLine();
        //System.out.print(st);
        System.out.printf("%s",st); // it you are using printf apply %d,%f,%c,%s



        sc.close();
    }
}