class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] result=new int[m - k + 1][n - k + 1];
       
        for(int i=0;i<=m-k;i++){
            for(int j=0;j<=n-k;j++){
                 List<Integer> value=new ArrayList<>();
                 for(int r=i;r<i+k;r++){
                    for(int c=j;c<j+k;c++){
                        value.add(grid[r][c]);
                    }
                 }
                 if(value.size()==1){
                    result[i][j]=0;
                    continue;
                 }
                 Collections.sort(value);
                 int mindiff=Integer.MAX_VALUE;
                 for(int x=0;x<value.size()-1;x++){
                     int diff = value.get(x + 1) - value.get(x);
                    if (diff == 0) continue;  
                    mindiff = Math.min(mindiff, diff);
                }
                 if (mindiff == Integer.MAX_VALUE) mindiff = 0;
                 result[i][j]=mindiff;

            }
        }
        return result;
       
        
    }
}