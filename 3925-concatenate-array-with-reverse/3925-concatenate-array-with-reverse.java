class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int[] arr = new int[2 * n];

        // Copy original array
        System.arraycopy(nums, 0, arr, 0, n);

        // Copy reverse
        for (int i = 0; i < n; i++) {
            arr[n + i] = nums[n - 1 - i];
        }

        return arr;
    }
}