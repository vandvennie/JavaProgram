twoTwo
Given an array of ints, return true if every 2 that appears in the array is next to another 2.

twoTwo([4, 2, 2, 3]) → true
twoTwo([2, 2, 4]) → true
twoTwo([2, 2, 4, 2]) → false

code：
//注意 ｜｜符号 一真为真；全假为假
public boolean twoTwo(int[] nums) {
 
  for(int i=0; i< nums.length; i++){
    if (nums[i] ==2){
      boolean hasNeib = (i>0 && nums[i-1] == 2) || (i < nums.length-1 && nums[i+1] == 2);
      if (!hasNeib) {
       return false;
      }
    }
  }  
  return true;
    
}
