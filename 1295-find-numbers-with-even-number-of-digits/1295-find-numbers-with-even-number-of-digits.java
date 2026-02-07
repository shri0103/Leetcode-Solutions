class Solution {
    public int findNumbers(int[] nums) {
      int count=0;
     for(int num:nums ){
        int digitcount=String.valueOf(num).length();
        if(digitcount%2==0){
            count++;
        }
     } 
     return count;
    
}}