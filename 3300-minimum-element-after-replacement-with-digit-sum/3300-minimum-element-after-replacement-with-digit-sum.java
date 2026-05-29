class Solution {
    public int minElement(int[] nums) {
        int minvalue=Integer.MAX_VALUE;
        for(int num:nums){
            int sum=0;
            int temp=num;
            while(temp!=0){
                sum+=temp%10;
                temp/=10;
                
            }minvalue=Math.min(minvalue,sum);

        }
        return minvalue;
        
    }
}