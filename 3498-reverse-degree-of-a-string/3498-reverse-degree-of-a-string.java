class Solution {
    public int reverseDegree(String s) {
        int inx=1;
        int total=0;
        for(char ch:s.toCharArray()){
            int revpos=26-(ch-'a');
            total+=revpos*inx;
            inx++;
        }
        return total;
    }
}