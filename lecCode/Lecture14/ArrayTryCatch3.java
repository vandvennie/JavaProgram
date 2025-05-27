import java.util.Scanner;

public class ArrayTryCatch3 {
    public static void main(String[] args) {
        int[] a = {882, 2, 11};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index: ");
        try {
            int index = sc.nextInt();
            System.out.println(a[index]);
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e);
        }
    }
}