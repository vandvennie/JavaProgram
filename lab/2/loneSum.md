loneSum
Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.


loneSum(1, 2, 3) → 6
loneSum(3, 2, 3) → 2
loneSum(3, 3, 3) → 0

code:
public int loneSum(int a, int b, int c) {
  int sum;
  if (a !=b && b!= c  && a!= c){
    return sum=a+b+c;
  } else if (a != b && b == c){
    return a;
  } else if (a == b && b!= c){
    return c;
  }else if (a == c && a!= b){
    return b;
  }else {
    return 0;
  }
  
}
