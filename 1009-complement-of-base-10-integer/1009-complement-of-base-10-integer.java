class Solution {
    public int bitwiseComplement(int n) {
        // String binary=Integer.toBinaryString(n);
        // int complement=~n;
        int temp=n;
        int mask=0;
        if(n==0) return 1;
        while(temp>0){
            mask=(mask<<1)|1;
            temp>>=1;

        }return n^mask;
    

    }
}