no14

Given an array of ints, return true if it contains no 1's or it contains no 4's.


no14([1, 2, 3]) → true
no14([1, 2, 3, 4]) → false
no14([2, 3, 4]) → true

code:
public boolean no14(int[] nums) {
  int tag1=0,tag4=0;
  for (int num : nums) {
    if (num == 1){
      tag1 = 1;
      continue;
    }
    if (num == 4){
      tag4 = 1;
      continue;
    }
  }
  if (tag1 ==1 && tag4 ==1){
    return false;
  }
  return true;
}
