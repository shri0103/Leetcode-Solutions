class Solution {
    public int minPartitions(String n) {
        int k=0;
        for(char x:n.toCharArray()){
            if(k<(x-'0')){
                k=(x-'0');
            }
            if(x=='9')return 9;
        }
        return k;
    }
}