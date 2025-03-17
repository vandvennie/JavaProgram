import java.util.Scanner;
public class Callservice {
  public static void main(String[] args) {
    //build an object and use the Scanner Class
    Scanner sc = new Scanner(System.in);

    System.out.println("please choose a service you need:");
    //receive data and assign to i
    int i1 = sc.nextInt();
    switch (i1) {
      case 1 -> System.err.println("You have chosen the Tallest service.");
      case 2 -> System.err.println("You have chosen the Weeks service.");
      case 3 -> System.err.println("You have chosen the ScannerDemo service.");
      default -> System.err.println("Invalid input.");
    }
  }
}