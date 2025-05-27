import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        for (;;) {
            int num = sc.nextInt();
            if (num < 1)
                break;
            boolean isPrime = true;
            for (int d = 2; d < num; ++d) {
                if (num % d == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.println(num + " is prime");
            else
                System.out.println(num + " is not prime");
        }
    }
}