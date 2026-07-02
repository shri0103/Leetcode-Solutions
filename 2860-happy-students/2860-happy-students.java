import java.util.*;

class Solution {
    public int countWays(List<Integer> nums) {
        Collections.sort(nums);

        int n = nums.size();
        int ans = 0;

      
        if (nums.get(0) > 0)
            ans++;

        for (int k = 1; k < n; k++) {
            if (nums.get(k - 1) < k && nums.get(k) > k)
                ans++;
        }


        if (nums.get(n - 1) < n)
            ans++;

        return ans;
    }
}