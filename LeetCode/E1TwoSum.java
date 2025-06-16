import java.util.HashMap;
import java.util.Map;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> lookup = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            int diff = target-nums[i];
            if (lookup.containsKey(diff)){
                return new int[] {lookup.get(diff),i};
            }
            lookup.put(nums[i], i);
        }
        return null;
    }
}

public class E1TwoSum {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = sol.twoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");

    }
    
}