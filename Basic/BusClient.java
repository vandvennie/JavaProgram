public class BusClient {
/* start at 0
s1 +1
s2 +2,-1
s3 +2,-1
s4 -1
s5+1
final?
*/
  public static void main(String[] args) {
    int count = 0;
    count = count + 1;
    count = count + 2 - 1;
    count = count + 2 - 1;
    count = count - 1;
    count = count + 1;

    System.out.println(count); 

  }
  
}