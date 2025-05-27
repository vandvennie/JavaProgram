import java.util.Scanner;
public class EmptyForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (; x > 0; --x)
            System.out.println("x=" + x);
    }
}