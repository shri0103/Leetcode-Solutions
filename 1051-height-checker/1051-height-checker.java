class Solution {
    public int heightChecker(int[] heights) {
        int[] clone=heights.clone();
        Arrays.sort(heights);
        int cnt=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=clone[i]){
                cnt++;

            }
            
        }
        return cnt;
        
    }
}