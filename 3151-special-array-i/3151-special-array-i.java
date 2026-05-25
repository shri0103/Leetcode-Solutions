class Solution {
    public boolean isArraySpecial(int[] nums) {
        int[] arr=new int[2];
    for(int i=1;i<nums.length;++i){
        if(nums[i-1]%2==nums[i]%2){
            return false;
        }
    }return true;
        
    }
}