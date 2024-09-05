//Create a simple number guessing game where the computer generates a random number between 1 and 100,
// and the user tries to guess it. The program should provide hints like "Too high" or "Too low" after each guess.

import java.util.Scanner;

public class MiniGames {
    public static void main(String[] args) {

        int count = 0;
        int secretNumber = 1 + (int)(100 * Math.random());

        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess a number between  1 to 100 :");


        while (true) {
            int guess = scanner.nextInt();
            count++;
            if (guess == secretNumber) {
                System.out.println("You Correct!");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Too Low, Try Again");
            } else if (guess > secretNumber) {
                System.out.println("Too High, Try Again");
            }
        }
            System.out.println("Your Total Attempt: " + count);
            System.out.println("Your Secret Number: " + secretNumber);
    }
}