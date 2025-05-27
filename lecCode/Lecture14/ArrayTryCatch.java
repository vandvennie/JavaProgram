import java.util.Scanner;

public class ArrayTryCatch {
    public static void main(String[] args) {
        int[] a = {882, 2, 11};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index: ");
        int index = sc.nextInt();
        try {
            System.out.println(a[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException");
        }
    }
}