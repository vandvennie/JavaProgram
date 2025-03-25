import java.util.Scanner;
import java.util.Random;

public class NumberGame {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rn = new Random();
    int randomNum = rn.nextInt(100)+1;//生成一个从 1到 100 之间的随机整数。
    System.out.println("Guess a number between 1 and 100: ");

    while(true){
      int guessNum = sc.nextInt();
      if (guessNum > randomNum) {
        System.out.println("Sorry, your number is too high! ");
      } else if (guessNum < randomNum) {
        System.out.println("Sorry, your number is too low! ");
      } else {
        System.out.println("Congratulation! Your number is correct! ");
        break;
      }
    }
  }
}
