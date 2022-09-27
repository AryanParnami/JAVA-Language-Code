import java.util.Scanner;
public class Ps_04_03_income_tax {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float tax = 0;
        System.out.print("Please enter your yearly income : ");
        float income = sc.nextFloat();
        if (income<=250000) {
            tax = tax + 0;
        }
        else if (income>250000 && income<=500000) {
            tax = tax + 0.05f * (income - 250000);
        }
       else if (income>500000 && income<=1000000) {
            tax = tax + 0.05f * (500000 - 250000);
            tax = tax + 0.2f * (income - 250000);
        }
        else if (income>1000000 ) {
            tax = tax + 0.05f * (250000);
            tax = tax + 0.2f * (1000000 - 250000);
            tax = tax + 0.3f * (income - 1000000);

        }
        System.out.print("The total Tax paid by the employee is : \nRs."+tax);

        sc.close();
    }
    
}
