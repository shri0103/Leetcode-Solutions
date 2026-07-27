class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max1 = 1,cnt=1;
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]<nums[i+1]) { cnt++; max1 = Math.max(max1,cnt); }
            else cnt =1;
        }
        return max1;
        
    }
}