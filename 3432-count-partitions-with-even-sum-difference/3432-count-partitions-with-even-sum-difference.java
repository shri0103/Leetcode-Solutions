class Solution {
    public int countPartitions(int[] nums) {
        int n=nums.length;
        int sum=0;
        for( int i=0;i<n;i++){
            sum+=nums[i];
        }
        int leftsum=0;
        int cnt=0;
        for(int i=0;i<nums.length-1;i++){
            leftsum+=nums[i];
            int rightsum=sum-leftsum;
            if((leftsum%2)==(rightsum%2)){
                cnt++;
            }
        }return cnt;
        
        
    }
}