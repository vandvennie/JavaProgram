import java.util.Scanner;
public interface Forloop {
  public static void main(String[] args) {
    //build an object and use the Scanner Class
    Scanner sc = new Scanner(System.in);
    System.out.println("please input the first whole number:");
    //receive data and assign to i
    int start = sc.nextInt();
    System.out.println("please input the second whole number:");
    int end = sc.nextInt();
    int count = 0;
    // for loop
    for (int i = start; i <= end; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        count ++;
      }
    }
    System.out.println("total is: " + count);
  }
}
