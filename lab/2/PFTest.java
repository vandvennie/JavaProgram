import java.util.Scanner;
public class PFTest {
  public static void main(String[] args) {
    PrimeFinder pf = new PrimeFinder();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = sc.nextInt();
    System.out.println("Is prime? " + pf.isPrime(num));
        
    sc.close();
    
  }
}