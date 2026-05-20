class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int digits=0;
        for(int num:nums){
            
            while(num!=0){
                digits+=Math.abs(num%10);
                num/=10;
            }

        }
        return Math.abs(sum-digits);
        
    }
}