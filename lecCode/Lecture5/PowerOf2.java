import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int pow = 1;
        while (pow <= num) {
            pow *= 2;
        }
        System.out.println("The first power of 2 greater than your number is " + pow);
    }
}