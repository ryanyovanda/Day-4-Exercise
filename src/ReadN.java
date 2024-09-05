// Write a code that reads n number of input from scanner
//Example: 1 (press y to continue), 2 (press n to stop) → 1,2

import java.util.Scanner;

public class ReadN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        while (true) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            count++;

            System.out.print("Press 'y' to continue or 'n' to stop: ");
            String choice = sc.next();

            if (choice.equalsIgnoreCase("n")) {
                break;
            }
        }

        System.out.println("You entered " + count + " numbers.");
    }
}