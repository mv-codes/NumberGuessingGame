import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;

        //System.out.println(randomNumber);


        System.out.println("Enter Your Guess (1 - 100): ");

         while (true) {
             int playerGuess = input.nextInt();

             if (playerGuess == randomNumber) {
                 System.out.println("CORRECT! YOU WIN");
                 break;
             } else if (randomNumber < playerGuess) {
                 System.out.println("GUESS IS TOO HIGH");
             } else {
                 System.out.println("GUESS IS TOO LOW");
             }

         }





    }
}
