class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int leftsum=0;
        int rightsum=0;
        int[] answer=new int[n];
        int[] prefixsum=new int[n];
        for(int val:nums){
            rightsum+=val;
        }
        for(int i=0;i<n;i++){
            rightsum-=nums[i];
            answer[i]=(int)Math.abs(leftsum-rightsum);
            leftsum+=nums[i];


            
        }
        return answer;
        
    }
}