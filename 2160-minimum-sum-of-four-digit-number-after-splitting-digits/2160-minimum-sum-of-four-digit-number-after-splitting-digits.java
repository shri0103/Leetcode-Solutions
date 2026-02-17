class Solution {
    public int minimumSum(int nums) {
        int []digits=new int[4];
        for(int i=0;nums!=0;i++){
            digits[i]=nums%10;
            nums/=10;
        }
        Arrays.sort(digits);
        return 10*(digits[0]+digits[1])+digits[2]+digits[3];
    }
}