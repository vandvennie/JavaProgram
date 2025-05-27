import java.util.Scanner;
import java.util.InputMismatchException;

public class ArrayTryCatch2 {
    public static void main(String[] args) {
        int[] a = {882, 2, 11};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index: ");
        try {
            int index = sc.nextInt();
            System.out.println(a[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException");
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid integer next time");
        }
    }
}