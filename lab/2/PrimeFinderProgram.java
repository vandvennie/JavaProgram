public class PrimeFinderProgram {
  PrimeFinder pf = new PrimeFinder();
  public int countPrimes(int start, int end){
    int count = 0;
    if (start > end) {
      System.out.println("Start number must be less than end number.");
      return -1;}
    //for 循环的初始化部分（第一个分号前）不能直接写变量，需要重新赋值：
    for (int i = start; i <= end; i++) {
      if (pf.isPrime(i)) {
        count++;
      }
    }
    return count;
  }
}
