class Solution {
    public int maxDistinct(String s) {
        boolean[] seen=new boolean[26];
        int count=0;
        for (char c:s.toCharArray()){
            int idx=c-'a';
            if(!seen[idx]){
                seen[idx]=true;
                 count++;
            }
           
        }return count;
    }
}