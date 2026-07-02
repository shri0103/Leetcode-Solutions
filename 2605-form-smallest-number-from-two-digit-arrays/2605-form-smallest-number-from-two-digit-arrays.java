class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int common = 10;

        for (int a : nums1) {
            for (int b : nums2) {
                if (a == b) {
                    common = Math.min(common, a);
                }
            }
        }

        if (common != 10) return common;

        int mn1 = 10, mn2 = 10;

        for (int x : nums1) mn1 = Math.min(mn1, x);
        for (int x : nums2) mn2 = Math.min(mn2, x);

        return Math.min(mn1 * 10 + mn2, mn2 * 10 + mn1);
    }
}