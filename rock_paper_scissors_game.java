import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissors_game {
    public static void main(String[] args) {
        // 0 for Rock
        // 1 for Paper
        // 2 for Scissor

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 0 for Rock, 1 for Paper, 2 for Scissor ");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if(userInput==0){
            System.out.println("Your choice: Rock");
        }
        else if(userInput==1){
            System.out.println("Your choice: Paper");
        }
        else if(userInput==2){
            System.out.println("Your choice: Scissors");
        }

// System.out.println("Computer choice: " + computerInput);
        if(computerInput==0){
            System.out.println("Computer choice: Rock");
        }
        else if(computerInput==1){
            System.out.println("Computer choice: Paper");
        }
        else if(computerInput==2){
            System.out.println("Computer choice: Scissors");
        }
        if (userInput == computerInput) {
            System.out.println("Draw");
        }
        else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0
                || userInput == 2 && computerInput == 1) {
            System.out.println("You Win!");
        } else {
            System.out.println("Computer Win!");
        }
        
       
        
        sc.close();

        }
    }
