class Solution {
    public int countEven(int num) {
        int count=0;
         for(int i=1;i<=num;i++){
            int sum = shrii(i);
            if(sum%2 == 0){
                count++;
            }
          }
        return count;
    }

    private int shrii(int k){
        
        if(k < 10){
            return k;
        }

        int s=0;
        
        while(k > 0){
            s += k%10;
            k /= 10;
        }
        return s;
    }
}