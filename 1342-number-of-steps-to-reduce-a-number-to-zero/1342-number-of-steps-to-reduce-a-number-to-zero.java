class Solution {
    public int numberOfSteps(int num) {
        int c=0;
        int cnt=0;
        while(num>0){
            if(num%2==0){
                c=num/2;
                num=c;
            }else{
                c=num-1;
                num=c;
            } cnt++;
        }return cnt;
        
    }
}