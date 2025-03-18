import java.util.Scanner;
public class PFCount {
  public static void main(String[] args) {
    PrimeFinderProgram count = new PrimeFinderProgram();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a start number: ");
    int numS = sc.nextInt();
    System.out.println("Enter a end number: ");
    int numE = sc.nextInt();
  
    System.out.println("There are " + count.countPrimes(numS, numE)+" prime numbers between "+numS+" and "+numE); 
    sc.close();
  }
}
