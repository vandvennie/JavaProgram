//package lab.3.Exercise 2;
import java.util.Scanner;
import java.math.BigInteger;


public class Factorials {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);   
    System.out.println("Input a number which you want to know its factorials:");
    int num = sc.nextInt();
    double fac=1;
    if (num<18){
      for (int i=1; i<=num; i++){
          fac = fac * i;
          //System.out.println(fac);
      }
      System.out.println("The number "+ num+" is "+fac);
    } else {
      BigInteger bi = BigInteger.ONE;
      for (int i = 1; i <= num; i++) {
        bi = bi.multiply(BigInteger.valueOf(i));
      }
    System.out.println("The number "+ num+" is "+bi);
    }
  }
}
