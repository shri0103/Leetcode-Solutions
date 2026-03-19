class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        // m=grid[0].length;
        // int total=m*n;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            int newpos=(i+k)%n;
            res[newpos]=nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=res[i];
        }
        // return nums;
    }
}