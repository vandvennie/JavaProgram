import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        while (num > 0) {
            System.out.println("num=" + num);
            num--;
        }
    }
}