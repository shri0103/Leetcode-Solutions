class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int cnt=0;
        for(int i=0;i<words.length;i++){
            boolean flag=true;
            char[] ch=words[i].toCharArray();
            for(char c:ch){
                if(allowed.indexOf(c)==-1){
                    flag=false;
                    break;
                }
            }
            if(flag){
                cnt++;
            }
        }
        return cnt;
    }
}