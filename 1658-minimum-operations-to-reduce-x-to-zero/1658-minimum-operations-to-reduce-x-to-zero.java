class Solution {
    public int minOperations(int[] nums, int x) {
        int n=nums.length;
        int l=0;
        int s=0;
        int mx=-1;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int tar=sum-x;
        int va=0;
        for(int r=0;r<n;r++){
            va+=nums[r];
            while(l<=r&&va>tar){
                va-=nums[l];
                l++;
            }
            if(va==tar){
                mx=Math.max(mx,r-l+1);
            }
        }
        return mx==-1?-1:n-mx;
    }
}