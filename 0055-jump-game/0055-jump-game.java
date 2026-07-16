class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int stepleft=nums[0];
        for(int i=1;i<n;i++){
           stepleft--;
           if(stepleft<0) return false;
            if(i==n-1 ) return true;
            if(stepleft<nums[i]){
            stepleft=nums[i];
           }
            
        }
        return true;
    }
}