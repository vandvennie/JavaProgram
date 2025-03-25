//package lab.3.Exercise 2;
import java.util.Scanner;

public class Factorials {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input a number which you want to know its factorials:");
    int num = sc.nextInt();
    int fac=1;
    for (int i=1; i<=num; i++){
        fac = fac * i;
    }
    System.out.println("The number "+ num+" is "+fac);

  }
}
