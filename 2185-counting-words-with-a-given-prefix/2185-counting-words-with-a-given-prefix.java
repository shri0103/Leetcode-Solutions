class Solution {
    public int prefixCount(String[] words, String pref) {
        int cnt=0;
        for(String wd:words){
            if(wd.startsWith(pref)){
                cnt++;
            }
        }
        return cnt;
        
    }
}