class Solution {
    public long removeZeros(long n) {
        String num=String.valueOf(n);
        String r=num.replace("0","");
        return Long.parseLong(r);
    }
}