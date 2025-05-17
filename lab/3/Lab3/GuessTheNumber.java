import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int secretNumber = new Random().nextInt(100) + 1;
        System.out.println("I am thinking of a number between 1 and 100. Guess what it is.");
        Scanner scanner = new Scanner(System.in);
        int guess;
        do {
            guess = scanner.nextInt();
            if (guess < secretNumber)
                System.out.println("Too low. Guess again.");
            else if (guess > secretNumber)
                System.out.println("Too high. Guess again.");
        } while (guess != secretNumber);
        System.out.println("Correct!");
    }
}