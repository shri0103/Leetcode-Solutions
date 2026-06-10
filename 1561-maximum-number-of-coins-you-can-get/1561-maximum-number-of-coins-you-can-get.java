import java.util.Arrays;

class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);

        int ans = 0;
        int n = piles.length;

        int left = 0;
        int right = n - 1;

        while (left < right) {
            right--;              // Alice takes largest
            ans += piles[right];  // You take second largest
            right--;
            left++;               // Bob takes smallest
        }

        return ans;
    }
}