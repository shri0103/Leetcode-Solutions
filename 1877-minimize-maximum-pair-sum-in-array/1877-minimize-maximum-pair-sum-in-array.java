class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int max=Integer.MIN_VALUE;;
        int j=nums.length-1;
        int[] pairsum=new int[n];
        for(int y=0;y<n/2;y++){
            while(nums[y]<=nums[j]){
                 pairsum[y]=nums[y]+nums[j];
                 break;
            }
            j--;
        }
        Arrays.sort(pairsum);
        return pairsum[pairsum.length-1];
        
    }
}