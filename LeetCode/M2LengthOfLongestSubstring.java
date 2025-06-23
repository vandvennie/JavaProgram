import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> stringMap= new HashMap<>();
        int maxLength = 0;
        int left =0;
        for (int right=0; right<s.length();right++){
            char c = s.charAt(right);
            if (stringMap.containsKey(c)){
                left = Math.max(left, stringMap.get(c)+1);//move left point to the newest
            }
            stringMap.put(s.charAt(right), right);
            maxLength = Math.max(maxLength, right - left +1);//keep update the max length
        }
        return maxLength;
    }
}
