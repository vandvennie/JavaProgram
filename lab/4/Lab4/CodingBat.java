public class CodingBat {
    public boolean twoTwo(int[] nums) {
    int len = 0;
    for (int i = 0; i < nums.length; ++i) {
        if (nums[i] == 2) {
            ++len;
        } else if (len == 1)
            return false;
        else
            len = 0;
        }
        return len != 1;
    }

    public boolean no14(int[] nums) {
        boolean one = false, four = false;
        for (int num : nums) {
            if (num == 1) one = true;
            if (num == 4) four = true;
        }
        return !one || !four;
    }

    public int countEvens(int[] nums) {
        int cnt = 0;
        for (int num : nums) if (num%2 == 0) ++cnt;
        return cnt;
    }
}