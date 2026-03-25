class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int n = grid.length;      
        int m = grid[0].length;   

        long total = 0;
        for (int[] row : grid)
            for (int val : row)
                total += val;     


        long prefix = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < m; j++)
                prefix += grid[i][j];
            if (prefix == total - prefix)  
                return true;
        }

        prefix = 0;
        for (int j = 0; j < m - 1; j++) {
            for (int i = 0; i < n; i++)
                prefix += grid[i][j];
            if (prefix == total - prefix) 
                return true;
        }

        return false;  
    }
}