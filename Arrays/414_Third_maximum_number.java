class Solution {
    public int thirdMax(int[] nums) {
        int f=nums.length;
        Arrays.sort(nums);
        int k=1;
        for(int i=1;i<f;i++){
            if(nums[i]!=nums[i-1]){
                nums[k]=nums[i];
                k++;
            }
        }

        if(k<3){
            return nums[k-1];
        }
        else {
            return nums[k-3];
        }
        
    }
}