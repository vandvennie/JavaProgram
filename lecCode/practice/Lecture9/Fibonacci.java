public class Fibonacci {
    public int fib(int n){
        if (n>0 && n<=2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        int result = f.fib(10);
        System.out.println(result);
    }
}