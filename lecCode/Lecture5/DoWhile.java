import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean answer; // Note that this variable is declared outside the loop.
        do {
            System.out.print("Are you ready for this program to end? Enter true or false: ");
            answer = scanner.nextBoolean();
        } while (!answer);
    }
}