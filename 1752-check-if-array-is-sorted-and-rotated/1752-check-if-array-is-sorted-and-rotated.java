class Solution {
    public boolean check(int[] nums) {
        int[] arr=  nums.clone();
        Arrays.sort(arr);
        int l=0;
      boolean same = true;
       
        while(l<nums.length){
            int temp=nums[0];
            for(int i=1;i<nums.length;i++){
            nums[i-1]=nums[i];
            
        }
        nums[nums.length-1]=temp;
        same=true;
for(int i = 0; i < nums.length; i++) {
    if(arr[i] != nums[i]) {
        same = false;
        break;
    }
}

if(same) {
    break;
}
        l++;
                }

              return same;
        
    }
}