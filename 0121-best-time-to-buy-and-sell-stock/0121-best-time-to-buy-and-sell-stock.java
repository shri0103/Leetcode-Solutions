class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[] max=new int[n];
        int mx=Integer.MIN_VALUE;
        int ans=0;
        for(int i=n-1;i>=0;i--){
            mx=Math.max(mx,prices[i]);
            max[i]=mx;
   
        }
        for(int i=0;i<n;i++){
            ans=Math.max(max[i]-prices[i],ans);
        

        }
        return ans;
    }
}