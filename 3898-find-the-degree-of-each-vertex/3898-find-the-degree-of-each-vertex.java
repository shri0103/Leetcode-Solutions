class Solution 
{
    public int[] findDegrees(int[][] matrix) 
    {
        int n=matrix.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                    c+=matrix[i][j];
            }
            ans[i]=c;
        }
        return ans;
    }
}