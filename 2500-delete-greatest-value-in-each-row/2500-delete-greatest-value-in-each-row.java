class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
           for(int[] row:grid){
            Arrays.sort(row);
           }
           int ans=0;

           for(int col=n-1;col>=0;col--){
            int max=0;
            for(int i=0;i<m;i++){
                max=Math.max(max,grid[i][col]);
            }
            ans+=max;
           }

        return ans;
    }
}