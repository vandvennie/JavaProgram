import java.util.Scanner;
public class Histogram {
  public static void main(String[] args) {
    int[] histogram = new int[11]; // Create the array. Note that the size is 11, from 0-10
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter numbers between 1 and 10. Until a non-intege the char will be shown");
    while (sc.hasNextInt()) { // Loop until the user enters something that is not an integer
      int n = sc.nextInt();
      if (n < 1 || n > 10) {
        System.out.println("Invalid number: " + n + ". Enter a number between 1 and 10.");
        continue; // Skip invalid numbers
      }
      histogram[n]++; // 数组histogram[]中第n个数据 值自加；eg。histogram[5] = 2++
    }
    for (int i = 1; i < histogram.length; i++) { // Goes from 1 to 10，0不被使用
      System.out.print(i + ": ");
      for (int j = 0; j < histogram[i]; j++)
        System.out.print("*"); // 同行打印.print() is used instead of .println() to print on the same line
      System.out.println(); // End the line换行
    }
  }
}
