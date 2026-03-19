class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int total=m*n;
        int[][] res=new int[m][n];
        List<List<Integer>> fine=new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int pos=(i*n+j+k)%total;
                int rowpos=pos/n;
                int colpos=pos%n;
                res[rowpos][colpos]=grid[i][j];
            }
        }
        for(int[] ans:res){
            List<Integer> temp=new ArrayList<>();
            for(int val:ans){
                temp.add(val);
                
            }fine.add(temp);

        }return fine;
    }
}