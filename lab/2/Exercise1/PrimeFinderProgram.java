import java.util.Scanner;
public class PrimeFinderProgram {
  public static void main(String[] args) {
    PrimeFinder pf = new PrimeFinder();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = sc.nextInt();
    System.out.println("Is prime? " + pf.isPrime(num));
        
  

    //use second method to count
    PrimeFinder count = new PrimeFinder();
    System.out.println("Count the number of prime numbers between two numbers.");
    System.out.println("Enter a start number: ");
    int numS = sc.nextInt();
    System.out.println("Enter a end number: ");
    int numE = sc.nextInt();
  
    System.out.println("There are " + count.countPrimes(numS, numE)+" prime numbers between "+numS+" and "+numE); 
    //sc.close();
  }
  
}