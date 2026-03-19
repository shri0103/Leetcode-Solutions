class Solution {
    public boolean isStrictlyPalindromic(int n) {
        String binary="";
        while(n>0){
            binary=(n%2)+binary;
            n=n/2;
        }
        String temp=new StringBuilder(binary).reverse().toString();
        if(binary==temp){
            return true;
        }
        return false;
    }
}