class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int total = row * col;
        int MOD = 12345;


        int[] flat = new int[total];
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                flat[i * col + j] = grid[i][j];

   
        int[] result = new int[total];
        result[0] = 1;
        for (int i = 1; i < total; i++)
            result[i] = (int)((long)result[i - 1] * flat[i - 1] % MOD); 
        int right = 1;
        for (int i = total - 1; i >= 0; i--) {
            result[i] = (int)((long)result[i] * right % MOD);
            right = (int)((long)right * flat[i] % MOD);
        }


        int[][] output = new int[row][col];
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                output[i][j] = result[i * col + j];

        return output; 
    }
}
