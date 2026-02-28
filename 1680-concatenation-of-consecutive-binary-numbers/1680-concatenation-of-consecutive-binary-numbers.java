class Solution{
    public int concatenatedBinary(int n){
        long a=0;
        for(int i=1;i<=n;i++)
        a=((a<<(32-Integer.numberOfLeadingZeros(i)))+i)%1000000007;
        return (int)a;}}