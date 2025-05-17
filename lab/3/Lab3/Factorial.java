import java.util.Scanner;
import java.math.BigInteger;


public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        BigInteger factorial = BigInteger.ONE;
        for (int i = 2; i <= n; ++i)
            factorial = factorial.multiply(BigInteger.valueOf(i));
        System.out.println(n + "! = " + factorial);
    }
}