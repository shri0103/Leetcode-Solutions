class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        double result=Double.MAX_VALUE;
        while(i<j){
            double  resultavg=(nums[i]+nums[j])/2.0;
             result=Math.min(result,resultavg);
             i++;
             j--;
             
        }
        return result;


        
    }
}