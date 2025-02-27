import java.util.Scanner;
public class Number6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please input the first whole number:");
    int number1 = sc.nextInt();
    System.out.println("Please input the second whole number:");
    int number2 = sc.nextInt();

    if (number1 == 6 || number2 ==  6 || (number1 + number2) % 6 == 0 ) {
      System.out.println("Number 6 is a great number.");
    } else {
      System.out.println("Those numbers are not the great number 6.");
    }
  }
}
