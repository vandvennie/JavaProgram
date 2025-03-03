import java.util.Scanner;
public class Quotientsremainders {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please input a dividend integer:");
    int dividend  = sc.nextInt();
    System.out.println("Please input a divisor integer:");
    int divisor = sc.nextInt();
    int q = 0;
    int r = dividend;
    while (r > divisor) {
      r = r - divisor;
      q++;
    }
    System.out.println("Quotient: " + q +" or "+ (dividend / divisor));
    System.out.println("Remainder: " + r +" or "+ (dividend % divisor));
  }
}
