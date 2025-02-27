import java.util.Scanner;
public class ScannerDemo {

  public static void main(String[] args) {
    //build an object and use the Scanner Class
    Scanner sc = new Scanner(System.in);

    System.out.println("please input the first whole number:");
    //receive data and assign to i
    int i1 = sc.nextInt();
    System.out.println("please input the second whole number:");
    int i2 = sc.nextInt();

    System.out.println("the total of two numbers is: " + (i1 + i2));
  }
}