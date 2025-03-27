closeFar

Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a number.


closeFar(1, 2, 10) → true
closeFar(1, 2, 3) → false
closeFar(4, 1, 3) → true

Code:
public boolean closeFar(int a, int b, int c) {
  int cloN1 = a-b;
  int cloN2 = a-c;
  int farN = b-c;
  if (Math.abs(cloN1) <= 1 ) {
    if (Math.abs(farN) >=2 && Math.abs(cloN2) >=2){
      return true;
    } 
  }
    if (Math.abs(cloN2) <= 1){
      if (Math.abs(farN) >=2 && Math.abs(cloN1) >=2){
        return true;
    }
  } 

    return false;
}
