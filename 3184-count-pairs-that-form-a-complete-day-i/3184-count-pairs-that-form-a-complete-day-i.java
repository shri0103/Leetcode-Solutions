class Solution {
    public int countCompleteDayPairs(int[] hours) {
        int n=hours.length;
        int cnt=0;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                sum=hours[i]+hours[j];
                if(sum%24==0){
                    cnt++;
                }

            }
            
        
    }
    return cnt;
 }
}