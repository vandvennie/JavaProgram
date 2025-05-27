import java.util.Scanner;

public class Switch3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        // Count of numbers >= num
        int countGtEq = 0;
        // Leaving out break can be useful for grouping cases together
        switch (num) {
            case 1:
                countGtEq++;
            case 2:
                countGtEq++;
            case 3:
                countGtEq++;
            case 4:
                countGtEq++;
            // default is optional
        }
        System.out.println("countGtEq=" + countGtEq);
    }
}