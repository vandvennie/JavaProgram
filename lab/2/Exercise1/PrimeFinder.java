public class PrimeFinder {
  public boolean isPrime(int num) {
    if (num <= 1) {
      return false;
    }
    if (num == 2) {
      return true;
    }
    for (int i=2; i<num; i++) {
      if (num % i == 0) {
        return false;
      } 
    }
    return true;
  }
  //second method to count the number of prime numbers between two numbers
  public int countPrimes(int start, int end){
    int count = 0;
    if (start > end) {
      System.out.println("Start number must be less than end number.");
      return -1;}
    //for 循环的初始化部分（第一个分号前）不能直接写变量，需要重新赋值：
    for (int i = start; i <= end; i++) {
      if (isPrime(i)) {
        count++;
      }
    }
    return count;
  }

}
