class Solution {
    public int mirrorDistance(int n) { 
        int digit=0;
        int temp=n;
        int rev=0;       
        while(n>0){
             digit=n%10;
             rev=rev*10+digit;
             n/=10;            
        }
       return  Math.abs(temp-rev);

        
    }
}