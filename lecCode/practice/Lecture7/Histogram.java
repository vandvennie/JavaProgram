import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        int[] histogram = new int[11]; // Create the array. Note that the size is 11, not 10
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers between 1 and 10.");
        while (sc.hasNextInt()) { // Loop until the user enters something that is not an integer
            int n = sc.nextInt();
            if (n < 1 || n > 10) {
                System.out.println("Invalid number: " + n + ". Enter a number between 1 and 10.");
                continue; // Skip invalid numbers
            }
            histogram[n]++; // Increment the counter for the number
        }
        for (int i = 1; i < histogram.length; i++) { // Goes from 1 to 10
            System.out.print(i + ": ");
            for (int j = 0; j < histogram[i]; j++)
                System.out.print("*"); // .print() is used instead of .println() to print on the same line
            System.out.println(); // End the line
        }
        sc.close(); // Close the scanner
    }
}