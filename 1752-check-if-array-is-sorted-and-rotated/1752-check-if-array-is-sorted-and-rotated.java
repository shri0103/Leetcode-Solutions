class Solution {
    public boolean check(int[] nums) {
        int[] arr=  nums.clone();
        Arrays.sort(arr);
        int l=0;
       
        while(l<nums.length){
            int temp=nums[0];
            for(int i=1;i<nums.length;i++){
            nums[i-1]=nums[i];
            
        }
        nums[nums.length-1]=temp;
         boolean same = true;

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

                for(int i=0;i<nums.length;i++){

            System.out.print(nums[i]+" ");
                }
                for(int i=0;i<nums.length;i++){

                    if(arr[i]!=nums[i]) return false;
                }
       return true;
        
        
    }
}