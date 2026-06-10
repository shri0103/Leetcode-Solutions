class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        StringBuilder sb=new StringBuilder();
        int ct=0;
        for(int num:nums){
            sb.append(num);
        }
        for(int e=0;e<sb.length();e++){
            int num=sb.charAt(e)-'0';
            if(num==digit){
                ct++;
            }
        }
        

        return ct;
        
    }
}