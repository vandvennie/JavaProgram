import java.util.Scanner;
public class Weeks {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please input the number of weeks:");
    int weeks = sc.nextInt();
    switch (weeks) {
      case 1,2,3,4,5 -> System.err.println("It's a weekday.");
      case 6,7 -> System.err.println("It's a weekend.");
      default -> System.err.println("Invalid input.");
    }
  } 
} 
