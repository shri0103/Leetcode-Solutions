class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int a=nums.length;
        int n=nums[0]*nums[1];
        int s=nums[a-1]*nums[a-2];
        return Math.abs(n-s);

        
    }
}