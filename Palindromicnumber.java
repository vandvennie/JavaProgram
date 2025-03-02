import java.util.Scanner;
public class Palindromicnumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please input an integer:");
    //1221
    int n = sc.nextInt();
    int on = n;
    int right;
    int rn = 0;
    //split input number
    // get the reversed number
    while (n>0) {
      right = n % 10;
      n = n / 10;
      rn = rn * 10 + right;
    }

    if (on == rn){
      System.out.println(rn + " this is a palindromic number");
    } else {
      System.out.println(rn + " this is not a palindromic number");
    }
  }

}