class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int count = nums1.length+nums2.length;
        int[] combine = new int[count];
        double median;

        if (nums1[0]<nums2[0]){
          for ()
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
