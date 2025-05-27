import java.util.Scanner;

public class ArrayException {
    public static void main(String[] args) {
        int[] a = {882, 2, 11};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index: ");
        int index = sc.nextInt();
        System.out.println(a[index]);
    }
}