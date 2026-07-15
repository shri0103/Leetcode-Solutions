class Solution {
    public int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public int gcdOfOddEvenSums(int n) {
        int sumodd=0;
        int sumeven=0;
       
        for(int i=1;i<=2*n;i++){
            if(i%2==0){
                sumeven+=i;
            }else{
                sumodd+=i;
            }

        }
        return gcd(sumeven,sumodd);
        
    }
}