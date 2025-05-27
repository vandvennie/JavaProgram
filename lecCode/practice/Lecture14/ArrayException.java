import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayException {
    public static void main(String[] args) {
        int[] a = {882, 2, 11};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index: ");
        
        try {
            int index = sc.nextInt();
            System.out.println(a[index]);
        } catch (InputMismatchException e) {
            // TODO: handle exception
            System.err.println("Invalid input – please enter an integer."            );
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.err.println("Index out of bounds – please enter a value between 0 and 2.\n" );
        }
        sc.close();
    }
}