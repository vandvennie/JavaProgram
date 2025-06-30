import java.util.ArrayList;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int count = nums1.length+nums2.length;
        ArrayList<Integer> combine =new ArrayList<>();
        double median;

        if (combine.size()< count){
          int current=nums1[0];
          for (int i =0; i<nums1.length; i++){
            for (int j =0; j<nums2.length; j++){
              current = (nums1[i]<nums2[j]) ? nums1[i]: nums2[i];
              combine.add(current);
            }
          }
        }

        if (count%2 == 0){
          int m = count/2;
          if (nums1.length>m+1) {
            median= (nums1[m-1]+nums1[m])/2;
          }else if (nums1.length>=m){
            median= (nums1[m-1]+nums2[m])/2;
          }
        }
    }
}
public class H1FindMedianSortedArrays {
  
}
