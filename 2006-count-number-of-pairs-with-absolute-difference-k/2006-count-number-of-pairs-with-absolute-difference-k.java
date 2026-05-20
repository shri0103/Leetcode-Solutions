class Solution {
    public int countKDifference(int[] nums, int k) {
        int abs=0;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                abs=Math.abs(nums[i]-nums[j]);
                if(abs==k){
                    cnt++;

                }

            }
        }return cnt;
        
    }
}