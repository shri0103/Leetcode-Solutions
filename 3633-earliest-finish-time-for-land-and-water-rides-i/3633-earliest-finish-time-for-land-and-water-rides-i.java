class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++){
            for(int j=0;j<waterStartTime.length;j++){


                int landfinish=landStartTime[i]+landDuration[i];
                int finishlw=Math.max(landfinish,waterStartTime[j])+waterDuration[j];


                int waterfinish=waterStartTime[j]+waterDuration[j];
                int finishwl=Math.max(waterfinish,landStartTime[i])+landDuration[i];

                 ans=Math.min(ans,Math.min(finishlw,finishwl));
            }

        }
        return ans;
    }
}